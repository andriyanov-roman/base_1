package apps.FXview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by mit_OK! on 28.04.2015.
 */
public class DaemonApp extends Application {
    private File path = new File("dmitrii\\src\\main\\java\\apps\\FXview\\MainWindow.fxml");
    private static AnchorPane rightSideBar;
    @Override
    public void start(Stage stage) throws Exception {

        //Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        Parent root = FXMLLoader.load(path.toURL());
        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
        initRes();
    }

    public void initRes (){
        FXMLLoader loader = new FXMLLoader();
        try {
            loader.setLocation(path.toURL());
            loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
        MainWindowController controller = loader.getController();
        controller.setMainApp(this);
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
        rightSideBar.setTopAnchor(companyAppPane,10.0);
        System.out.println("1 st App Loadded");
    }
}
