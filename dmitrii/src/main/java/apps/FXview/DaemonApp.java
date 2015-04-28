package apps.FXview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by mit_OK! on 28.04.2015.
 */
public class DaemonApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        System.out.println(getClass().getName());
        Parent root = FXMLLoader.load(getClass().getResource("sample3.fxml"));
        Scene scene = new Scene(root, 300, 275);
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
