package apps.FXview.helpers;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.stage.Stage;

/**
 * Created by mit_OK! on 07.05.2015.
 */
public class CloseWindow implements EventHandler<ActionEvent> {
    private Node node;

    public CloseWindow(Node node) {
        this.node = node;
    }

    @Override
    public void handle(ActionEvent event) {
        Stage stageOfOverview = (Stage) node.getScene().getWindow();
        stageOfOverview.close();
    }
}
