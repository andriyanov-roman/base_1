package methods;

/**
 * Created by Администратор on 27.03.2015.
 */

import entities.Manager;
import entities.Programmer;
import entities.Sysadmin;
import entities.Employee;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class CompanyMethods {
    public static void main (String [] args) throws IOException {
        startBSE();
    }
    public static Scanner scanner = new Scanner(System.in);

    public static void startBSE()throws IOException{
        boolean add = true;
        showMenu();
        while (add) {
            //Employee employee = new Employee();
            String choise = scanner.next();
            switch (choise){
                case "1": //Show all employees
                    showManagers(getManagersFromFile());
                    showProgrammers(getProgrammersFromFile());
                    showSysadmins(getSysadminsFromFile());
                    break;
                case "2": //Show Managers
                    showManagers(getManagersFromFile());
                    break;
                case "3": //Show Programmers
                    showProgrammers(getProgrammersFromFile());
                    break;
                case "4": //Show Sysadmins
                    showSysadmins(getSysadminsFromFile());
                    break;
                case "5": //Show Manager with biggest salary
                    showManager(getTheBiggestSalaryManager());
                    break;
                case "6": //Show Programmer with biggest salary
                    showProgrammer(getTheBiggestSalaryProgrammer());
                    break;
                case "7": //Show Sysadmin with biggest salary
                    showSysadmin(getTheBiggestSalarySysadmin());
                    break;
                case "8": //Show Eployee form all employees with biggest salary
                    showTheBiggestSalaryEmployee();
                    break;
            }

            showMenu();
        }
    }
    public static void showMenu(){
        System.out.println( "-------------------------\n" +
                        "1. Show all employees" + "\n" +
                        "2. Show Managers" +  "\n" +
                        "3. Show Programmers" + "\n" +
                        "4. Show Sysadmins" + "\n" +
                        "5. Show Manager with biggest salary" + "\n" +
                        "6. Show Programmer with biggest salary" + "\n" +
                        "7. Show Sysadmin with biggest salary" + "\n" +
                        "8. Show Eployee form all employees with biggest salary" + "\n"
        );

    }
    public static ArrayList<Manager> getManagers(){
        ArrayList<Manager> managers = new ArrayList<>();
        return managers;
    }
    public static void showTheBiggestSalaryEmployee()throws IOException{

        double managerSalary = getTheBiggestSalaryManager().getSalary();
        double programmerSalary = getTheBiggestSalaryProgrammer().getSalary();
        double adminSalary = getTheBiggestSalarySysadmin().getSalary();

        if ((managerSalary > programmerSalary)&(managerSalary>adminSalary)){
            showManager(getTheBiggestSalaryManager());
        }
        else if((programmerSalary>managerSalary)&(programmerSalary>adminSalary)){
            showProgrammer(getTheBiggestSalaryProgrammer());
        }
        else if((adminSalary>managerSalary)&(adminSalary>programmerSalary)){
            showSysadmin(getTheBiggestSalarySysadmin());
        }
       // ArrayList<Employee> employees = new ArrayList<>();
       // employees.add(getTheBiggestSalaryManager());
       // employees.add(getTheBiggestSalaryProgrammer());
      //  employees.add(getTheBiggestSalarySysadmin());
      //  showEmployee(getTheBiggestSalaryEmployee(employees));
    }

    public static Employee getTheBiggestSalaryEmployee(ArrayList<Employee> employees){
        Employee maxSalaryEmployee = new Employee();
        maxSalaryEmployee.setSalary(0);
        for (int i =0; i<employees.size();i++){

            if(employees.get(i).getSalary()>maxSalaryEmployee.getSalary()){
                maxSalaryEmployee = employees.get(i);
            }
        }
        return maxSalaryEmployee;
    }
    public static Manager getTheBiggestSalaryManager() throws IOException {
        ArrayList<Manager> managers = getManagersFromFile();
        Manager maxSalaryManager = new Manager();
        maxSalaryManager.setSalary(0);
        for (int i =0; i<managers.size();i++){

            if(managers.get(i).getSalary()>maxSalaryManager.getSalary()){
                maxSalaryManager = managers.get(i);
            }
        }
        return maxSalaryManager;
    }
    public static void showManagers(ArrayList<Manager> managers){
        for(int i=0;i<managers.size();i++){
            showManager(managers.get(i));
        }
    }

    public static void showManager(Manager manager){
        System.out.println("Manager: "+ manager.getName() +" "
                + manager.getSecondName() +" " + manager.getSalary() +" " + manager.getProject());
    }
    public static void showEmployee(Employee employee){
        System.out.println("Employee: "+ employee.getName() +" "
                + employee.getSecondName() +" " + employee.getSalary()
               // +" " + manager.getProject()
        );
    }
    public static void showProgrammers(ArrayList<Programmer> programmers){
        for(int i=0;i<programmers.size();i++){
            showProgrammer(programmers.get(i));
        }
    }
    public static void showProgrammer(Programmer programmer){
        System.out.println("Programmer: "+ programmer.getName()
                +" " + programmer.getSecondName() +" " + programmer.getSalary() +" " + programmer.getLanguage());
    }
    public static Programmer getTheBiggestSalaryProgrammer() throws IOException{
        ArrayList<Programmer> programmers = getProgrammersFromFile();
        Programmer maxSalaryProgrammer = new Programmer();
        maxSalaryProgrammer.setSalary(0);
        for (int i =0; i<programmers.size();i++){

            if(programmers.get(i).getSalary()>maxSalaryProgrammer.getSalary()){
                maxSalaryProgrammer = programmers.get(i);
            }
        }
        return maxSalaryProgrammer;
    }
    public static void showSysadmin(Sysadmin sysadmin){
        System.out.println("Sysadmin: "+ sysadmin.getName() +" "
                + sysadmin.getSecondName() +" " + sysadmin.getSalary() +" " + sysadmin.getPlatform());
    }
    public static void showSysadmins(ArrayList<Sysadmin> sysadmins){
        for(int i=0;i<sysadmins.size();i++){
            showSysadmin(sysadmins.get(i));
        }
    }
    public static Sysadmin getTheBiggestSalarySysadmin() throws IOException{
        ArrayList<Sysadmin> sysadmins = getSysadminsFromFile();
        Sysadmin maxSalarySysadmin = new Sysadmin();
        maxSalarySysadmin.setSalary(0);
        for (int i=0;i<sysadmins.size();i++){
            if(sysadmins.get(i).getSalary()>maxSalarySysadmin.getSalary()){
                maxSalarySysadmin = sysadmins.get(i);
            }
        }
        return maxSalarySysadmin;

    }
    public static ArrayList<Manager> getManagersFromFile() throws IOException
    {
        ArrayList<Manager> managers = new ArrayList<>();
        String fileName = "mihael/src/main/java/data/Managers.txt";
        managers = getManagersFromFile(fileName);
        return managers;
    }
    public static ArrayList<Manager> getManagersFromFile(String fileName) throws IOException
    {

        File file = new File(fileName);
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);

        ArrayList<Manager> managers = new ArrayList<>();
        String line;

        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Manager m = new Manager();
            m.setName(pool[0]);
            m.setSecondName(pool[1]);
            m.setSalary(Double.valueOf(pool[2]));
            m.setProject(pool[3]);
            managers.add(m);
        }
        return managers;
    }
    public static ArrayList<Sysadmin> getSysadminsFromFile() throws IOException
    {
        String fileName = "mihael/src/main/java/data/Admins.txt";
        return (getSysadminsFromFile(fileName));
    }
    public static ArrayList<Sysadmin> getSysadminsFromFile(String fileName) throws IOException
    {

            File file = new File(fileName);
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);

            ArrayList<Sysadmin> sysadmins = new ArrayList<>();
            String line;

            while ((line = buffer.readLine()) != null) {
                String[] pool = line.split(":");
                Sysadmin s = new Sysadmin();
                s.setName(pool[0]);
                s.setSecondName(pool[1]);
                s.setSalary(Double.valueOf(pool[2]));
                s.setPlatforms(pool[3]);
                sysadmins.add(s);
            }
            return sysadmins;
    }
    public static ArrayList<Programmer> getProgrammersFromFile() throws IOException
    {
        String fileName = "mihael/src/main/java/data/Programmers.txt";
        return (getProgrammersFromFile(fileName));

    }
    public static ArrayList<Programmer> getProgrammersFromFile(String fileName) throws IOException
    {

        File file = new File(fileName);
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);

        ArrayList<Programmer> programmers = new ArrayList<>();
        String line;

        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Programmer s = new Programmer();
            s.setName(pool[0]);
            s.setSecondName(pool[1]);
            s.setSalary(Double.valueOf(pool[2]));
            s.setLanguages(pool[3]);
            programmers.add(s);
        }
        return programmers;
    }




}