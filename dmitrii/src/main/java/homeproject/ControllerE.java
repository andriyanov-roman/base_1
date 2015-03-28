package homeproject;

import entities.Admin;
import entities.Company;
import entities.Employee;
import entities.Manager;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by mit_OK! on 27.03.2015.
 */
public class ControllerE {

    public static void Run() throws IOException {
        ArrayList<Company> comps = ModelE.getCompanies();
        ViewE.update(comps);
    }

    public static void showStuff(ArrayList<Company> selectedComps) {
        for (int i = 0; i <selectedComps.size(); i++) {
            ViewE.showWorkers(selectedComps.get(i));
        }
    }

    public static void displayHighestSalary(ArrayList<Company> comps) throws IOException {
        String Result = "\n";
        for (int i = 0; i < comps.size(); i++) {
            Employee temp = comps.get(i).getEmployees().get(0);
            for (int j = 0; j < comps.get(i).getEmployees().size(); j++) {
                if (temp.getSalary() < comps.get(i).getEmployees().get(j).getSalary()) {
                    temp = comps.get(i).getEmployees().get(j);
                }
            }
            Result=Result+"Company \""+comps.get(i).getCompanyName() + "\". Higher salary: "
                    + temp.getSalary() + "$. It gives " + temp.getName()+" "+temp.getSurname()+"\n";
        }
        ViewE.printer(Result);
    }

    public static void sortBySalary(ArrayList<Company> selectedComps) {
        ArrayList <Employee> employees;
        for (int k = 0; k < selectedComps.size(); k++) {
            employees = selectedComps.get(k).getEmployees();
            for (int i = 0; i < employees.size()-1; i++) {
                for (int j = 0; j < employees.size()-1-i; j++) {
                    if (employees.get(j+1).getSalary() < employees.get(j).getSalary()){
                        employees = Move(employees, j);
                    }
                }
            }
            selectedComps.get(k).setEmployees(employees);
            ViewE.showEmployees(selectedComps.get(k));
        }
    }
    public static void sortByAge(ArrayList<Company> selectedComps) {
        ArrayList <Employee> employees;
        for (int k = 0; k < selectedComps.size(); k++) {
            employees = selectedComps.get(k).getEmployees();
            for (int i = 0; i < employees.size()-1; i++) {
                for (int j = 0; j < employees.size()-1-i; j++) {
                    if (employees.get(j+1).getAge() < employees.get(j).getAge()){
                        employees = Move(employees, j);
                    }
                }
            }
            selectedComps.get(k).setEmployees(employees);
            ViewE.showEmployees(selectedComps.get(k));
        }
    }
    public static void sortBySurnameLength(ArrayList<Company> selectedComps) {
        ArrayList <Employee> employees;
        for (int k = 0; k < selectedComps.size(); k++) {
            employees = selectedComps.get(k).getEmployees();
            for (int i = 0; i < employees.size()-1; i++) {
                for (int j = 0; j < employees.size()-1-i; j++) {
                    if ( employees.get(j+1).getSurname().length() < employees.get(j).getSurname().length() ){
                        employees = Move(employees, j);
                    }
                }
            }
            selectedComps.get(k).setEmployees(employees);
            ViewE.showEmployees(selectedComps.get(k));
        }
    }
    private static ArrayList<Employee> Move(ArrayList<Employee> employees, int j){
        Employee temp = employees.get(j);
        employees.set(j,employees.get(j+1));
        employees.set(j+1,temp);
        return employees;
    }

    private static ArrayList<Admin> MoveAdmin (ArrayList<Admin> admins, int j){
        Admin temp = admins.get(j);
        admins.set(j,admins.get(j+1));
        admins.set(j+1,temp);
        return admins;
    }


    public static void FindHighSalaryBeetwenEntities() throws IOException {
        ArrayList<Company> comps = ModelE.getCompanies();
        for (Company c : comps) {

        }
    }

    public  static Admin  findHighestAdmin () throws IOException {
        ArrayList<Company> comps = ModelE.getCompanies();
        ArrayList<Admin> admins;
        Admin bestAdmin = new Admin();
        bestAdmin.setSalary(0);// БАРАХЛО
        for (Company c : comps) {
            admins = c.getAdmins();
            for (int j = 0; j < admins.size(); j++) {
                if (admins.get(j+1).getSalary() > bestAdmin.getSalary()){
                    bestAdmin = admins.get(j+1);
                }
            }
        }
    return bestAdmin;
    }

    /*   ================ CLASS WORK   =========================  */
    public static void main(String[] args) throws IOException {
        ArrayList<Company> comps = ModelE.getCompanies();
        Manager maxManager = getMaxSalaryManager(comps.get(0).getManagers());
    }
    private static Manager getMaxSalaryManager (ArrayList<Manager> managers){
        Manager max = managers.get(0);
        for (int i = 0; i < managers.size(); i++) {
            if (max.getSalary() < managers.get(i).getSalary()){
                max = managers.get(i);
            }
        }
        return  max;
    }

    /*    ====  ВАРИАНТ    2  =====  */
    public static void getMaxSalary() {
        ArrayList entyties = new ArrayList();
        Manager managerMax;
        for (int i = 0; i < entyties.size(); i++) {
            if (entyties.get(i) instanceof  Manager){}
        }
    }

}
