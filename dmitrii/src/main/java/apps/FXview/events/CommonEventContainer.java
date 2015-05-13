package apps.FXview.events;

import apps.FXview.DaemonApp;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

/**
 * Created by mit_OK! on 12.05.2015.
 */
abstract public class CommonEventContainer {
    protected DaemonApp mainApp;
    protected DaemonApp.Dialog dialog;
    protected ArrayList<String> listOfProperties;
    protected ArrayList<EventHandler<ActionEvent>> events;

    abstract public ArrayList<EventHandler<ActionEvent>> getEvents();
    abstract public ArrayList<String> getPropertiesList ();
    public CommonEventContainer(DaemonApp mainApp) {
        this.mainApp = mainApp;
        this.listOfProperties = getPropertiesList();
        this.events = getEvents();
    }
}
