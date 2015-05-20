import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DownloaderWindow extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My Downloader");

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

        Label URL = new Label("Enter URL:");
        grid.add(URL, 0, 1);

        TextField URLTextField = new TextField();
        grid.add(URLTextField, 1, 1);

        Button btn = new Button("Save on the Disk");




        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    //new Downloader().loader(URLTextField.getText());

                    Pattern pattern = Pattern.compile("/^(?:([a-z]+):(?:([a-z]*):)?\\/\\/)?(?:([^:@]*)(?::([^:@]*))?@)?((?:[a-z0-9_-]+\\.)+[a-z]{2,}|localhost|(?:(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}(?:(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])))(?::(\\d+))?(?:([^:\\?\\#]+))?(?:\\?([^\\#]+))?(?:\\#([^\\s]+))?$/i");
                    Matcher matcher = pattern.matcher(URLTextField.getText());
                    if (matcher.matches() == true) {
                        try {
                            new Downloader().loader(URLTextField.getText());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e) {

                }
            }


        });

        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.TOP_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);



        primaryStage.show();


    }

}
