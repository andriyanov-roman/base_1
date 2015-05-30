package app;

import company.CompanyMethods;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceDialog;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

/**
 * Created by User on 30.05.2015.
 */
public class CompEventImpl implements EventHandler<ActionEvent> {
    CompanyMethods model = new CompanyMethods();

    @Override
    public void handle(ActionEvent event) {
        Stage stage = new Stage();
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox);
        stage.setScene(scene);

        Button shwcmp = new Button("Show Companies");

        Button maxSal = new Button("Get Employee Max Salary");


        Button sortBySalary = new Button("Sort by Salary");
        sortBySalary.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String companyName = selectCompany();
                try {
                    model.sortByAge(model.getCompByName(companyName));
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        vbox.getChildren().add(sortBySalary);

        vbox.getChildren().add(maxSal);
        vbox.getChildren().add(shwcmp);
        stage.show();

    }

    private String selectCompany() {
        ArrayList<String> choices = new ArrayList<>();
        choices.add("Lenovo");
        choices.add("IBM");
        choices.add("Luxoft");
        ChoiceDialog<String> dialog = new ChoiceDialog("make your choice", choices);
        Optional<String> result = null;
        while (result == null) {
            result = dialog.showAndWait();
            if (result.isPresent()) {
                if (result.get() != "make your choice") {
                    return result.get();
                }else{
                    result = null;
                }
            } else {
                result = null;
            }

        }
        return null;
    }
}
