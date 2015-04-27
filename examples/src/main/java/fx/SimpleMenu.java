package fx;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
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

import java.util.ArrayList;


public class SimpleMenu extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Employee Menu");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 500, 500);
        primaryStage.setScene(scene);

        Text scenetitle = new Text("Add an employee");
        scenetitle.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label employeeName = new Label("Name:");
        grid.add(employeeName, 0, 1);
        TextField nameTextField = new TextField();
        grid.add(nameTextField, 1, 1);

        Label employeeSurname = new Label("Surname:");
        grid.add(employeeSurname, 0, 2);
        TextField surnameTextField = new TextField();
        grid.add(surnameTextField, 1, 2);

        Label employeeSalary = new Label("Salary:");
        grid.add(employeeSalary, 0, 3);
        TextField salaryTextField = new TextField();
        grid.add(salaryTextField, 1, 3);

        Label employeeAge = new Label("Age:");
        grid.add(employeeAge, 0, 4);
        TextField ageTextField = new TextField();
        grid.add(ageTextField, 1, 4);

        Label employeeSex = new Label("Sex:");
        grid.add(employeeSex, 0, 5);
        TextField sexTextField = new TextField();
        grid.add(sexTextField, 1, 5);


        Button btn = new Button("Save");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 6);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

            }
        });
        scene.getStylesheets().add("fx.css");
        for (int i = 0; i < grid.getChildren().size(); i++) {
            if("scenetitleId".equals(grid.getChildren().get(i).getId())) {
                System.out.println(grid.getChildren().get(i).toString());
            }
        }
        primaryStage.show();
    }

    public void startProgram(String[] args) {
        launch(args);
    }

    private class SimpleMenuAction implements EventHandler<ActionEvent> {
        private Text actiontarget;
        private PasswordField pwBox;
        private Stage stage;

        public SimpleMenuAction(Text actiontarget, PasswordField pwBox, Stage stage) {
            this.actiontarget = actiontarget;
            this.pwBox = pwBox;
            this.stage = stage;
        }

        @Override
        public void handle(ActionEvent event) {
            if ("Test".equals(pwBox.getText())) {
                try {
                    new SimpleMenuTwo().start(stage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            actiontarget.setText(pwBox.getText());
            actiontarget.setFill(Color.HOTPINK);
            System.out.println("Test");
        }


    }
}
