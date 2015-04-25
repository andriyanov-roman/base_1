package javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by user on 25.04.2015.
 */
public class SimpleMenu extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Employee Window");
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(gridPane, 500, 350);
        primaryStage.setScene(scene);
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("ISOCPEUR", FontWeight.NORMAL, 20));
        gridPane.add(scenetitle, 0, 0, 2, 1);

        Label emplName = new Label("Employee Name:");
        gridPane.add(emplName, 0, 1);

        TextField textFieldName = new TextField();
        gridPane.add(textFieldName, 1, 1);

        Label emplSecondName = new Label("Employee Second Name:");
        gridPane.add(emplSecondName, 0, 2);

        TextField textFieldSecondName = new TextField();
        gridPane.add(textFieldSecondName, 1, 2);

        Label emplAge = new Label("Employee Age:");
        gridPane.add(emplAge, 0, 3);

        TextField textFieldAge = new TextField();
        gridPane.add(textFieldAge, 1, 3);

        Label emplSalary = new Label("Employee Salary:");
        gridPane.add(emplSalary, 0, 4);

        TextField textFieldSalary = new TextField();
        gridPane.add(textFieldSalary, 1, 4);

        Button btn = new Button("Information out .txt file");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.TOP_LEFT);
        hbBtn.getChildren().add(btn);
        gridPane.add(hbBtn, 1, 6);

        Button btn2 = new Button("Information show");
        HBox hbBtn2 = new HBox(10);
        hbBtn2.setAlignment(Pos.TOP_LEFT);
        hbBtn2.getChildren().add(btn2);
        gridPane.add(hbBtn2, 1, 7);

        primaryStage.show();
    }
}

