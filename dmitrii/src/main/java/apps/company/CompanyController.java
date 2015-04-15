package apps.company;

import entities.company.*;
import entities.mvc.CommonController;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;

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
        Boolean hasChanges = false;
        ArrayList<Company> selectedComps; // выбранные компании
        view.showMainMenu();
        try {
            switch (view.next()) {
                case "0": // Показать инфо о сотрудниках компаний в РАСШИРЕННОМ виде
                    view.selectCompanyDialog(comps); // Выводим пользователю список компаний
                    selectedComps = view.selectCompany(comps);// узнаём, какая компания интересует пользователя
                    view.toPrintLN("\t *** Action: SHOW EMPLOYEES FULL INFO ***");
                    view.displayWorkersFULL(selectedComps);
                    break;
                case "1": // Показать инфо о сотрудниках компаний (таблицей)
                    view.selectCompanyDialog(comps);
                    selectedComps = view.selectCompany(comps);
                    view.toPrintLN("\t *** Action: SHOW EMPLOYEES (IN TABLE) ***");
                    view.displayWorkersTable(selectedComps);
                    break;
                case "2": // Узнать сотрудника с самой высокой зарплатой
                    view.selectCompanyDialog(comps);
                    selectedComps = view.selectCompany(comps);
                    view.toPrintLN("\t *** Action: HIGHEST SALARY ***");
                    getMaxSalary(selectedComps);
                    break;
                case "3": // Узнать самую высокооплачиваемую профессию
                    System.out.println("\t *** Action: HIGHEST SALARY BY PROFESSION ***");
                    getMaxSalaryByProf();
                    break;
                case "4": // Остортировать по Зарплате
                    view.selectCompanyDialog(comps);
                    selectedComps = view.selectCompany(comps);
                    view.toPrintLN("\t *** Action: SORT BY SALARY ***");
                    sortBySalary(selectedComps);
                    break;
                case "5":// Остортировать по Возрасту
                    view.selectCompanyDialog(comps);
                    selectedComps = view.selectCompany(comps);
                    view.toPrintLN("\t *** Action: SORT BY AGE ***");
                    sortByAge(selectedComps);
                    break;
                case "6":// Остортировать по длине фамилии
                    view.selectCompanyDialog(comps);
                    selectedComps = view.selectCompany(comps);
                    view.toPrintLN("\t *** Action: SORT BY SURNAME LENGTH ***");
                    sortBySurnameLength(selectedComps);
                    break;
                case "7": // Добавить сотрудника
                    view.selectCompanyDialog(comps, false);
                    selectedComps = view.selectCompany(comps, false);
                    view.toPrintLN("\t *** Action: ADD WORKER ***");
                    Company com = addWorkerIntoCompany(selectedComps.get(0));
                    comps = updateCompany(com, comps);
                    hasChanges = true;
                    break;
                case "8":
                    view.selectCompanyDialog(comps);
                    selectedComps = view.selectCompany(comps);
                    view.toPrintLN("\t *** Action: FIRE AND INCREASE ***");
                    fireAndIncrese(selectedComps);
                    for (int i = 0; i < selectedComps.size(); i++) {
                        comps = updateCompany(selectedComps.get(i), comps);
                    }
                    hasChanges = true;
                    break;
                case "9":
                    view.changeConfigDialog();
                    comps = model.getCompanies();
                    hasChanges = true;
                    break;
                case "exit":
                case "Exit":
                case "e":
                case "E":
                    if (hasChanges) {
                        view.toPrint("Some data was changed. Do You want to SAVE it to File? (y/n): ");
                        if (view.next().equals("y")) {
                            CompanyModel.writeChanges(comps);
                        }
                    }
                    return false;
                default:
                    view.toPrintLN("No such case");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
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
            view.toPrintLN(result);
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
                view.toPrintLN("Profession \'" + profType + "\' is UNDEFINED. All results:");
                getMaxSalary(model.getCompanies());
        }
        if (com != null) {
            view.toShowHighSalary(com.getWorkers().get(0).toString(), com.getCompanyName());
        }
    }


    public void sortBySalary(ArrayList<Company> selectedComps) throws NoSuchMethodException {
        String template = "Job title:Name:Surname:Salary *:Gender:Age:Other";
        Method method = Employee.class.getMethod("getSalary");
        for (Company com : selectedComps) {
            view.displayWorkersTable(model.sortBy(com, method), template);
        }
    }

    public void sortByAge(ArrayList<Company> selectedComps) throws NoSuchMethodException {
        String template = "Job title:Name:Surname:Salary:Gender:Age *:Other";
            Method method = Employee.class.getMethod("getAge");
            for (Company com : selectedComps) {
                view.displayWorkersTable(model.sortBy(com, method), template);
            }
    }

    public void sortBySurnameLength(ArrayList<Company> selectedComps) throws NoSuchMethodException {
        String template = "Job title:Name:Surname *:Salary:Gender:Age:Other";
            Method method = Employee.class.getMethod("getSurname");
            for (Company com : selectedComps) {
                view.displayWorkersTable(model.sortBy(com, method), template);
            }
    }

    private Company addWorkerIntoCompany(Company com) {
        String str[] = view.AddEmployeeDialog();
        if (model.addWorker(com, str)) {
            view.toPrintLN("\nAdd worker: SUCCESS");
            return com;
        } else {
            view.toPrintLN("There was an error during the addition");
        }
        addWorkerNextStep(com, str);
        return com;
    }

    private void addWorkerNextStep(Company com, String[] str) {
        switch (view.goToNextStep(com.getCompanyName())) {
            case "1":
                addWorkerIntoCompany(com);
                break;
            case "2":
                String workerString = "";
                String[] commonStr = str;
                if (Boolean.valueOf(str[4])) {
                    str[4] = "male";
                } else {
                    str[4] = "female";
                }
                for (int i = 0; i < str.length; i++) {
                    workerString += str[i] + Employee.getSeparator();
                }
                view.showWorkerFULL(workerString);
                addWorkerNextStep(com, commonStr);
                break;
            default:
                view.toPrintLN("\nGo back to menu....");
        }
    }

    private ArrayList<Company> fireAndIncrese(ArrayList<Company> selectedComps) {
        Double percent = view.percentDialog();
        for (int i = 0; i < selectedComps.size(); i++) {
            Company com = selectedComps.get(i);
            view.toPrintCompName(com.getCompanyName());
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
                view.toPrint(view.showWorkerSHORT(com.getWorkers().get(i).toString()));
                com.getWorkers().get(i).setSalary(Math.round(com.getWorkers().get(i).getSalary() * (1 + percent)));
                view.toPrintLN(" >>>New Salary (+" + (percent * 100) + "%): " +
                        com.getWorkers().get(i).getSalary() + "$");
            }
        }
        return com;
    }


}
