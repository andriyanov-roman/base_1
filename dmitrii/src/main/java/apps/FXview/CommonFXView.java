package apps.FXview;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by mit_OK! on 27.04.2015.
 */
public abstract class CommonFXView extends Application {
    private Scene scene;
    private GridPane grid;
    private Double width = 640.0;
    private Double height = 480.0;

    public CommonFXView(Double width, Double height) {
        this.grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        this.scene = new Scene(grid, width, height);
        scene.getStylesheets().add("dmitrii\\src\\main\\java\\apps\\FXview\\bootstrap.min.css");
    }

    /*public CommonFXView() {

    }*/

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public GridPane getGrid() {
        return grid;
    }

    public void setGrid(GridPane grid) {
        this.grid = grid;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public abstract void start(Stage primaryStage) throws Exception;

    public void launchProgram (String [] args){
        launch(args);
    }
}
