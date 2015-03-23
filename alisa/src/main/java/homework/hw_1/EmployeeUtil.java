package homework.hw_1;


import java.util.ArrayList;

/**
 * Created by PC XP on 29.01.15.
 */
public class EmployeeUtil {
    public static ArrayList<Employee> getEmployees() {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Vasya", "Ivanow", 3000.00));
        employees.add(new Employee("Vasya", "Petrov", 5000.00));
        employees.add(new Employee("Sergey", "Sidorov", 7000.00));

        employees.add(new Employee("Marco", "Pantani", 5673000.00));
        employees.add(new Employee("Zhora", "Simonov", 33000.00));
        employees.add(new Employee("Jack", "Woker", 28000.00));

        employees.add (new Employee("Lora", "Smith", 75000.00));
        employees.add (new Employee("Sioma", "James", 300000.00));
        employees.add(new Employee("Caley", "Ivanowa", 13000.00));
        return  employees;


    }
}
