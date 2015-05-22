package apps.FXview.events;

import apps.FXview.DaemonApp;
import apps.FXview.helpers.TableViewHelper;
import apps.FXview.overview.NameFieldValidator;
import apps.FXview.overview.OverviewHelper;
import apps.company.CompanyModel;
import entities.company.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;
import java.util.Arrays;

//import javafx.scene.control.ChoiceDialog;

/**
 * Created by mit_OK! on 29.04.2015.
 */
public class CompanyEventContainer extends CommonEventContainer {
    private CompanyModel model = new CompanyModel();
    public CompanyEventContainer(DaemonApp app) {
        super(app);
    }
    public ArrayList<EventHandler<ActionEvent>> getEvents() {
        ArrayList<EventHandler<ActionEvent>> companyEvents = new ArrayList<>();
        companyEvents.add(new showCompany("Show Company"));
        companyEvents.add(new getMaxSalary("Get Highest salary by Company"));
        companyEvents.add(new getMaxSalaryByProfession("Get Highest salary by Proffesion"));
        companyEvents.add(new addEmployee("Fire and Increase Stuff"));
        companyEvents.add(new addEmployee("Add Employee"));
        companyEvents.add(new addEmployee("Test"));
        return companyEvents;
    }
    public ArrayList<String> getPropertiesList (){
        return new ArrayList<>(Arrays.asList("name","surname",
                "salary","gender","age","platform","projectName","language"));
    }
    public ArrayList<String> getCompanyNamesList (){
        ArrayList<String> names = new ArrayList<>();
        for (Company com : model.getCompanies()){
            names.add(com.getCompanyName());
        }
        return names;
    }
    public ArrayList<String> getAvaliableProfessions (){
        return new ArrayList<>(Arrays.asList("Employee","Admin","Programmer","Manager"));
    }
    private OverviewHelper<Employee> createEmplForDisplaying (Employee e,Company com){
        Boolean useSuperFields = !e.getClass().getSimpleName().equals("Employee");
        OverviewHelper<Employee> ohe = new OverviewHelper<>(e,useSuperFields,"separator");
        ohe.setTitle(com.getCompanyName());
        ohe.setSubTitle(e.getClass().getSimpleName());
        ohe.setIconChar(e.getGender() ? OverviewHelper.MALE_ICON : OverviewHelper.FEMALE_ICON);
        ohe.replaceFieldDisplayValue("gender", e.getGenderName());
        ohe.replaceFieldDisplayName("projectName", "project name");
        return ohe;
    }
    public Company getCompanyByName (String companyName){
        for (Company com : model.getCompanies()){
            if (com.getCompanyName().equals(companyName)){
                return com;
            }
        }
        return null;
    }
    // ================  Event classes ===============================
    public class showCompany extends EventWithNameImpl {
        public showCompany(String eventName) {
            super(eventName);
        }
        @Override
        public void handle(ActionEvent event) {
            dialog = mainApp.new Dialog();
            String result = dialog.chooseFromList("Choose company: ", getCompanyNamesList());
            if (result.length()>0){
                Company com = getCompanyByName(result);
                mainApp.showTableWindow(new TableViewHelper<>("Show Company", com.getCompanyName(),
                        listOfProperties, com.getWorkers()));
            }
        }
    }
    public class getMaxSalary extends EventWithNameImpl {
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
                OverviewHelper<Employee> ohe = createEmplForDisplaying(e,com);
                ohe.setWindowTitle("EMPLOYEE WITH HIGHEST SALARY");
                mainApp.showEntity(ohe);
            }


        }
    }
    public class getMaxSalaryByProfession extends EventWithNameImpl {
        public getMaxSalaryByProfession(String eventName) {
            super(eventName);
        }

        @Override
        public void handle(ActionEvent event) {
            dialog = mainApp.new Dialog();
            String result = dialog.chooseFromList("Choose profession: ", getAvaliableProfessions());
            if (result.length()>0){
                Company com = model.getMaxSalaryInCompanyWrapper(result);
                OverviewHelper<Employee> ohe = createEmplForDisplaying(com.getWorkers().get(0), com);
                ohe.setWindowTitle("HIGHEST SALARY BY PROFESSION");
                mainApp.showEntity(ohe);
            }
        }
    }
    public class addEmployee extends EventWithNameImpl {

        public addEmployee(String eventName) {
            super(eventName);
        }

        @Override
        public void handle(ActionEvent event) {
            dialog = mainApp.new Dialog();
            String result = dialog.chooseFromList("Choose company: ", getCompanyNamesList());
            String resultJobTitle = dialog.chooseFromList("Choose profession: ", getAvaliableProfessions());
            Employee e;
            Boolean useSuperFields = false;
            switch (resultJobTitle){
                case "Admin": e = new Admin();
                    useSuperFields = true;
                    break;
                case "Manager": e = new Manager();
                    useSuperFields = true;
                    break;
                case "Programmer": e = new Programmer();
                    useSuperFields = true;
                    break;
                default: e = new Employee();
            }
            e.setName("NewName");
            e.setSurname("NewSurname");
            e.setSalary(0);
            e.setAge(18);
            e.setGender(true);
            if (result.length()>0){
                Company com = getCompanyByName(result);
                OverviewHelper<Employee> ohe = new OverviewHelper<>(e,useSuperFields,"separator");
                ohe.setWindowTitle("Add employee");
                ohe.setTitle(result);
                ohe.setSubTitle(e.getClass().getSimpleName());
                ohe.setForbidEditing(false);
                ohe.setFieldValidatorByName("name", new NameFieldValidator());
                mainApp.showEntity(ohe);
                com.getWorkers().add(ohe.getEntity());
                model.updateCompanies(com);
                model.saveChanges();
            }
        }
    }
}
