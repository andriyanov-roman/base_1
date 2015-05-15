package apps.FXview.leftsidebar;

import apps.FXview.DaemonApp;
import apps.FXview.events.FactoryEventContainer;
import apps.FXview.events.EventWithNameImpl;
import apps.FXview.events.CompanyEventContainer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

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
        ((GridPane)mainApp.getRootLayout().getCenter()).setMaxWidth(350);
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
            String btnName = ((EventWithNameImpl) events.get(i)).getEventName();
            Button btn = new Button (btnName);
            btn.getStyleClass().addAll("black-bg",/*"purple",*/"white-text","app-menu-button");
            btn.setMinWidth(200);
            btn.setOnAction(events.get(i));
            grid.add(btn,0,i);
        }
        grid.getStyleClass().add("black-bg");
        grid.setMaxWidth(515);
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        mainApp.getRootLayout().setCenter(grid);
    }

    @FXML
    public void loadCompanyApp(){
        loadApps(new CompanyEventContainer(mainApp).getEvents());
    }
    @FXML
    public void loadFactoryApp(){
        loadApps(new FactoryEventContainer(mainApp).getEvents());
    }
    @FXML
    public void exit (){
        mainApp.getStage().close();
    }

}
