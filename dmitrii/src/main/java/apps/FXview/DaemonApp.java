package apps.FXview;

import apps.FXview.overview.OverviewHelper;
import entities.company.Employee;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mit_OK! on 28.04.2015.
 */
public class DaemonApp extends Application {
    private Stage stage;
    private Scene scene;
    private BorderPane rootLayout;
    private String modulePath = "dmitrii\\src\\main\\java\\apps\\";
    private Label alertNODE = new Label();

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
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        this.stage = stage;
        rootLayout = new BorderPane();
        rootLayout.setTop(FXMLLoader.load(getDaemonURL("MainMenu.fxml")));
        FXMLLoader loader = new FXMLLoader();
        try {
            loader.setLocation(getDaemonURL("LeftSideBar.fxml"));
            rootLayout.setLeft(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }
        LeftSideBarController controller = loader.getController();
        controller.setMainApp(this);
        rootLayout.setCenter(FXMLLoader.load(getDaemonURL("CenterDefault.fxml")));
        rootLayout.setBottom(createAlertPane());
        rootLayout.getStyleClass().add("black-bg");
        scene = new Scene(rootLayout, 600, 400);
        scene.getStylesheets().add("daemon-style.css");
        stage.setTitle("The united application launching");
        stage.setScene(scene);
        stage.show();
    }
    private Node createAlertPane (){
        HBox bottomAlertPane = new HBox();
        alertNODE.getStyleClass().add("warning");
        bottomAlertPane.getChildren().add(alertNODE);
        bottomAlertPane.setAlignment(Pos.CENTER);
        bottomAlertPane.setPrefHeight(50);
        return bottomAlertPane;
    }

    public void showInNewWindow (String windowTitle, Parent eatForScene){
        Scene newWindowScene = new Scene(eatForScene);
        Stage newWinStage = new Stage();
        newWinStage.setTitle(windowTitle);
        newWinStage.initModality(Modality.WINDOW_MODAL);
        newWinStage.initOwner(stage);
        newWinStage.setScene(newWindowScene);
        //newWinStage.show();
        newWinStage.showAndWait();
    }
    public void showEntity (OverviewHelper<?> helper){
        Pane mainPlaceHolder = null;
        try {
            mainPlaceHolder = FXMLLoader.load(getDaemonURL("overview\\Overview.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        GridPane top = (GridPane) getElementById("o_top", mainPlaceHolder);
        ((Label) getElementById("o_icon",top)).setText(helper.getIconChar());
        ((Label) getElementById("o_title",top)).setText(helper.getTitle());
        ((Label) getElementById("o_subTitle",top)).setText(helper.getSubTitle());
        GridPane center = (GridPane) getElementById("o_center", mainPlaceHolder);
        center.setHgap(5);
        center.setVgap(5);
        double newGridWidth = 0;
        for (int i = 0; i < helper.getPairs().size(); i++) {
            Label fieldName = new Label(helper.getPairs().get(i).getKey().toUpperCase());
            fieldName.setPadding(new Insets(5, 5, 5, 15));
            fieldName.getStyleClass().add("label-caption");
            center.add(fieldName, 0, i);
            if (newGridWidth < fieldName.getPrefWidth()) {newGridWidth = fieldName.getPrefWidth();}

            TextField fieldValue = new TextField(helper.getPairs().get(i).getValue());
            fieldValue.setPadding(new Insets(5,5,5,5));
            fieldValue.setDisable(true);
            center.add(fieldValue,1,i);
        }
        double newGridHeight = center.getRowConstraints().get(0).getMaxHeight() * helper.getPairs().size();
        center.setMinHeight(newGridHeight);
        center.getColumnConstraints().get(0).setMinWidth(newGridWidth);
        GridPane bottom = (GridPane) getElementById("o_bottom", mainPlaceHolder);
        Button cancelButton = (Button) getElementById("o_Cancel",bottom);
        cancelButton.setOnAction(new CloseWindow(cancelButton));

        showInNewWindow(helper.getWindowTitle(), mainPlaceHolder);
    }
    public Node getElementById (String id, Parent parent){
        for (Node i : parent.getChildrenUnmodifiable()) {
            if (i.getId().equals(id)){
                return i;
            }
        }
        return null;
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
    public URL getDaemonURL (String FXMLfileName){
        //getClass().getResource("MainWindow.fxml");
        URL url = null;
        try {
            url = new File("dmitrii\\src\\main\\java\\apps\\FXview\\"+FXMLfileName).toURL();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    public class Dialog {
        public String chooseFromList (String question, ArrayList<String> variants){
            GridPane gridPane = new GridPane();
            Label label = new Label(question);
            ChoiceBox<String> choiceBox = new ChoiceBox<>();
            choiceBox.getItems().addAll(variants);
            choiceBox.setValue(variants.get(0));
            Button okButton = new Button("OK");
            okButton.getStyleClass().add("ok-btn");
            okButton.setOnAction(new CloseWindow(okButton));
            gridPane.add(label, 0, 0);
            gridPane.add(choiceBox, 1, 0);
            gridPane.add(okButton,2,0);
            showInNewWindow("Choose variant", gridPane);
            return choiceBox.getValue();
        }
    }

}
