package homeproject;

import entities.Company;
import entities.Employee;

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




}
