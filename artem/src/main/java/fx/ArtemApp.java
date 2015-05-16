package fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by Programmer on 16.05.2015.
 */
public class ArtemApp extends Application {
    private Stage stage;
    private Scene scene;
    private BorderPane rootLayout;
    private GridPane loginPane;
    private Label alertNODE = new Label();


    @Override
    public void start(Stage primaryStage) throws Exception {
        loginPane.setAlignment(Pos.CENTER);
        loginPane.setHgap(10);
        loginPane.setVgap(10);
        loginPane.setPadding(new Insets(25, 25, 25, 25));
    }
}
