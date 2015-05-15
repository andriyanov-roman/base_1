package apps.FXview.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * Created by mit_OK! on 29.04.2015.
 */
public abstract class EventWithNameImpl implements EventHandler<ActionEvent> {
    protected String eventName;

    public EventWithNameImpl(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }
}
