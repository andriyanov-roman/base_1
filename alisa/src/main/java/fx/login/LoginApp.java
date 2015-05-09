package fx.login;


import factory.CommonWriterReader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

/**
 * Created by PC XP on 08.05.15.
 */
public class LoginApp extends Application {
    GridPane grid;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Registration");
        File loginForm = new File("alisa\\src\\main\\java\\fx\\login\\LoginForm.fxml");
        URL url = loginForm.toURL();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(url);
        grid = loader.load();
        LoginFormController controller = loader.getController();
        controller.setApp(this);
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void writeToFile(String txt) {
        TextField username = new TextField("");
        for (int i = 0; i < grid.getChildren().size(); i++) {
            if ("username".equals(grid.getChildrenUnmodifiable().get(i).getId())) {
                username = (TextField) grid.getChildrenUnmodifiable().get(i);
                break;
            }
             CommonWriterReader.WriteToFile(username.getText(),
                    "alisa\\src\\result\\Userdata.txt", true);

        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
