package home_works;

import java.util.ArrayList;

/**
 * Created by user on 23.03.2015.
 */
public class EmployeeUtil {
    public static ArrayList<Employee> getEmployees() {

        Employee e1 = new Employee("Michael", "Jordan", "Male", 52, 30000.0);
        Employee e2 = new Employee("Maria", "Kotowizch", "Female", 20, 5500.5);
        Employee e3 = new Employee("Derek", "Sidorov", "Male", 26, 8000.5);
        Employee e4 = new Employee("Philip", "Petrenko", "Male", 33, 12500.5);
        Employee e5 = new Employee("Shaquille", "Jordan", "Male", 40, 18000.0);
        Employee e6 = new Employee("Rosa", "Perry", "Female", 35, 10000.0);



        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);

        return employees;
    }
}
