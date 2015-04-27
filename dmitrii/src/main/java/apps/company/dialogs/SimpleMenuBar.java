package apps.company.dialogs;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
//w w  w  .  j  av a2 s.  c o m
//http://www.java2s.com/Tutorials/Java/JavaFX/0500__JavaFX_ProgressBar.htm
public class SimpleMenuBar extends Application {
    Task copyWorker;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Application.setUserAgentStylesheet(STYLESHEET_MODENA);
        //Application.setUserAgentStylesheet(STYLESHEET_CASPIAN);
        Group root = new Group();
        Scene scene = new Scene(root, 640, 480, Color.WHITE);

        BorderPane mainPane = new BorderPane();
        root.getChildren().add(mainPane);

        final Label label = new Label("Loading Daemon's program...");
        final ProgressBar progressBar = new ProgressBar(0);
        progressBar.setMinHeight(75.0);
        progressBar.setMinWidth(500.0);

        final HBox hb = new HBox();
        hb.setSpacing(5);
        hb.setAlignment(Pos.CENTER);
        hb.getChildren().addAll(label, progressBar);
        mainPane.setTop(hb);

        final Button startButton = new Button("Start");
        final Button cancelButton = new Button("Cancel");
        final HBox hb2 = new HBox();
        hb2.setSpacing(5);
        hb2.setAlignment(Pos.CENTER);
        hb2.getChildren().addAll(startButton, cancelButton);
        mainPane.setBottom(hb2);
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                startButton.setDisable(true);
                progressBar.setProgress(0);
                cancelButton.setDisable(false);
                copyWorker = createWorker();
                progressBar.progressProperty().unbind();
                progressBar.progressProperty().bind(copyWorker.progressProperty());
                copyWorker.messageProperty().addListener(new ChangeListener<String>() {
                    public void changed(ObservableValue<? extends String> observable,
                                        String oldValue, String newValue) {
                        System.out.println(newValue);
                    }
                });
                new Thread(copyWorker).start();
            }
        });
        cancelButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                startButton.setDisable(false);
                cancelButton.setDisable(true);
                copyWorker.cancel(true);
                progressBar.progressProperty().unbind();
                progressBar.setProgress(0);
                System.out.println("cancelled.");
            }
        });
        ProgressIndicator p1 = new ProgressIndicator();


        root.getChildren().add(p1);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public Task createWorker() {
        return new Task() {
            @Override
            protected Object call() throws Exception {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(2000);
                    updateMessage("2000 milliseconds");
                    updateProgress(i + 1, 10);
                }
                return true;
            }
        };
    }
}