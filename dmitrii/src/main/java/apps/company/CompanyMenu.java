package apps.company;

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
public class CompanyMenu extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Add Employee Dialog");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(grid, 640, 480);
        scene.getStylesheets().add("test.css");
        primaryStage.setScene(scene);

        Text scenetitle = new Text("Add Employee:");
        scenetitle.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        grid.add(new Label("Name:"), 0, 1); grid.add(new TextField(),1,1);
        grid.add(new Label("Surname:"), 0, 2); grid.add(new TextField(),1,2);
        grid.add(new Label("Salary:"), 0, 3); grid.add(new TextField(),1,3);
        grid.add(new Label("Gender:"), 0, 4); grid.add(new TextField(),1,4);
        grid.add(new Label("Age:"), 0, 5); grid.add(new TextField(),1,5);

        Button btn = new Button("Save to File");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.TOP_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 2, 6);



        primaryStage.show();
    }
    public void startProgram (String [] args){
        launch(args);
    }
}
