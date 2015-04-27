package fx;

import entity.Employee;
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

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by user on 25.04.2015.
 */
public class SimpleMenu extends Application {
    private ArrayList<Employee> employees = new ArrayList<>();

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
                Employee e = new Employee();
                e.setName(nameTextField.getText());
                e.setSurname(surnameTextField.getText());
                e.setSalary(Double.valueOf(salaryTextField.getText()));
                e.setAge(Integer.valueOf(ageTextField.getText()));
                e.setSex(sexTextField.getText());
                employees.add(e);
                writeToFile("alisa\\src\\result\\EmployeeMenu.txt");
            }
        });
        primaryStage.show();
    }
    public void startProgram(String[] args) {
        launch(args);
    }

    public void writeToFile(String path) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(path, true);
            writer.write(employees.toString());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

