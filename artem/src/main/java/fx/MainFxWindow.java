package fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by user on 27.04.2015.
 */
public class MainFxWindow extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My JavaFX");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 500, 400);
        primaryStage.setScene(scene);

        Text sceneTitle = new Text("Welcome");
        sceneTitle.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.TOP_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        final Text actionTarget = new Text();
        grid.add(actionTarget, 1, 6);
        btn.setOnAction(new SimpleMenuAction(actionTarget, pwBox, primaryStage));
        primaryStage.show();
    }
    public void startProgram(String[] args) {
        launch(args);
    }
    private class SimpleMenuAction implements EventHandler<ActionEvent> {
        private Text actionTarget;
        private PasswordField pwBox;
        private Stage stage;

        public SimpleMenuAction(Text actionTarget, PasswordField pwBox, Stage stage) {
            this.actionTarget = actionTarget;
            this.pwBox = pwBox;
            this.stage = stage;
        }

        @Override
        public void handle(ActionEvent event) {
            if ("Test".equals(pwBox.getText())) {
                try {
                    new FigureMenu().start(stage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            actionTarget.setText(pwBox.getText());
            actionTarget.setFill(Color.HOTPINK);
            System.out.println("Test");
        }
    }
}
