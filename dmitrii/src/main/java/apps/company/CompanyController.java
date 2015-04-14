package apps.company;

import entities.company.*;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by mit_OK! on 27.03.2015.
 */
public class CompanyController {

    public CompanyController() {
    }

    public static void run() {
        ArrayList<Company> comps = CompanyModel.getCompanies();
        Boolean ShowMenuTag = true;
        Boolean hasChanges = false;
        ArrayList<Company> selectedComps; // выбранные компании
        CompanyView.welcome();
        while (CompanyView.hasNext()) {
            switch (CompanyView.next()) {
                case "0": // Показать инфо о сотрудниках компаний в РАСШИРЕННОМ виде
                    CompanyView.selectCompanyDialog(comps); // Выводим пользователю список компаний
                    selectedComps = CompanyView.selectCompany(comps);// узнаём, какая компания интересует пользователя
                    CompanyView.toPrintLN("\t *** Action: SHOW EMPLOYEES FULL INFO ***");
                    CompanyView.displayWorkersFULL(selectedComps);
                    break;
                case "1": // Показать инфо о сотрудниках компаний (таблицей)
                    CompanyView.selectCompanyDialog(comps);
                    selectedComps = CompanyView.selectCompany(comps);
                    CompanyView.toPrintLN("\t *** Action: SHOW EMPLOYEES (IN TABLE) ***");
                    CompanyView.displayWorkersTable(selectedComps);
                    break;
                case "2": // Узнать сотрудника с самой высокой зарплатой
                    CompanyView.selectCompanyDialog(comps);
                    selectedComps = CompanyView.selectCompany(comps);
                    CompanyView.toPrintLN("\t *** Action: HIGHEST SALARY ***");
                    getMaxSalary(selectedComps);
                    break;
                case "3": // Узнать самую высокооплачиваемую профессию
                    System.out.println("\t *** Action: HIGHEST SALARY BY PROFESSION ***");
                    getMaxSalaryByProf(comps);
                    break;
                case "4": // Остортировать по Зарплате
                    CompanyView.selectCompanyDialog(comps);
                    selectedComps = CompanyView.selectCompany(comps);
                    CompanyView.toPrintLN("\t *** Action: SORT BY SALARY ***");
                    sortBySalary(selectedComps);
                    break;
                case "5":// Остортировать по Возрасту
                    CompanyView.selectCompanyDialog(comps);
                    selectedComps = CompanyView.selectCompany(comps);
                    CompanyView.toPrintLN("\t *** Action: SORT BY AGE ***");
                    sortByAge(selectedComps);
                    break;
                case "6":// Остортировать по длине фамилии
                    CompanyView.selectCompanyDialog(comps);
                    selectedComps = CompanyView.selectCompany(comps);
                    CompanyView.toPrintLN("\t *** Action: SORT BY SURNAME LENGTH ***");
                    sortBySurnameLength(selectedComps);
                    break;
                case "7": // Добавить сотрудника
                    CompanyView.selectCompanyDialog(comps, false);
                    selectedComps = CompanyView.selectCompany(comps, false);
                    CompanyView.toPrintLN("\t *** Action: ADD WORKER ***");
                    Company com = addWorker(selectedComps.get(0));
                    comps = updateCompany(com,comps);
                    hasChanges = true;
                    break;
                case "8":
                    CompanyView.selectCompanyDialog(comps);
                    selectedComps = CompanyView.selectCompany(comps);
                    CompanyView.toPrintLN("\t *** Action: FIRE AND INCREASE ***");
                    fireAndIncrese(selectedComps);
                    for (int i = 0; i < selectedComps.size(); i++) {
                       comps = updateCompany(selectedComps.get(i),comps);
                    }
                    hasChanges = true;
                    break;
                case "9":
                    CompanyView.changeConfigDialog();
                    comps = CompanyModel.getCompanies();
                    hasChanges = true;
                    break;
                case "m":
                    CompanyView.welcome();
                    ShowMenuTag = false;
                    break;
                case "exit":
                case "Exit":
                case "e":
                case "E":
                    if (hasChanges){
                        CompanyView.toPrint("Some data was changed. Do You want to SAVE it to File? (y/n): ");
                        if (CompanyView.next().equals("y")){
                            CompanyModel.writeChanges(comps);}
                    }
                    return;
                default:
                    CompanyView.toPrintLN("No such case");
                    ShowMenuTag = true;
            }
            if (ShowMenuTag == true) {
                CompanyView.toPrint("\n\'m\' -- show CompanyMain MENU or 0-7,e -- run task: ");
            }
            ShowMenuTag = true;
        }
    }

    private static ArrayList<Company> updateCompany(Company com, ArrayList<Company> comps) {
        for (int i = 0; i < comps.size(); i++) {
            if (com.getCompanyName().equals(comps.get(i).getCompanyName())){
                comps.set(i,com);
            }
        }
        return comps;
    }

    public static void getMaxSalary(ArrayList<Company> selectedComps) {
        String result = "";
        for (Company com : selectedComps) {
            Employee e = getWorkerWithMaxSalaryInComp(com);
            result = "In company \'" + com.getCompanyName() + "\'" +
                    " MAX Salary has: " + CompanyView.showWorkerSHORT(e.toString());
            CompanyView.toPrintLN(result);
        }
    }

    public static Employee getWorkerWithMaxSalaryInComp(Company com) {
        Employee eMax = (Employee) com.getWorkers().get(0);
        for (int i = 0; i < com.getWorkers().size(); i++) {
            Employee eNext = (Employee) com.getWorkers().get(i);
            if (eNext.getSalary() > eMax.getSalary()) {
                eMax = eNext;
            }
        }
        return eMax;
    }

    public static void getMaxSalaryByProf(ArrayList<Company> comps) {
        String profType = CompanyView.addJobTitle();
        switch (profType) {
            case "Admin":
                getMaxAdmin(comps);
                break;
            case "Manager":
                getMaxManager(comps);
                break;
            case "Programmer":
                getMaxProgrammer(comps);
                break;
            case "Employee":
                getMaxEmployee(comps);
                break;
            default:
                CompanyView.toPrintLN("Profession \'" + profType + "\' is UNDEFINED. All results:");
                getMaxSalary(comps);
        }
    }

    public static void getMaxAdmin(ArrayList<Company> comps) {
        String workCompany = "";
        Admin aMax = new Admin();
        aMax.setSalary(0.0);
        for (Company com : comps) {
            for (int i = 0; i < com.getWorkers().size(); i++) {
                if (com.getWorkers().get(i) instanceof Admin) {
                    if (((Admin) com.getWorkers().get(i)).getSalary() > aMax.getSalary()) {
                        aMax = (Admin) com.getWorkers().get(i);
                        workCompany = com.getCompanyName();
                    }
                }
            }
        }
        CompanyView.toShowHighSalary(aMax.toString(), workCompany);
    }

    public static void getMaxManager(ArrayList<Company> comps) {
        String workCompany = "";
        Manager aMax = new Manager();
        aMax.setSalary(0.0);
        for (Company com : comps) {
            for (int i = 0; i < com.getWorkers().size(); i++) {
                if (com.getWorkers().get(i) instanceof Manager) {
                    if (((Manager) com.getWorkers().get(i)).getSalary() > aMax.getSalary()) {
                        aMax = (Manager) com.getWorkers().get(i);
                        workCompany = com.getCompanyName();
                    }
                }
            }
        }
        CompanyView.toShowHighSalary(aMax.toString(), workCompany);
    }

    public static void getMaxProgrammer(ArrayList<Company> comps) {
        String workCompany = "";
        Programmer aMax = new Programmer();
        aMax.setSalary(0.0);
        for (Company com : comps) {
            for (int i = 0; i < com.getWorkers().size(); i++) {
                if (com.getWorkers().get(i) instanceof Programmer) {
                    if (((Programmer) com.getWorkers().get(i)).getSalary() > aMax.getSalary()) {
                        aMax = (Programmer) com.getWorkers().get(i);
                        workCompany = com.getCompanyName();
                    }
                }
            }
        }
        CompanyView.toShowHighSalary(aMax.toString(), workCompany);
    }

    public static void getMaxEmployee(ArrayList<Company> comps) {
        String workCompany = "";
        Employee aMax = new Employee();
        aMax.setSalary(0.0);
        for (Company com : comps) {
            for (int i = 0; i < com.getWorkers().size(); i++) {
                String profType = com.getWorkers().get(i).getClass().getSimpleName();
                if (profType.equals("Employee")) {
                    if (((Employee) com.getWorkers().get(i)).getSalary() > aMax.getSalary()) {
                        aMax = (Employee) com.getWorkers().get(i);
                        workCompany = com.getCompanyName();
                    }
                }
            }
        }
        CompanyView.toShowHighSalary(aMax.toString(), workCompany);
    }

    public static void sortBySalary(ArrayList<Company> selectedComps) {
        ArrayList workers;
        for (int k = 0; k < selectedComps.size(); k++) {
            workers = selectedComps.get(k).getWorkers();
            for (int i = 0; i < workers.size() - 1; i++) {
                for (int j = 0; j < workers.size() - 1 - i; j++) {
                    if (((Employee) workers.get(j + 1)).getSalary() < ((Employee) workers.get(j)).getSalary()) {
                        workers = MoveIt(workers, j);
                    }
                }
            }
            selectedComps.get(k).setWorkers(workers);
        }
        String template = "Job title:Name:Surname:Salary *:Gender:Age:Other";
        CompanyView.displayWorkersTable(selectedComps, template);
    }

    public static void sortByAge(ArrayList<Company> selectedComps) {
        ArrayList workers;
        for (int k = 0; k < selectedComps.size(); k++) {
            workers = selectedComps.get(k).getWorkers();
            for (int i = 0; i < workers.size() - 1; i++) {
                for (int j = 0; j < workers.size() - 1 - i; j++) {
                    if (((Employee) workers.get(j + 1)).getAge() < ((Employee) workers.get(j)).getAge()) {
                        workers = MoveIt(workers, j);
                    }
                }
            }
            selectedComps.get(k).setWorkers(workers);
        }
        String template = "Job title:Name:Surname:Salary:Gender:Age *:Other";
        CompanyView.displayWorkersTable(selectedComps, template);
    }

    public static void sortBySurnameLength(ArrayList<Company> selectedComps) {
        ArrayList workers;
        for (int k = 0; k < selectedComps.size(); k++) {
            workers = selectedComps.get(k).getWorkers();
            for (int i = 0; i < workers.size() - 1; i++) {
                for (int j = 0; j < workers.size() - 1 - i; j++) {
                    Employee eNext = (Employee) workers.get(j + 1);
                    Employee eCurr = (Employee) workers.get(j);
                    if (eNext.getSurname().length() < eCurr.getSurname().length()) {
                        workers = MoveIt(workers, j);
                    }
                }
            }
            selectedComps.get(k).setWorkers(workers);
        }
        String template = "Job title:Name:Surname *:Salary:Gender:Age:Other";
        CompanyView.displayWorkersTable(selectedComps, template);
    }

    private static ArrayList MoveIt(ArrayList workers, int j) {
        Object temp = workers.get(j);
        workers.set(j, workers.get(j + 1));
        workers.set(j + 1, temp);
        return workers;
    }

    private static Company addWorker(Company com) {
        String str[] = CompanyView.AddEmployeeDialog();
        switch (str[0]) {
            case "Admin":
                com.getWorkers().add(CompanyModel.createAdmin(str));
                break;
            case "Programmer":
                com.getWorkers().add(CompanyModel.createProgrammer(str));
                break;
            case "Manager":
                com.getWorkers().add(CompanyModel.createManager(str));
                break;
            case "Employee":
                com.getWorkers().add(CompanyModel.createEmployee(str));
                break;
            default:
                CompanyView.toPrintLN("Worker doesn't create! Return to menu");
                return com;
        }
        CompanyView.toPrintLN("\nAdd worker: SUCCESS");
        addWorkerNextStep(com, str);
        return com;
    }
    private static void addWorkerNextStep (Company com, String [] str){
        switch (CompanyView.goToNextStep(com.getCompanyName())){
            case "1":
                addWorker(com);
                break;
            case "2":
                String workerString = "";
                String[] commonStr = str;
                if (Boolean.valueOf(str[4])){str[4] = "male";}
                else {str[4]="female";}
                for (int i = 0; i < str.length; i++) {
                    workerString+=str[i]+Employee.getSeparator();
                }
                CompanyView.showWorkerFULL(workerString);
                addWorkerNextStep(com,commonStr);
                break;
            default:
                CompanyView.toPrintLN("\nGo back to menu....");
        }
    }
    private static ArrayList<Company> fireAndIncrese(ArrayList<Company> selectedComps) {
        Double percent = CompanyView.percentDialog();
        for (int i = 0; i < selectedComps.size(); i++) {
            Company com = selectedComps.get(i);
            CompanyView.toPrintCompName(com.getCompanyName());
            com = IncreaseSalary(com, percent);
            com = fireStuff(com, "male");
            selectedComps.set(i,com);
        }
        return selectedComps;
    }
    public static Company IncreaseSalary (Company com, Double percent){
        Double newSalary;
        for (int i = 0; i < com.getWorkers().size(); i++) {
            switch (com.getWorkers().get(i).getClass().getSimpleName()){
                case "Admin":
                    com = changeAdminSalary(i,com,percent);
                    break;
                case "Manager":
                    com = changeManagerSalary(i, com, percent);
                    break;
                case "Programmer":
                    com = changeProgSalary(i, com, percent);
                    break;
                case "Employee":
                    com = changeEmplSalary(i, com, percent);
            }
        }
        return com;
    }
    private static Company changeAdminSalary(int i, Company com, Double percent){
        Admin admin = (Admin)com.getWorkers().get(i);
        if (admin.getGender().equals("female") ){
            CompanyView.toPrint(CompanyView.showWorkerSHORT(admin.toString()));
            admin.setSalary(Math.round(admin.getSalary() * (1 + percent)));
            CompanyView.toPrintLN(" >>>New Salary (+" + (percent * 100) + "%): " + admin.getSalary() + "$");
            com.getWorkers().set(i,admin);
        }
        return com;
    }
    private static Company changeManagerSalary(int i, Company com, Double percent){
        Manager manager = (Manager)com.getWorkers().get(i);
        if (manager.getGender().equals("female") ){
            CompanyView.toPrint(CompanyView.showWorkerSHORT(manager.toString()));
            manager.setSalary(Math.round(manager.getSalary() * (1 + percent)));
            CompanyView.toPrintLN(" >>>New Salary (+" + (percent * 100) + "%): " + manager.getSalary() + "$");
            com.getWorkers().set(i,manager);
        }
        return com;
    }
    private static Company changeProgSalary(int i, Company com, Double percent){
        Programmer prog = (Programmer)com.getWorkers().get(i);
        if (prog.getGender().equals("female") ){
            CompanyView.toPrint(CompanyView.showWorkerSHORT(prog.toString()));
            prog.setSalary(Math.round(prog.getSalary() * (1 + percent)));
            CompanyView.toPrintLN(" >>>New Salary (+" + (percent * 100) + "%): " + prog.getSalary() + "$");
        }
        return com;
    }
    private static Company changeEmplSalary(int i, Company com, Double percent) {
        Employee e = (Employee)com.getWorkers().get(i);
        if (e.getGender().equals("female") ){
            CompanyView.toPrint(CompanyView.showWorkerSHORT(e.toString()));
            e.setSalary(Math.round(e.getSalary() * (1 + percent)));
            CompanyView.toPrintLN(" >>>New Salary (+" + (percent * 100) + "%): " + e.getSalary() + "$");
            com.getWorkers().set(i, e);
        }
        return com;
    }
    public static Company fireStuff (Company com, String Gender){
        for (int i = 0; i < com.getWorkers().size(); i++) {
            Employee k = (Employee) com.getWorkers().get(i);
            if (k.getGender().equals(Gender)){// Если сия особь ТАКОГО пола - уволить!
                System.out.println(k.getName() + " " + k.getSurname() + " (" + k.getGender() + ") ...FIRED!");
                com.getWorkers().remove(i);
                i--;
            }
        }
        com.setWorkers(com.getWorkers());
        return com;
    }

}
