package programs.views;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
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
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

/**
 * Created by Администратор on 08.05.2015.
 */
public class ProgramsFXView extends CommonFXView{
    private int windowsWidth = 300;
    private int windowsHeight = 300;


   /* private Scene createScene(){
        //Group root = new Group();
        Scene scene = new Scene(createGrid(), windowsWidth,windowsHeight);
        return scene;
    }*/


public void loadFiles() throws Exception{
    try {
        FileOutputStream outputStream = null;
        ArrayList<String> urls = new ArrayList<>(loadUrls());
        for (int i = 0; i < urls.size(); i++) {
            URL url = new URL(urls.get(i));
            InputStream is = url.openStream();
            outputStream = new FileOutputStream(new File(i + ".mp3"));
            byte[] buffer = new byte[2048];
            int length;
            while ((length = is.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            outputStream.close();
        }
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
    public static Set<String> loadUrls() {
        Set<String> urls = new HashSet<>();
        try {
            URL url = new URL("http://www.ex.ua/82091884");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            Pattern pattern = Pattern.compile("href='([^']+)");
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    if (matcher.group(1).contains("/get/")) {
                        urls.add("http://www.ex.ua" + matcher.group(1));
                    }
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return urls;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid,300,300);

        //grid.setGridLinesVisible(true);


        Text scenetitle = new Text("Add an employee");
        scenetitle.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label employeeName = new Label("Name:");
        grid.add(employeeName, 0, 1);

        TextField nameTextField = new TextField();
        nameTextField.setId("name");
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
        //btn.defaultButtonProperty().bind(btn.focusedProperty());
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.CENTER);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 6);

        Button download = new Button ("Download");
        hbBtn.setAlignment(Pos.BOTTOM_LEFT);
        hbBtn.getChildren().add(download);

//
//
//        final Text actionTargetField = new Text();
//        grid.add(actionTargetField, 1, 7);
//        download.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                try {
//                    loadFiles();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
        primaryStage.setTitle("Main Programs Menu");
        primaryStage.setScene(scene);
       ;
        //primaryStage.setScene(createScene());


        primaryStage.show();
    }
    public static void startFX(String [] args){
        launch(args);
    }

    public static void main(String[] args) {
        startFX(args);
    }


}
