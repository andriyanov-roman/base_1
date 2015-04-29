package apps.FXview;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * Created by mit_OK! on 29.04.2015.
 */
public abstract class ExtEventImpl implements EventHandler<ActionEvent> {
    protected String eventName;

    public ExtEventImpl(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }
}
