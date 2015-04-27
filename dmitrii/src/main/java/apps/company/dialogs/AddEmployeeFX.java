package apps.company.dialogs;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.File;

/**
 * Created by user on 25.04.2015.
 */
public class AddEmployeeFX extends Application {
    private static String emplName;

    public static void setEmplName(String emplName) {
        AddEmployeeFX.emplName = emplName;
    }

    public String getEmplName() {
        return emplName;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Add Employee Dialog");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(grid, 640, 480);
        File f = new File("dmitrii\\src\\main\\java\\apps\\company\\style.css");
        //scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));
        scene.getStylesheets().add("style2.css");
        //scene.getStylesheets().add(AddEmployeeFX.class.getResource("style.css").toExternalForm());
        String path = "";
        System.out.println(path);

        primaryStage.setScene(scene);
        Text scenetitle = new Text("Add Employee:");
        scenetitle.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        grid.add(new Label("Name:"), 0, 1);
        TextField nameTF = new TextField();
        nameTF.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                scenetitle.setText(nameTF.getText());
            }
        });
        grid.add(nameTF,1,1);
        grid.add(new Label("Surname:"), 0, 2); grid.add(new TextField(),1,2);
        grid.add(new Label("Salary:"), 0, 3); grid.add(new TextField(),1,3);
        grid.add(new Label("Gender:"), 0, 4); grid.add(new TextField(),1,4);
        grid.add(new Label("Age:"), 0, 5); grid.add(new TextField(),1,5);

        Button btn = new Button("Save to File");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.TOP_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 2, 6);

        AddEmployeeAction action = new AddEmployeeAction(nameTF);
        btn.setOnAction(action);

        WebView browser = new WebView();
        WebEngine webEngine = browser.getEngine();
        webEngine.load("http://google.com.ua");
        grid.add(browser,0,6);


        primaryStage.show();
    }
    public void startProgram (String [] args){
        launch(args);
    }
}
