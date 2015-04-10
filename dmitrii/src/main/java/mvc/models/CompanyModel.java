package mvc.models;

import entities.company.*;
import tools.FileUtil;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mit_OK! on 27.03.2015.
 */
public class CompanyModel {
    private static String configPath = "dmitrii\\src\\main\\resources\\companies\\Config.ini";
    private static String YourDateFormat = "dd.MM.yyyy HH:mm:ss";
    private static String ErrorLogPath = "dmitrii\\src\\main\\resources\\Errors.log";
    public static String getConfigPath() {
        return configPath;
    }
    public static void setConfigPath(String configPath) {
        CompanyModel.configPath = configPath;
    }

    public static ArrayList<Company> getCompanies() throws IOException {
        ArrayList<Company> companies = new ArrayList<>();
        for (int i = 0; i < readConfig().size(); i++) {
            companies.add(companyParse(readConfig().get(i)));
        }
        return companies;
    }
    private static ArrayList<String> readConfig(String ... path) throws IOException {
        ArrayList<String[]> temps;
        ArrayList<String> comPaths = new ArrayList<>();
        if (path.length==0){
            temps = FileUtil.ReadFromFile(getConfigPath(),":");
        } else temps = FileUtil.ReadFromFile(path[0],":");
        for (int i = 0; i < temps.size(); i++) {
            comPaths.add(temps.get(i)[0]);
        }
        return comPaths;
    }
    public static void writeChanges(ArrayList<Company> comps, String ... path) throws IOException {
        ArrayList<String> comPaths = readConfig();
        Boolean wasFound = false;
        for (int i = 0; i < comps.size(); i++) {
            for (int j = 0; j < comPaths.size(); j++) {
                String compName = FileUtil.ReadFromFile(comPaths.get(j),":").get(0)[0];
                if (compName.equals(comps.get(i).getCompanyName())){
                    FileUtil.WriteToFile(comps.get(i).toString(),comPaths.get(j),false);
                    wasFound = true;
                }
            }
            if (wasFound = false){
                    String newFilePath = "dmitrii\\src\\main\\resources\\companies\\"+
                            comps.get(i).getCompanyName()+".txt";
                    FileUtil.WriteToFile(comps.get(i).toString(),newFilePath,false);
                    FileUtil.WriteToFile(newFilePath, getConfigPath(), true);
            }
            wasFound = false;
        }
    }
    public static Company companyParse (String FilePath) throws IOException {
        Boolean noErrors;
        Company com = new Company();
        ArrayList<String[]> companyDump = tools.FileUtil.ReadFromFile(FilePath, Employee.getSeparator());
        com.setCompanyName(companyDump.get(0)[0]);
        ArrayList workers = new ArrayList();
        com.setWorkers(workers);
        for (int i = 1; i < companyDump.size(); i++) {
            noErrors = addWorker(com,companyDump.get(i));
            if (!noErrors){ createErrorMsg(i,companyDump.get(i));}
        }
        return com;
    }
    public static void createErrorMsg (int line, String [] workerString) throws IOException {
        String stringWithError = "[entity undefined]";
        for (String n : workerString){
            stringWithError+=Employee.getSeparator()+n;
        }
        FillErrorLog(line, stringWithError);
    }
    public static Boolean addWorker (Company com, String workerString[]) {
        switch (workerString [0]){
            case "Admin":
                com.getWorkers().add(createAdmin(workerString));
                break;
            case "Manager":
                com.getWorkers().add(createManager(workerString));
                break;
            case "Programmer":
                com.getWorkers().add(createProgrammer(workerString));
                break;
            case "Employee":
                com.getWorkers().add(createEmployee(workerString));
                break;
            default:
                return false;
        }
        return true;
    }
    public static Admin createAdmin(String[] InitString) {
        Admin entity = new Admin();
        entity.setName(InitString[1]);
        entity.setSurname(InitString[2]);
        entity.setSalary(Double.valueOf(InitString[3]));
        entity.setGender(Boolean.valueOf(InitString[4]));
        entity.setAge(Integer.valueOf(InitString[5]));
        entity.setPlatform(InitString[6]);
        return entity;
    }
    public static Manager createManager (String[] InitString){
        Manager entity = new Manager();
        entity.setName(InitString[1]);
        entity.setSurname(InitString[2]);
        entity.setSalary(Double.valueOf(InitString[3]));
        entity.setGender(Boolean.valueOf(InitString[4]));
        entity.setAge(Integer.valueOf(InitString[5]));
        entity.setProjectName(InitString[6]);
        return entity;
    }
    public static Programmer createProgrammer (String[] InitString){
        Programmer entity = new Programmer();
        entity.setName(InitString[1]);
        entity.setSurname(InitString[2]);
        entity.setSalary(Double.valueOf(InitString[3]));
        entity.setGender(Boolean.valueOf(InitString[4]));
        entity.setAge(Integer.valueOf(InitString[5]));
        entity.setLanguage(InitString[6]);
        return entity;
    }
    public static Employee createEmployee ( String[] InitString){
        Employee entity = new Employee();
        entity.setName(InitString[1]);
        entity.setSurname(InitString[2]);
        entity.setSalary(Double.valueOf(InitString[3]));
        entity.setGender(Boolean.valueOf(InitString[4]));
        entity.setAge(Integer.valueOf(InitString[5]));
        return entity;
    }
    private static void FillErrorLog(int lineNumberWithError, String errorMsg) throws IOException {
        Date now = new Date();
        DateFormat formatter = new SimpleDateFormat(YourDateFormat);
        String eventTime = formatter.format(now);
        String txt = eventTime + " line: " + lineNumberWithError + " " + errorMsg+"\n";
        tools.FileUtil.WriteToFile(txt, ErrorLogPath,true);
    }
}
