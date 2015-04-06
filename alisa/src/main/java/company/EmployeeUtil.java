package company;


import entity.Employee;

import java.util.ArrayList;

/**
 * Created by PC XP on 29.01.15.
 */
public class EmployeeUtil {
    public static ArrayList<Employee> getEmployees() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Vasya", "Ivanow", 3000.00, 40, "m"));
        employees.add(new Employee("Vasya", "Petrov", 5000.00, 39, "m"));
        employees.add(new Employee("Sergey", "Sidorov", 7000.00, 23, "m"));

        employees.add(new Employee("Caley", "Ivanowa", 13000.00, 25, "f"));
        employees.add(new Employee("Zhora", "Simonov", 33000.00, 56, "m"));
        employees.add(new Employee("Jack", "Woker", 28000.00, 87, "m"));

        employees.add(new Employee("Lora", "Smith", 75000.00, 100, "f"));
        employees.add(new Employee("Sioma", "James", 300000.00, 74, "m"));
        employees.add(new Employee("Marco", "Pantani", 5673000.00, 98, "m"));
        return employees;
    }
}