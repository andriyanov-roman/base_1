package homeproject;

import entities.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by mit_OK! on 27.03.2015.
 */
public class ModelE {
    private static String RegExp = ":";
    private static String YourDateFormat = "dd.MM.yyyy HH:mm:ss";
    private static String ErrorLogPath = "dmitrii\\src\\main\\resources\\Errors.log";

    public static ArrayList<Company> getCompanies() throws IOException {
        Company c1 = CompanyParse("dmitrii\\src\\main\\resources\\companies\\Polaris.txt");
        Company c2 = CompanyParse("dmitrii\\src\\main\\resources\\companies\\Volvo.txt");
        Company c3 = CompanyParse("dmitrii\\src\\main\\resources\\companies\\ZAZ.txt");
        return new ArrayList<Company> (Arrays.asList(c1, c2, c3));
    }


    public static Company CompanyParse (String FilePath) throws IOException {
        Company com = new Company();
        ArrayList<String[]> companyDump = tools.FileUtil.ReadFromFile(FilePath,RegExp);
        com.setCompanyName(companyDump.get(0)[0]);
        ArrayList<Admin> admins = new ArrayList<>();
        com.setAdmins(admins);
        ArrayList<Manager> managers = new ArrayList<>();
        com.setManagers(managers);
        ArrayList<Programmer> programers = new ArrayList<>();
        com.setProgrammers(programers);
        ArrayList<Employee> employees = new ArrayList<>();
        com.setEmployees(employees);
        for (int i = 1; i < companyDump.size(); i++) {
            switch (companyDump.get(i)[0]){
                case "Admin":
                    Admin admin = new Admin();
                    admin = createWorker(admin, companyDump.get(i));
                    com.getAdmins().add(admin);
                    break;
                case "Manager":
                    Manager manager = new Manager();
                    manager = createWorker(manager, companyDump.get(i));
                    com.getManagers().add(manager);
                    break;
                case "Programmer":
                    Programmer programmer = new Programmer();
                    programmer = createWorker(programmer, companyDump.get(i));
                    com.getProgrammers().add(programmer);
                    break;
                case "Employee":
                    Employee e = new Employee();
                    e = createEmployee(e, companyDump.get(i));
                    com.getEmployees().add(e);
                    break;
                default:
                    String stringWithError = "[entity undefined]";
                    for (String n : companyDump.get(i)){
                        stringWithError=stringWithError+RegExp+n;
                    }
                    FillErrorLog(i, stringWithError);
            }
        }
        com.setStuff(com.getEmployees(), com.getAdmins(), com.getManagers(), com.getProgrammers());
        return com;
    }

    private static Admin createWorker(Admin entity, String[] InitString) {
        entity = (Admin) createEmployee(entity,InitString);
        entity.setPlatform(InitString[6]);
          return entity;
    }
    private static Manager createWorker (Manager entity, String[] InitString){
        entity = (Manager)createEmployee(entity,InitString);
        entity.setProjectName(InitString[6]);
        return entity;
    }
    private static Programmer createWorker (Programmer entity, String[] InitString){
        entity = (Programmer) createEmployee(entity, InitString);
        entity.setLanguage(InitString[6]);
        return entity;
    }
    private static Employee createEmployee (Employee entity, String[] InitString){
        entity.setName(InitString[1]);
        entity.setSurname(InitString[2]);
        entity.setSalary(Double.valueOf(InitString[3]));
        entity.setGender(Boolean.valueOf(InitString[4]));
        entity.setAge(Integer.valueOf(InitString[5]));
        return entity;
    }

    private static void FillErrorLog(int lineNumberWithError, String stringWithError) throws IOException {
        Date now = new Date();
        DateFormat formatter = new SimpleDateFormat(YourDateFormat);
        String eventTime = formatter.format(now);
        String txt = eventTime + " line: " + lineNumberWithError + " " + stringWithError+"\n";
        tools.FileUtil.WriteToFile(txt, ErrorLogPath,true);
    }
}
