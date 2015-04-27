package apps.company.dialogs;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

/**
 * Created by mit_OK! on 27.04.2015.
 */
public class AddEmployeeAction implements EventHandler<ActionEvent> {
    TextField emplName;

    public AddEmployeeAction(TextField name) {
        emplName = name;
    }

    @Override
    public void handle(ActionEvent event) {
        System.out.println("I can do it!!! ");
        System.out.println(emplName.getText());
    }
}
