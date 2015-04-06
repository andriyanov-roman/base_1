package company_project;

import entities.company.*;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by mit_OK! on 27.03.2015.
 */
public class ControllerE {

    public static void run() throws IOException {
        ArrayList<Company> comps = ModelE.getCompanies();
        Boolean ShowMenuTag = true;
        Boolean hasChanges = false;
        ArrayList<Company> selectedComps; // выбранные компании
        ViewE.welcome();
        while (ViewE.hasNext()) {
            switch (ViewE.next()) {
                case "0": // Показать инфо о сотрудниках компаний в РАСШИРЕННОМ виде
                    ViewE.selectCompanyDialog(comps); // Выводим пользователю список компаний
                    selectedComps = ViewE.selectCompany(comps);// узнаём, какая компания интересует пользователя
                    ViewE.toPrintLN("\t *** Action: SHOW EMPLOYEES FULL INFO ***");
                    ViewE.displayWorkersFULL(selectedComps);
                    break;
                case "1": // Показать инфо о сотрудниках компаний (таблицей)
                    ViewE.selectCompanyDialog(comps);
                    selectedComps = ViewE.selectCompany(comps);
                    ViewE.toPrintLN("\t *** Action: SHOW EMPLOYEES (IN TABLE) ***");
                    ViewE.displayWorkersTable(selectedComps);
                    break;
                case "2": // Узнать сотрудника с самой высокой зарплатой
                    ViewE.selectCompanyDialog(comps);
                    selectedComps = ViewE.selectCompany(comps);
                    ViewE.toPrintLN("\t *** Action: HIGHEST SALARY ***");
                    getMaxSalary(selectedComps);
                    break;
                case "3": // Узнать самую высокооплачиваемую профессию
                    System.out.println("\t *** Action: HIGHEST SALARY BY PROFESSION ***");
                    getMaxSalaryByProf(comps);
                    break;
                case "4": // Остортировать по Зарплате
                    ViewE.selectCompanyDialog(comps);
                    selectedComps = ViewE.selectCompany(comps);
                    ViewE.toPrintLN("\t *** Action: SORT BY SALARY ***");
                    sortBySalary(selectedComps);
                    break;
                case "5":// Остортировать по Возрасту
                    ViewE.selectCompanyDialog(comps);
                    selectedComps = ViewE.selectCompany(comps);
                    ViewE.toPrintLN("\t *** Action: SORT BY AGE ***");
                    sortByAge(selectedComps);
                    break;
                case "6":// Остортировать по длине фамилии
                    ViewE.selectCompanyDialog(comps);
                    selectedComps = ViewE.selectCompany(comps);
                    ViewE.toPrintLN("\t *** Action: SORT BY SURNAME LENGTH ***");
                    sortBySurnameLength(selectedComps);
                    break;
                case "7": // Добавить сотрудника
                    ViewE.selectCompanyDialog(comps,false);
                    selectedComps = ViewE.selectCompany(comps,false);
                    ViewE.toPrintLN("\t *** Action: ADD WORKER ***");
                    Company com = addWorker(selectedComps.get(0));
                    comps = updateCompany(com,comps);
                    hasChanges = true;
                    break;
                case "8":
                    ViewE.selectCompanyDialog(comps);
                    selectedComps = ViewE.selectCompany(comps);
                    ViewE.toPrintLN("\t *** Action: FIRE AND INCREASE ***");
                    fireAndIncrese(selectedComps);
                    for (int i = 0; i < selectedComps.size(); i++) {
                       comps = updateCompany(selectedComps.get(i),comps);
                    }
                    hasChanges = true;
                    break;
                case "9":
                    ViewE.changeConfigDialog();
                    comps = ModelE.getCompanies();
                    hasChanges = true;
                    break;
                case "m":
                    ViewE.welcome();
                    ShowMenuTag = false;
                    break;
                case "exit":
                case "Exit":
                case "e":
                case "E":
                    if (hasChanges){
                        ViewE.toPrint("Some data was changed. Do You want to SAVE it to File? (y/n): ");
                        if (ViewE.next().equals("y")){ModelE.writeChanges(comps);}
                    }
                    System.exit(0);
                default:
                    ViewE.toPrintLN("No such case");
                    ShowMenuTag = true;
            }
            if (ShowMenuTag == true) {
                ViewE.toPrint("\n\'m\' -- show Main MENU or 0-7,e -- run task: ");
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
                    " MAX Salary has: " + ViewE.showWorkerSHORT(e.toString());
            ViewE.toPrintLN(result);
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
        String profType = ViewE.addJobTitle();
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
                ViewE.toPrintLN("Profession \'" + profType + "\' is UNDEFINED. All results:");
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
        ViewE.toShowHighSalary(aMax.toString(), workCompany);
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
        ViewE.toShowHighSalary(aMax.toString(), workCompany);
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
        ViewE.toShowHighSalary(aMax.toString(), workCompany);
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
        ViewE.toShowHighSalary(aMax.toString(), workCompany);
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
        ViewE.displayWorkersTable(selectedComps, template);
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
        ViewE.displayWorkersTable(selectedComps, template);
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
        ViewE.displayWorkersTable(selectedComps, template);
    }

    private static ArrayList MoveIt(ArrayList workers, int j) {
        Object temp = workers.get(j);
        workers.set(j, workers.get(j + 1));
        workers.set(j + 1, temp);
        return workers;
    }

    private static Company addWorker(Company com) {
        String str[] = ViewE.AddEmployeeDialog();
        switch (str[0]) {
            case "Admin":
                com.getWorkers().add(ModelE.createAdmin(str));
                break;
            case "Programmer":
                com.getWorkers().add(ModelE.createProgrammer(str));
                break;
            case "Manager":
                com.getWorkers().add(ModelE.createManager(str));
                break;
            case "Employee":
                com.getWorkers().add(ModelE.createEmployee(str));
                break;
            default:
                ViewE.toPrintLN("Worker doesn't create! Return to menu");
                return com;
        }
        ViewE.toPrintLN("\nAdd worker: SUCCESS");
        addWorkerNextStep(com, str);
        return com;
    }
    private static void addWorkerNextStep (Company com, String [] str){
        switch (ViewE.goToNextStep(com.getCompanyName())){
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
                ViewE.showWorkerFULL(workerString);
                addWorkerNextStep(com,commonStr);
                break;
            default:
                ViewE.toPrintLN("\nGo back to menu....");
        }
    }
    private static ArrayList<Company> fireAndIncrese(ArrayList<Company> selectedComps) {
        Double percent = ViewE.percentDialog();
        for (int i = 0; i < selectedComps.size(); i++) {
            Company com = selectedComps.get(i);
            ViewE.toPrintCompName(com.getCompanyName());
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
            ViewE.toPrint(ViewE.showWorkerSHORT(admin.toString()));
            admin.setSalary(Math.round(admin.getSalary() * (1 + percent)));
            ViewE.toPrintLN(" >>>New Salary (+"+(percent * 100) + "%): " + admin.getSalary() + "$");
            com.getWorkers().set(i,admin);
        }
        return com;
    }
    private static Company changeManagerSalary(int i, Company com, Double percent){
        Manager manager = (Manager)com.getWorkers().get(i);
        if (manager.getGender().equals("female") ){
            ViewE.toPrint(ViewE.showWorkerSHORT(manager.toString()));
            manager.setSalary(Math.round(manager.getSalary() * (1 + percent)));
            ViewE.toPrintLN(" >>>New Salary (+"+(percent * 100) + "%): " + manager.getSalary() + "$");
            com.getWorkers().set(i,manager);
        }
        return com;
    }
    private static Company changeProgSalary(int i, Company com, Double percent){
        Programmer prog = (Programmer)com.getWorkers().get(i);
        if (prog.getGender().equals("female") ){
            ViewE.toPrint(ViewE.showWorkerSHORT(prog.toString()));
            prog.setSalary(Math.round(prog.getSalary() * (1 + percent)));
            ViewE.toPrintLN(" >>>New Salary (+" + (percent * 100) + "%): " + prog.getSalary() + "$");
        }
        return com;
    }
    private static Company changeEmplSalary(int i, Company com, Double percent) {
        Employee e = (Employee)com.getWorkers().get(i);
        if (e.getGender().equals("female") ){
            ViewE.toPrint(ViewE.showWorkerSHORT(e.toString()));
            e.setSalary(Math.round(e.getSalary() * (1 + percent)));
            ViewE.toPrintLN(" >>>New Salary (+" + (percent * 100) + "%): " + e.getSalary() + "$");
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
