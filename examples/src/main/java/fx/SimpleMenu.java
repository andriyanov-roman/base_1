package fx;

import cons.company.Employee;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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

import java.io.*;
import java.util.ArrayList;


public class SimpleMenu extends Application {
    private ArrayList<Employee> employees;
    File f = new File("test.txt");
    FileWriter fos;
    private String actionResult;

    @Override
    public void start(Stage primaryStage) throws Exception {
        fos = new FileWriter(f, true);
        loadDataOnStart();
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
        nameTextField.setId("name");
//        final Text actiontarget = new Text();
//        grid.add(actiontarget, 1, 6);
//        nameTextField.textProperty().addListener(new ChangeListener<String>() {
//            @Override
//            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
//                try {
//                    fos.write(nameTextField.getText() + '\n');
//                    fos.flush();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                actiontarget.setText(nameTextField.getText());
//            }
//        });
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
        btn.defaultButtonProperty().bind(btn.focusedProperty());
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 6);

        final Text actionTargetField = new Text();
        grid.add(actionTargetField, 1, 7);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                actionResult = new EmployeeValidator().validateFields(grid);
                actionTargetField.setText(actionResult);
            }
        });

        scene.getStylesheets().add("fx.css");

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

    private void loadDataOnStart() {
        employees = new ArrayList<>();
        Employee e = new Employee();
        e.setName("Vasya");
        employees.add(e);
    }
}
