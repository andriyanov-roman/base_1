package home_tasks_2;

import java.util.ArrayList;

/**
 * Created by user on 19.03.2015.
 */
public class EmployeeUtil {
    public static ArrayList<Employee> getEmployees() {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee("John", "Stockton", 37, "Male", 10000);
        Employee e2 = new Employee("Michael", "Jordan", 52, "Male", 11000.50);
        Employee e3 = new Employee("Derrick", "Rose", 26, "Male", 8000.80);
        Employee e4 = new Employee("John", "Stockton", 25, "Male", 5500.50);
        Employee e5 = new Employee("Julia", "Corn", 25, "Female", 5570.50);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        return employees;
    }
}
