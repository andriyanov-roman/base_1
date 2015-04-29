package apps.FXview;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
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
        //loadCompanyAppMenu();
        //initRes();
        setUserAgentStylesheet(STYLESHEET_MODENA);
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
    /*private void loadCompanyAppMenu() {
        try {
            Node companyAppMenu = FXMLLoader.load(new File(modulePath + "company\\CompanyAppFXMenu.fxml").toURL());
            rootLayout.setCenter(companyAppMenu);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    /*public void initRes (){
        FXMLLoader loader = new FXMLLoader();
        try {
            loader.setLocation(new File(modulePath+"FXview\\LeftSideBar.fxml").toURL());
            loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //MainWindowController controller = loader.getController();
        //controller.setMainApp(this);
        System.out.println("We are here!");
    }
    public static void main(String[] args) {
        launch(args);
    }

    public static void loadCompanyApp() {
        FXMLLoader loader = new FXMLLoader();
        AnchorPane companyAppPane = new AnchorPane();
        try {
            loader.setLocation(new File("dmitrii\\src\\main\\java\\apps\\FXview\\CompanyAppPane.fxml").toURL());
            companyAppPane = loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
       BorderPane p = new BorderPane();
        System.out.println("1 st App Loadded");
    }*/
}
