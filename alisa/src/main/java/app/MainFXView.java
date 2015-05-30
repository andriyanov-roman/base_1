package app;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by User on 30.05.2015.
 */
public class MainFXView extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane mainGrid = createMainGrid();

        Scene scene = new Scene(mainGrid, 300, 300);
        Stage stage = new Stage();
        stage.setTitle("FX Programm");
        stage.setScene(scene);

        stage.show();
    }

    private GridPane createMainGrid() {
        GridPane grid = new GridPane();
        grid.getStylesheets().add("style.css");
        Button companyButton = new Button("Company Menu");
        companyButton.getStyleClass().add("primary-btn");
        companyButton.setOnAction(new CompEventImpl());

        Button factoryButton = new Button("Factory Menu");
        factoryButton.getStyleClass().add("primary-btn");
        factoryButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello factory");
            }
        });
        Button figuresButton = new Button("Figures Menu");
        figuresButton.getStyleClass().add("primary-btn");
        figuresButton.setOnAction(event -> System.out.println("Hello figures"));
        GridPane.setConstraints(companyButton,0,4);
        grid.getChildren().add(companyButton);
        grid.add(factoryButton,0,2);
        grid.add(figuresButton,0,3);
        Label mainCaption = new Label("AppLauncher");
       GridPane.setHalignment(mainCaption,HPos.CENTER);
       // mainCaption.setAlignment(Pos.CENTER);
        grid.add(mainCaption,0,0);


        return grid;
    }
}
