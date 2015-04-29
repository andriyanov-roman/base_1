package apps.FXview;

import apps.company.CompanyEventContainer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

/**
 * Created by mit_OK! on 29.04.2015.
 */
public class LeftSideBarController {
    private DaemonApp mainApp;

    public void setMainApp(DaemonApp mainApp) {
        this.mainApp = mainApp;
    }
    @FXML
    public void setDefaultWidth (){
        ((GridPane) mainApp.getRootLayout().getLeft()).setMaxWidth(250);
        mainApp.getAlertNODE().setText("");
    }
    private void hideSidebar(){
        ((GridPane) mainApp.getRootLayout().getLeft()).setMaxWidth(50);
        mainApp.getAlertNODE().setText("Right Click to show Full-width menu");
    }
    private void loadApps(ArrayList<EventHandler<ActionEvent>> events){
        hideSidebar();
        GridPane grid = new GridPane();
        for (int i = 0; i < events.size(); i++) {
            String btnName = ((ExtEventImpl) events.get(i)).getEventName();
            Button btn = new Button (btnName);
            btn.setOnAction(events.get(i));
            grid.add(btn,0,i);
        }
        //grid.setStyle("-fx-background-color: derive(orange, 0%)");
        //grid.setPrefWidth(150);
        grid.setMaxWidth(350);
        grid.setPadding(new Insets(5,5,5,5));
        //grid.setMargin();
        mainApp.getRootLayout().setCenter(grid);
    }

    @FXML
    public void loadCompanyApp(){
        loadApps(new CompanyEventContainer().getEvents());
    }
    @FXML
    public void loadFactoryApp(){

    }

}
