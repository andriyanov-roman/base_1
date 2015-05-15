package apps.FXview.events;

import apps.FXview.DaemonApp;
import apps.FXview.overview.OverviewHelper;
import entities.factory.Car;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

/**
 * Created by mit_OK! on 13.05.2015.
 */
public class FactoryEventContainer extends CommonEventContainer {


    public FactoryEventContainer(DaemonApp mainApp) {
        super(mainApp);
    }

    @Override
    public ArrayList<EventHandler<ActionEvent>> getEvents() {
        ArrayList<EventHandler<ActionEvent>> factoryEvents = new ArrayList<>();
        factoryEvents.add(new CreateCar("Create car"));
        return factoryEvents;
    }

    @Override
    public ArrayList<String> getPropertiesList() {
        //TODO
        return null;
    }

    public class CreateCar extends EventWithNameImpl {

        public CreateCar(String eventName) {
            super(eventName);
        }

        @Override
        public void handle(ActionEvent event) {
            Car auto = new Car();
            OverviewHelper<Car> carOverviewHelper = new OverviewHelper<Car>(auto,false);
            mainApp.showEntity(carOverviewHelper);
        }
    }

}
