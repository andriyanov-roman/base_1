package apps.company;

import apps.FXview.ExtEventImpl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.util.ArrayList;

/**
 * Created by mit_OK! on 29.04.2015.
 */
public class CompanyEventContainer {
    private CompanyModel model = new CompanyModel();
    private ArrayList<EventHandler<ActionEvent>> events;

    public ArrayList<EventHandler<ActionEvent>> getEvents() {
        return events;
    }

    public CompanyEventContainer() {
        this.events = new ArrayList<>();
        events.add(new showAllCompanies("Show All Companies"));
        events.add(new showAllCompanies("getMaxSalary"));
    }

    public class showAllCompanies extends ExtEventImpl {

        public showAllCompanies(String eventName) {
            super(eventName);
        }

        @Override
        public void handle(ActionEvent event) {
            System.out.println(model.getCompanies().get(0));
        }
    }
    public class getMaxSalary extends ExtEventImpl {

        public getMaxSalary(String eventName) {
            super(eventName);
        }

        @Override
        public void handle(ActionEvent event) {
            System.out.println(model.getMaxSalaryInCompanyWrapper("Admin"));
        }
    }
}
