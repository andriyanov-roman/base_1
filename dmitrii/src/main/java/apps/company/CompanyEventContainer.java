package apps.company;

import apps.FXview.DaemonApp;
import apps.FXview.ExtEventImpl;
import entities.company.Company;
import entities.company.Employee;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by mit_OK! on 29.04.2015.
 */
public class CompanyEventContainer {
    private DaemonApp mainApp;
    private CompanyModel model = new CompanyModel();
    ArrayList<String> listOfProperties = new ArrayList<>(Arrays.asList("name","surname","salary","gender","age"));
    private ArrayList<EventHandler<ActionEvent>> events;

    public ArrayList<EventHandler<ActionEvent>> getEvents() {
        return events;
    }

    public CompanyEventContainer(DaemonApp mainApp) {
        this.mainApp = mainApp;
        this.events = new ArrayList<>();
        events.add(new showCompany("Show All Companies"));
        events.add(new getMaxSalary("getMaxSalary"));
    }
    public Optional<String> selectCompanyDialog (){
        List<String> choices = new ArrayList<>();
        for (Company i : model.getCompanies()){
            choices.add(i.getCompanyName());
        }
        ChoiceDialog<String> dialog = new ChoiceDialog<>(model.getCompanies().get(0).getCompanyName(), choices);
        dialog.setTitle("Select Company");
        dialog.setHeaderText(null);
        dialog.setContentText("Choose Company name:");
        return dialog.showAndWait();
    }
    public Company getCompanyByName (String companyName){
        for (Company com : model.getCompanies()){
            if (com.getCompanyName().equals(companyName)){
                return com;
            }
        }
        return null;
    }
    public class showCompany extends ExtEventImpl {

        public showCompany(String eventName) {
            super(eventName);
        }

        @Override
        public void handle(ActionEvent event) {
            Optional<String> result = selectCompanyDialog();
            if (result.isPresent()){
                Company com = getCompanyByName(result.get());
                mainApp.showTableWindow(com.getWorkers(), listOfProperties, "Show Company", com.getCompanyName());
            }
        }
    }
    public class getMaxSalary extends ExtEventImpl {

        public getMaxSalary(String eventName) {
            super(eventName);
        }

        @Override
        public void handle(ActionEvent event) {
            Optional<String> result = selectCompanyDialog();
            if ( result.isPresent()) {
                Company com = getCompanyByName(result.get());
                Employee e = model.getWorkerWithMaxSalaryInComp(com);
                GridPane grid = new GridPane ();
                for (int i = 0; i < listOfProperties.size(); i++) {
                    Label definition = new Label(listOfProperties.get(i)+":");
                    definition.getStyleClass().add("def-label");
                    grid.add(definition,0,i);
                }
                grid.add(new Label(e.getName()),1,0);
                grid.add(new Label(e.getSurname()),1,1);
                grid.add(new Label(e.getSalary().toString()),1,2);
                grid.add(new Label(e.getGenderName()),1,3);
                grid.add(new Label(e.getAge()+""),1,4);
                mainApp.showInNewWindow("EMPLOYEE WITH HIGHEST SALARY", grid);
            }


        }
    }
}
