package apps.company;

import entities.company.*;
import entities.mvc.CommonModel;
import tools.FileUtil;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mit_OK! on 27.03.2015.
 */
public class CompanyModel extends CommonModel{
    private static String configPath = "dmitrii\\src\\main\\resources\\companies\\Config.ini";
    private static String YourDateFormat = "dd.MM.yyyy HH:mm:ss";
    private static String ErrorLogPath = "dmitrii\\src\\main\\resources\\Errors.log";
    private ArrayList<Company> companies;
    public static final int WORKER_TYPE = 0;
    public static final int NAME = 1;
    public static final int SURNAME = 2;
    public static final int SALARY= 3;
    public static final int GENDER = 4;
    public static final int AGE = 5;
    public static final int ADDITIONAL_FIELD = 6;

    public CompanyModel() {
        ArrayList<Company> companies = initializeCompanies();
        this.companies = companies;
    }

    public static String getConfigPath() {
        return configPath;
    }

    public static void setConfigPath(String configPath) {
        CompanyModel.configPath = configPath;
    }

    public ArrayList<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(ArrayList<Company> companies) {
        this.companies = companies;
    }

    public ArrayList<Company> initializeCompanies() {
        ArrayList<Company> companies = new ArrayList<>();
        try {
            for (int i = 0; i < readConfig().size(); i++) {
                companies.add(companyParse(readConfig().get(i)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return companies;
    }

    private static ArrayList<String> readConfig(String... path) {
        ArrayList<String[]> temps;
        ArrayList<String> comPaths = new ArrayList<>();
        if (path.length == 0) {
            temps = FileUtil.ReadFromFile(getConfigPath(), ":");
        } else temps = FileUtil.ReadFromFile(path[0], ":");
        for (int i = 0; i < temps.size(); i++) {
            comPaths.add(temps.get(i)[0]);
        }
        return comPaths;
    }

    public static void writeChanges(ArrayList<Company> comps, String... path) {
        ArrayList<String> comPaths = readConfig();
        Boolean wasFound = false;
        for (int i = 0; i < comps.size(); i++) {
            for (int j = 0; j < comPaths.size(); j++) {
                String compName = FileUtil.ReadFromFile(comPaths.get(j), ":").get(0)[0];
                if (compName.equals(comps.get(i).getCompanyName())) {
                    FileUtil.WriteToFile(comps.get(i).toString(), comPaths.get(j), false);
                    wasFound = true;
                }
            }
            if (wasFound = false) {
                String newFilePath = "dmitrii\\src\\main\\resources\\companies\\" +
                        comps.get(i).getCompanyName() + ".txt";
                FileUtil.WriteToFile(comps.get(i).toString(), newFilePath, false);
                FileUtil.WriteToFile(newFilePath, getConfigPath(), true);
            }
            wasFound = false;
        }
    }

    public Company companyParse(String filePath) throws IOException {
        Boolean noErrors;
        Company com = new Company();
        ArrayList<String[]> companyDump = tools.FileUtil.ReadFromFile(filePath, Employee.getSeparator());
        com.setCompanyName(companyDump.get(0)[0]);
        ArrayList<Employee> workers = new ArrayList<>();
        com.setWorkers(workers);
        for (int i = 1; i < companyDump.size(); i++) {
            noErrors = com.getWorkers().add(createWorker(companyDump.get(i)));
            if (!noErrors) {
                createErrorMsg(i, companyDump.get(i),filePath);
            }
        }
        return com;
    }

    public Employee createWorker (String workerString[]) {
        Employee e ;
        switch (workerString[WORKER_TYPE]) {
            case "Admin":
                e = new Admin(createEmployee(workerString),workerString[ADDITIONAL_FIELD]);
                break;
            case "Manager":
                e = new Manager(createEmployee(workerString),workerString[ADDITIONAL_FIELD]);
                break;
            case "Programmer":
                e = new Programmer(createEmployee(workerString),workerString[ADDITIONAL_FIELD]);
                break;
            case "Employee":
                e = createEmployee(workerString);
                break;
            default:
                return null;
        }
        return e;
    }

    public static Employee createEmployee(String[] info) {
        return new Employee(info[NAME],
                info[SURNAME],
                Double.valueOf(info[SALARY]),
                Boolean.valueOf(info[GENDER]),
                Integer.valueOf(info[AGE]));
    }


    public static Employee getWorkerWithMaxSalaryInComp(Company com) {
        Employee eMax =  com.getWorkers().get(0);
        for (int i = 0; i < com.getWorkers().size(); i++) {
            Employee eNext = com.getWorkers().get(i);
            if (eNext.getSalary() > eMax.getSalary()) {
                eMax = eNext;
            }
        }
        return eMax;
    }
    // ************* NEW METHODS
    /*      Возвращает объект типа Company, который имеет поле companyName со значением, идентичным названию компании,
    * в которой работает сотрудник с наибольшей зарплатой.
    *      Также имеет ArrayList<Employee> в котором хранится только один сотрудник - копия сотрудника
    * с наивысшей зарплатой */
    public Company getMaxSalaryInCompanyWrapper(String professionClassName) {
        String workCompany = "";
        Employee eMax = new Employee();
        eMax.setSalary(0.0);
        for (Company com : companies) {
            for (int i = 0; i < com.getWorkers().size(); i++) {
                if (com.getWorkers().get(i).getClass().getName().equals(professionClassName)) {
                    if ((com.getWorkers().get(i)).getSalary() > eMax.getSalary()) {
                        eMax = com.getWorkers().get(i);
                        workCompany = com.getCompanyName();
                    }
                }
            }
        }
        return new Company(workCompany,eMax);
    }

    public static Company fireStuff (Company com, Boolean Gender){
        for (int i = 0; i < com.getWorkers().size(); i++) {
            Employee k = com.getWorkers().get(i);
            if (k.getGender() == Gender){// Если сия особь ТАКОГО пола - уволить!
                System.out.println(k.getName() + " " + k.getSurname() + " (" + k.getGenderName() + ") ...FIRED!");
                com.getWorkers().remove(i);
                i--;
            }
        }
        com.setWorkers(com.getWorkers());
        return com;
    }
    public static void createErrorMsg(int line, String[] workerString, String filePath) throws IOException {
        String stringWithError = "[entity undefined]";
        for (String n : workerString) {
            stringWithError += Employee.getSeparator() + n;
        }
        logFillError(line, stringWithError + " in \'" + filePath + "\'");
    }
    private static void logFillError(int lineNumberWithError, String errorMsg) throws IOException {
        Date now = new Date();
        DateFormat formatter = new SimpleDateFormat(YourDateFormat);
        String eventTime = formatter.format(now);
        String txt = eventTime + " " + errorMsg  + " at line: " + lineNumberWithError + "\n";
        tools.FileUtil.WriteToFile(txt, ErrorLogPath, true);
    }
}
