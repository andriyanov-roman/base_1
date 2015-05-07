package apps.company;

import apps.FXview.DaemonApp;
import apps.FXview.ExtEventImpl;
import apps.FXview.TableViewHelper;
import apps.FXview.overview.OverviewHelper;
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
    private DaemonApp.Dialog dialog;
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
    public ArrayList<String> getCompanyNamesList (){
        ArrayList<String> names = new ArrayList<>();
        for (Company com : model.getCompanies()){
            names.add(com.getCompanyName());
        }
        return names;
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
            dialog = mainApp.new Dialog();
            String result = dialog.chooseFromList("Choose company: ", getCompanyNamesList());
            if (result.length()>0){
                Company com = getCompanyByName(result);
                mainApp.showTableWindow(new TableViewHelper("Show Company",com.getCompanyName(),listOfProperties,com.getWorkers()));
                Employee e = new Employee(){
                    public String  jobTitle = this.getClass().getSimpleName();
                };
            }
        }
    }
    public class getMaxSalary extends ExtEventImpl {

        public getMaxSalary(String eventName) {
            super(eventName);
        }

        @Override
        public void handle(ActionEvent event) {
            dialog = mainApp.new Dialog();
            String result = dialog.chooseFromList("Choose company: ", getCompanyNamesList());
            if (result.length()>0){
                Company com = getCompanyByName(result);
                Employee e = model.getWorkerWithMaxSalaryInComp(com);
                OverviewHelper<Employee> ohe = new OverviewHelper<>(e,true,"separator");
                ohe.setTitle(com.getCompanyName());
                ohe.setSubTitle(e.getClass().getSimpleName());
                ohe.setIconChar(e.getGender() ? OverviewHelper.MALE_ICON : OverviewHelper.FEMALE_ICON);
                ohe.addReplacedPair("gender", e.getGenderName());
                ohe.setWindowTitle("EMPLOYEE WITH HIGHEST SALARY");
                mainApp.showEntity(ohe);
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
