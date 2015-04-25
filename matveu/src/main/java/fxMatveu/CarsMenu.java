package fxMatveu;

import fxMatveu.SimpleMenuTwo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
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


public class CarsMenu extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Cars");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 800, 775);
        primaryStage.setScene(scene);

        Text scenetitle = new Text("Enter the fields");
        scenetitle.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("Введите имя владельца автомобиля");
        grid.add(userName, 0, 1);
        TextField userNameField = new TextField();
        grid.add(userNameField, 1, 1);

        Label brand = new Label("Введите марку автомобиля");
        grid.add(brand, 0, 2);
        TextField brandField = new TextField();
        grid.add(brandField, 1, 2);

        Label model = new Label("Введите модель автомобиля");
        grid.add(model, 0, 3);
        TextField modelField = new TextField();
        grid.add(modelField, 1, 3);

        Label type = new Label("Введите тип автомобиля(купе,седан,кабриолет,пикап,универсал,хэтчбек)");
        grid.add(type, 0, 4);
        TextField typeField = new TextField();
        grid.add(typeField, 1, 4);

        Label color = new Label("Введите цвет автомобиля(white,black,red,blue,gold)");
        grid.add(color, 0, 5);
        TextField colorField = new TextField();
        grid.add(colorField, 1, 5);

        Label price = new Label("Введите цену автомобиля");
        grid.add(price, 0, 6);
        TextField priceField = new TextField();
        grid.add(priceField, 1, 6);

        Label year = new Label("Введите год выпуска автомобиля");
        grid.add(year, 0, 7);
        TextField yearField = new TextField();
        grid.add(yearField, 1, 7);

        Button btn = new Button("Save to file");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.TOP_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 9);

        primaryStage.show();
    }

    public void startProgram(String[] args) {
        launch(args);
    }

    private class SimpleMenuAction implements EventHandler<ActionEvent> {
        private Text actiontarget;
        private TextField yearField;
        private Stage stage;

        public SimpleMenuAction(Text actiontarget, TextField yearField, Stage stage) {
            this.actiontarget = actiontarget;
            this.yearField = yearField;
            this.stage = stage;
        }

        @Override
        public void handle(ActionEvent event) {
            if ("123".equals(yearField.getText())) {
                try {
                    new SimpleMenuTwo().start(stage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            actiontarget.setText(yearField.getText());
            actiontarget.setFill(Color.HOTPINK);
            System.out.println("Test");
        }
    }
}
