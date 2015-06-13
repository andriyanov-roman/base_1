package lessons.interfaces;


import java.util.ArrayList;
import java.util.Collections;

public class EmployeeUtil {
    public static ArrayList<Employee> getEmployees() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Vasya", "Ivanow", 5673000.00));
        employees.add(new Employee("Vasya", "Petrov", 5000.00));
        employees.add(new Employee("Sergey", "Sidorov", 7000.00));
        employees.add(new Employee("Caley", "Ivanowa", 13000.00));
        employees.add(new Employee("Zhora", "Simonov", 33000.00));
        employees.add(new Employee("Jack", "Woker", 75000.00));
        employees.add(new Employee("Lora", "Smith", 28000.00));
        employees.add(new Employee("Sioma", "James", 300000.00));
        employees.add(new Employee("Marco", "Pantani", 7000.00));
        return employees;

    }

    public static void main(String[] args) {
        ArrayList<Employee> empl = new ArrayList<>();
        Collections.sort(empl);
        //System.out.println(empl.toString());
        empl.forEach(System.out::println);
    }
}
