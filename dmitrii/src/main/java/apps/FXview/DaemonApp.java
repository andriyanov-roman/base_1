package apps.FXview;

import apps.FXview.helpers.CloseWindow;
import apps.FXview.helpers.TableViewHelper;
import apps.FXview.leftsidebar.LeftSideBarController;
import apps.FXview.login.LoginFormController;
import apps.FXview.login.User;
import apps.FXview.overview.OverviewController;
import apps.FXview.overview.OverviewHelper;
import apps.FXview.topmenu.TopMenuController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import static apps.FXview.helpers.IdURLFinder.getDaemonURL;

/**
 * Created by mit_OK! on 28.04.2015.
 */
public class DaemonApp extends Application {
    private Stage mainBackgroundStage;
    private Stage stage;
    private Scene scene;
    private BorderPane rootLayout;
    private Label alertNODE = new Label();
    private GridPane loginPane;
    private User currentUser;
    private Boolean reLogin;

    public Stage getMainBackgroundStage() {
        return mainBackgroundStage;
    }
    public Scene getScene() {
        return scene;
    }
    public Stage getStage() {
        return stage;
    }
    public BorderPane getRootLayout() {
        return rootLayout;
    }
    public Label getAlertNODE() {
        return alertNODE;
    }
    public void setAlertNODE(Label alertNODE) {
        this.alertNODE = alertNODE;
    }
    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    public void setReLogin(Boolean reLogin) {
        this.reLogin = reLogin;
    }
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) {
        do {
            if (login()){
                try {
                    this.mainBackgroundStage = stage;
                    runDaemonApp();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } while (reLogin);
    }
    public Boolean login (){
        Stage loginStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getDaemonURL("login/LoginForm.fxml"));
        try {
            loginPane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        LoginFormController controller = loader.getController();
        controller.load(loginPane, this);
        loginStage.setScene(new Scene(loginPane));
        loginStage.showAndWait();
        return controller.getIsAuthorized();
    }
    private void runDaemonApp () throws IOException {
        reLogin = false;
        rootLayout = new BorderPane();
        rootLayout.setTop(loadTopMenu());
        rootLayout.setLeft(loadLeftSideBar());
        rootLayout.setCenter(FXMLLoader.load(getDaemonURL("CenterDefault.fxml")));// LOAD CENTER PANEL (IMAGE)
        rootLayout.setBottom(loadAlertPane());
        //=========  LOAD CSS / STYLES ==============
        rootLayout.getStyleClass().add("black-bg");
        scene = new Scene(rootLayout, 600, 400);
        scene.getStylesheets().add("daemon-style.css");
        stage = new Stage();
        stage.setTitle("The united application launching");
        stage.setScene(scene);
        stage.showAndWait();
    }

    private GridPane loadLeftSideBar() {
        //================== LOAD LEFT SIDEBAR ===========
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getDaemonURL("leftsidebar/LeftSideBar.fxml"));
        GridPane leftSideBar = null;
        try {
            leftSideBar = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        LeftSideBarController controller = loader.getController();
        controller.setMainApp(this);
        return leftSideBar;
    }

    private MenuBar loadTopMenu() {
        // =============== LOAD TOP MENU =================
        FXMLLoader topMenuLoader = new FXMLLoader();
        topMenuLoader.setLocation(getDaemonURL("topmenu/TopMenu.fxml"));
        MenuBar topMenu = null;
        try {
            topMenu = topMenuLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        TopMenuController topMenuController = topMenuLoader.getController();
        topMenuController.load(topMenu, currentUser,this);
        return topMenu;
    }

    private Node loadAlertPane(){// It situates on BOTTOM
        //================== LOAD BOTTOM ALERT PANE========
        HBox bottomAlertPane = new HBox();
        alertNODE.getStyleClass().add("warning");
        bottomAlertPane.getChildren().add(alertNODE);
        bottomAlertPane.setAlignment(Pos.CENTER);
        bottomAlertPane.setPrefHeight(50);
        return bottomAlertPane;
    }
    public void showInNewWindow (String windowTitle, Parent eatForScene){
        Scene newWindowScene = new Scene(eatForScene);////////// ERROR HERE!!!
        Stage newWinStage = new Stage();
        newWinStage.setTitle(windowTitle);
        newWinStage.initModality(Modality.WINDOW_MODAL);
        newWinStage.initOwner(stage);
        newWinStage.setScene(newWindowScene);
        newWinStage.showAndWait();
    }
    public void showEntity (OverviewHelper<?> helper){
        VBox mainPlaceHolder = null;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getDaemonURL("overview/Overview.fxml"));
        try {
            mainPlaceHolder = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        OverviewController controller = loader.getController();
        controller.setMainPlaceHolder(mainPlaceHolder);
        controller.renderEntity(helper);
        showInNewWindow(helper.getWindowTitle(), mainPlaceHolder);
    }
    public void showTableWindow (TableViewHelper<?> helper){
        final HBox hb = new HBox();
        hb.getClass().getDeclaredFields();
        hb.getChildren().add(new Label(helper.getHeader()));
        TableView<?> table = new TableView<>(FXCollections.observableArrayList(helper.getEntities()));
        for (String s :  helper.getFields()) {
            TableColumn col = new TableColumn(s.toUpperCase());
            col.setMinWidth(100);
            col.setCellValueFactory(new PropertyValueFactory<>(s));
            table.getColumns().add(col);
        }
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(hb, table);
        showInNewWindow(helper.getWindowName(), vbox);
    }
    public class Dialog {
        public String chooseFromList (String question, ArrayList<String> variants){
            GridPane gridPane = new GridPane();
            gridPane.getStylesheets().add("daemon-style.css");
            ChoiceBox<String> choiceBox = new ChoiceBox<>();
            choiceBox.getItems().addAll(variants);
            choiceBox.setValue(variants.get(0));
            choiceBox.getStyleClass().addAll("white-border");
            Button okButton = new Button("OK");
            okButton.getStyleClass().add("ok-btn");
            okButton.setOnAction(new CloseWindow(okButton));
            Label decorIcon = new Label("\uf059");
            decorIcon.setId("fa-icon");
            decorIcon.setPadding(new Insets(0,0,0,30));
            gridPane.add(new Label(question), 0, 0);
            gridPane.add(decorIcon, 1, 0);
            gridPane.add(choiceBox, 0, 1);
            gridPane.add(okButton, 1, 2);
            gridPane.setVgap(20);
            gridPane.setHgap(10);
            gridPane.setPadding(new Insets(10,10,10,10));
            showInNewWindow("Choose variant", gridPane);
            return choiceBox.getValue();
        }
    }

}
