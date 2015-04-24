package apps.company;

import entities.company.*;
import entities.mvc.CommonController;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by mit_OK! on 27.03.2015.
 */
public class CompanyController extends CommonController {
    CompanyView view;
    CompanyModel model;

    public CompanyController(CompanyView view, CompanyModel model) {
        this.view = view;
        this.model = model;
        run();
    }

    @Override
    public Boolean executeTasks() {
        ArrayList<Company> comps = model.getCompanies();
        ArrayList<Company> selectedComps; // выбранные компании
        view.showMainMenu();
        switch (view.next()) {
            case "0": // Показать инфо о сотрудниках компаний в РАСШИРЕННОМ виде
                view.selectCompanyDialog(comps); // Выводим пользователю список компаний
                selectedComps = view.selectCompany(comps);// узнаём, какая компания интересует пользователя
                view.alert("\t *** Action: SHOW EMPLOYEES FULL INFO ***");
                view.displayWorkersFULL(selectedComps);
                break;
            case "1": // Показать инфо о сотрудниках компаний (таблицей)
                view.selectCompanyDialog(comps);
                selectedComps = view.selectCompany(comps);
                view.alert("\t *** Action: SHOW EMPLOYEES (IN TABLE) ***");
                view.displayWorkersTable(selectedComps);
                break;
            case "2": // Узнать сотрудника с самой высокой зарплатой
                view.selectCompanyDialog(comps);
                selectedComps = view.selectCompany(comps);
                view.alert("\t *** Action: HIGHEST SALARY ***");
                getMaxSalary(selectedComps);
                break;
            case "3": // Узнать самую высокооплачиваемую профессию
                System.out.println("\t *** Action: HIGHEST SALARY BY PROFESSION ***");
                getMaxSalaryByProf();
                break;
            case "4": // Остортировать по Зарплате
                view.selectCompanyDialog(comps);
                selectedComps = view.selectCompany(comps);
                view.alert("\t *** Action: SORT BY SALARY ***");
                sortBySalary(selectedComps);
                break;
            case "5":// Остортировать по Возрасту
                view.selectCompanyDialog(comps);
                selectedComps = view.selectCompany(comps);
                view.alert("\t *** Action: SORT BY AGE ***");
                sortByAge(selectedComps);
                break;
            case "6":// Остортировать по длине фамилии
                view.selectCompanyDialog(comps);
                selectedComps = view.selectCompany(comps);
                view.alert("\t *** Action: SORT BY SURNAME LENGTH ***");
                sortBySurnameLength(selectedComps);
                break;
            case "7": // Добавить сотрудника
                view.selectCompanyDialog(comps, false);
                selectedComps = view.selectCompany(comps, false);
                view.alert("\t *** Action: ADD WORKER ***");
                Company com = addWorkerIntoCompany(selectedComps.get(0));
                break;
            case "8":
                view.selectCompanyDialog(comps);
                selectedComps = view.selectCompany(comps);
                view.alert("\t *** Action: FIRE AND INCREASE ***");
                fireAndIncrese(selectedComps);
                // TODO Перепроверить!!!
                break;
            case "9":
                view.changeConfigDialog();
                comps = model.getCompanies();
                break;
            case "exit":
            case "Exit":
            case "e":
            case "E":
                    view.alertInline("Do You want to SAVE changes to File? (y/n): ");
                    if (view.next().equals("y")) {
                        CompanyModel.writeChanges(comps);
                    }
                return false;
            default:
                view.alert("No such case");
        }
        return true;
    }

    private static ArrayList<Company> updateCompany(Company com, ArrayList<Company> comps) {
        for (int i = 0; i < comps.size(); i++) {
            if (com.getCompanyName().equals(comps.get(i).getCompanyName())) {
                comps.set(i, com);
            }
        }
        return comps;
    }

    public void getMaxSalary(ArrayList<Company> selectedComps) {
        String result = "";
        for (Company com : selectedComps) {
            Employee e = model.getWorkerWithMaxSalaryInComp(com);
            result = "In company \'" + com.getCompanyName() + "\'" +
                    " MAX Salary has: " + view.showWorkerSHORT(e.toString());
            view.alert(result);
        }
    }

    public void getMaxSalaryByProf() {
        String profType = view.addJobTitle();
        Company com = null;
        switch (profType) {
            case "Admin":
                com = model.getMaxSalaryInCompanyWrapper(Admin.class.getName());
                break;
            case "Manager":
                com = model.getMaxSalaryInCompanyWrapper(Manager.class.getName());
                break;
            case "Programmer":
                com = model.getMaxSalaryInCompanyWrapper(Programmer.class.getName());
                break;
            case "Employee":
                com = model.getMaxSalaryInCompanyWrapper(Employee.class.getName());
                break;
            default:
                view.alert("Profession \'" + profType + "\' is UNDEFINED. All results:");
                getMaxSalary(model.getCompanies());
        }
        if (com != null) {
            view.toShowHighSalary(com.getWorkers().get(0).toString(), com.getCompanyName());
        }
    }


    public void sortBySalary(ArrayList<Company> selectedComps) {
        for (Company com : selectedComps) {
            com.getWorkers().sort(new Employee().new CompareBySalary());
            view.displayWorkersTable(com, view.SALARY_HIGHLIGHT);
        }
    }

    public void sortByAge(ArrayList<Company> selectedComps)  {
            for (Company com : selectedComps) {
                com.getWorkers().sort(new Employee().new CompareByAge());
                view.displayWorkersTable(com, view.AGE_HIGHLIGHT);
            }
    }

    public void sortBySurnameLength(ArrayList<Company> selectedComps) {
            for (Company com : selectedComps) {
                com.getWorkers().sort(new Employee().new CompareBySurnameLength());
                view.displayWorkersTable(com, view.SURNAME_HIGHLIGHT);
            }
    }

    private Company addWorkerIntoCompany(Company com) {
        Boolean operationStatus;
        Employee e = model.createWorker(view.AddEmployeeDialog());
        operationStatus = (e!=null);
        view.alert("Create worker: "+(operationStatus ? "SUCCESS" : "FAILED"));
        operationStatus = com.getWorkers().add(e);
        view.alert("Add worker: "+(operationStatus ? "SUCCESS" : "FAILED"));
        addWorkerNextStep(com, e);
        return com;
    }

    private void addWorkerNextStep(Company com, Employee newEmployee) {
        switch (view.goToNextStep(com.getCompanyName())) {
            case "1":
                addWorkerIntoCompany(com);
                break;
            case "2":
                view.showWorkerFULL(newEmployee.toString());
                addWorkerNextStep(com, newEmployee);
                break;
            default:
                view.alert("\nGo back to menu....");
        }
    }

    private ArrayList<Company> fireAndIncrese(ArrayList<Company> selectedComps) {
        Double percent = view.percentDialog();
        for (int i = 0; i < selectedComps.size(); i++) {
            Company com = selectedComps.get(i);
            view.alertInlineCompName(com.getCompanyName());
            com = IncreaseSalary(com, percent);
            com = model.fireStuff(com, true);// true - уволить особей мужского пола
            selectedComps.set(i, com);
        }
        return selectedComps;
    }

    public Company IncreaseSalary(Company com, Double percent) {
        Double newSalary;
        for (int i = 0; i < com.getWorkers().size(); i++) {
            if (com.getWorkers().get(i).getGender() == false) {
                view.alertInline(view.showWorkerSHORT(com.getWorkers().get(i).toString()));
                com.getWorkers().get(i).setSalary(Math.round(com.getWorkers().get(i).getSalary() * (1 + percent)));
                view.alert(" >>>New Salary (+" + (percent * 100) + "%): " +
                        com.getWorkers().get(i).getSalary() + "$");
            }
        }
        return com;
    }


}
