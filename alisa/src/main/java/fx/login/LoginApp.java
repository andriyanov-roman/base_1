package fx.login;


import factory.CommonWriterReader;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

/**
 * Created by PC XP on 08.05.15.
 */
public class LoginApp extends Application {
    private GridPane grid;

    public GridPane getGrid() {
        return grid;
    }

    public void setGrid(GridPane grid) {
        this.grid = grid;
    }

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
Button cancel = new Button();
        for (int i = 0; i <  grid.getChildren().size(); i++) {
            if ("cancel".equals(grid.getChildrenUnmodifiable().get(i).getId())) {
                cancel = (Button) grid.getChildrenUnmodifiable().get(i);
                break;
            }

        }
        cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });
    }

    public void writeToFile(String txt) {
        TextField username = new TextField("txt");
        TextField password = new TextField("txt");
        for (int i = 0; i < grid.getChildren().size(); i++) {
            if ("username".equals(grid.getChildrenUnmodifiable().get(i).getId())) {
                username = (TextField) grid.getChildrenUnmodifiable().get(i);
                break;
            }
        }

        for (int i = 0; i < grid.getChildren().size(); i++) {
            if ("password".equals(grid.getChildrenUnmodifiable().get(i).getId())) {
                password = (PasswordField) grid.getChildrenUnmodifiable().get(i);
                break;
            }
        }
             CommonWriterReader.WriteToFile("\n" +username.getText()+":",
                "alisa\\src\\result\\Userdata.txt", true);
        CommonWriterReader.WriteToFile(password.getText(),
                "alisa\\src\\result\\Userdata.txt", true);

        }

    public static void main(String[] args) {
        launch(args);
    }
}
