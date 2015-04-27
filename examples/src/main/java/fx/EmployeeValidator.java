package fx;

import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.awt.*;

/**
 * Created by Администратор on 27.04.2015.
 */
public class EmployeeValidator {

    public String validateFields(Node node) {
        GridPane grid = (GridPane) node;
        for (int i = 0; i < grid.getChildren().size(); i++) {
            if("name".equals(grid.getChildren().get(i).getId())) {
                TextField name = (TextField)grid.getChildren().get(i);
                try {
                    Integer.parseInt(name.getText());
                }catch (Exception e) {
                    return "Should be number";
                }
            }
        }
        return "correct";
    }

}
