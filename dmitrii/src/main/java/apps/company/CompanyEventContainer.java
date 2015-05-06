package apps.company;

import apps.FXview.DaemonApp;
import apps.FXview.ExtEventImpl;
import apps.FXview.TableViewHelper;
import apps.factory.FactoryModel;
import entities.company.Company;
import entities.company.Employee;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
//import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mit_OK! on 29.04.2015.
 */
public class CompanyEventContainer {
    private DaemonApp mainApp;
    private CompanyModel model = new CompanyModel();
    ArrayList<String> listOfProperties =
            new ArrayList<>(Arrays.asList("name","surname","salary","gender","age","platform","projectName","language"));
    private ArrayList<EventHandler<ActionEvent>> events;

    public ArrayList<EventHandler<ActionEvent>> getEvents() {
        return events;
    }

    public CompanyEventContainer(DaemonApp mainApp) {
        this.mainApp = mainApp;
        this.events = new ArrayList<>();
        events.add(new showCompany("Show Company"));
        events.add(new getMaxSalary("Get Max Salary"));
        events.add(new addEmployee("Add Employee"));
        events.add(new addEmployee("Fire and Increase Stuff"));
        events.add(new addEmployee("Get Highest salary by Proffesion"));
        events.add(new addEmployee("New Task"));
        events.add(new addEmployee("Test"));
    }
    /*public Optional<String> selectCompanyDialog (){
        List<String> choices = new ArrayList<>();
        for (Company i : model.getCompanies()){
            choices.add(i.getCompanyName());
        }
        ChoiceDialog<String> dialog = new ChoiceDialog<>(model.getCompanies().get(0).getCompanyName(), choices);
        dialog.setTitle("Select Company");
        dialog.setHeaderText(null);
        dialog.setContentText("Choose Company name:");
        Optional<String> result = new Optional<String>();
        return dialog.showAndWait();
    }*/

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
            //Optional<String> result = selectCompanyDialog();
            //if (result.isPresent()){
            if (true){
                //Company com = getCompanyByName(result.get());
                Company com = getCompanyByName("Volvo");
                //mainApp.showTableWindow(com.getWorkers(), listOfProperties, "Show Company", com.getCompanyName());
                mainApp.showTableWindow(new TableViewHelper("Show Company",com.getCompanyName(),listOfProperties,com.getWorkers()));
                Employee e = new Employee(){
                    public String  jobTitle = this.getClass().getSimpleName();
                };
                /*listOfProperties.clear();
                listOfProperties.addAll(Arrays.asList("model", "type", "carOwner"));
                mainApp.showTableWindow3(FactoryModel.loadCars(), listOfProperties,"Cars", "Cars");*/
            }
        }
    }
    public class getMaxSalary extends ExtEventImpl {

        public getMaxSalary(String eventName) {
            super(eventName);
        }

        @Override
        public void handle(ActionEvent event) {
            //Optional<String> result = selectCompanyDialog();
            //if ( result.isPresent()) {
            if (true) {
                //Company com = getCompanyByName(result.get());
                Company com = getCompanyByName("Volvo");
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
    public class addEmployee extends ExtEventImpl {

        public addEmployee(String eventName) {
            super(eventName);
        }

        @Override
        public void handle(ActionEvent event) {
            System.out.println("test addEmployee");
        }
    }
}
