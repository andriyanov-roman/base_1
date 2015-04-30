package apps.FXview;

import entities.company.Employee;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by mit_OK! on 28.04.2015.
 */
public class DaemonApp extends Application {
    private Stage stage;
    private Scene scene;
    private BorderPane rootLayout;
    private String modulePath = "dmitrii\\src\\main\\java\\apps\\";
    private Label alertNODE = new Label();

    public BorderPane getRootLayout() {
        return rootLayout;
    }

    public Label getAlertNODE() {
        return alertNODE;
    }

    public void setAlertNODE(Label alertNODE) {
        this.alertNODE = alertNODE;
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));

        this.stage = stage;
        rootLayout = new BorderPane();
        rootLayout.setTop(FXMLLoader.load(new File(modulePath+"FXview\\MainMenu.fxml").toURL()));
        FXMLLoader loader = new FXMLLoader();
        try {
            loader.setLocation(new File(modulePath + "FXview\\LeftSideBar.fxml").toURL());
            rootLayout.setLeft(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }
        LeftSideBarController controller = loader.getController();
        controller.setMainApp(this);
        rootLayout.setCenter(FXMLLoader.load(new File(modulePath + "FXview\\CenterDefault.fxml").toURL()));
        rootLayout.setBottom(createAlertPane());
        rootLayout.getStyleClass().add("black-bg");
        scene = new Scene(rootLayout, 600, 400);
        scene.getStylesheets().add("style.css");
        stage.setTitle("The united application launching");
        stage.setScene(scene);
        stage.show();
        /////////
        showInNewWindow("Test",FXMLLoader.load(new File(modulePath + "FXview\\SimpleOverview.fxml").toURL()));
        showEmployee();
    }
    private Node createAlertPane (){
        HBox bottomAlertPane = new HBox();
        alertNODE.getStyleClass().add("warning");
        bottomAlertPane.getChildren().add(alertNODE);
        bottomAlertPane.setAlignment(Pos.CENTER);
        bottomAlertPane.getStyleClass().add("black-bg");
        bottomAlertPane.setPrefHeight(50);
        return bottomAlertPane;
    }
    public void showTableWindow (ArrayList<Employee> data, ArrayList<String> listOfProperties, String windowTitle, String header){
        final HBox hb = new HBox();
        hb.getChildren().add(new Label(header));
        ObservableList<Employee> fxData = FXCollections.observableArrayList();
        for (Employee e : data) {
            fxData.add(e);
        }
        TableView<Employee> table = new TableView<>(fxData);
        for (String pName : listOfProperties) {
            TableColumn col = new TableColumn(pName);
            col.setMinWidth(100);
            col.setCellValueFactory(new PropertyValueFactory<>(pName));
            table.getColumns().add(col);
        }
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(hb, table);
        showInNewWindow(windowTitle, vbox);
    }
    public void showInNewWindow (String windowTitle, Parent eatForScene){
        Scene newWinScene = new Scene(eatForScene);
        Stage newWinStage = new Stage();
        newWinStage.setTitle(windowTitle);
        newWinStage.initModality(Modality.WINDOW_MODAL);
        newWinStage.initOwner(stage);
        newWinStage.setScene(newWinScene);
        newWinStage.show();
    }
    public void showEmployee (/*Employee e*/){
        try {
            GridPane gp = FXMLLoader.load(new File(modulePath + "FXview\\SimpleOverview.fxml").toURL());
            ((Text)gp.getChildren().get(1)).setText("Employee name");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
