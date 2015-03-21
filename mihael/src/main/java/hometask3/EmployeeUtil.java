package hometask3;

import java.util.ArrayList;

/**
 * Created by user on 14.03.2015.
 */
public class EmployeeUtil {
    private static ArrayList<Employee> employees = new ArrayList<Employee>(setupEmployees()) ;
    public EmployeeUtil() {
    }
    public static ArrayList<Employee> setupEmployees() {
        Employee e1 = new Employee("Vasya", "Ivanow", 3000.00, "MASCULINE",19);
        Employee e2 = new Employee("Vasya", "Petrov", 7000.00, "MASCULINE",29);
        Employee e3 = new Employee("Sergey", "Sidorov", 5000.00, "MASCULINE",22);
        Employee e4 = new Employee("Caley", "Ivanowa", 13000.00, "FEMININE",40);
        Employee e5 = new Employee("Zhora", "Simonov", 33000.00, "MASCULINE",59);
        Employee e6 = new Employee("Jack", "Woker", 28000.00, "MASCULINE",35);
        Employee e7 = new Employee("Lora", "Smith", 75000.00, "FEMININE",65);
        Employee e8 = new Employee("Sioma", "James", 300000.00, "MASCULINE",18);
        Employee e9 = new Employee("Marco", "Pantani", 5673000.00, "MASCULINE",37);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);
        return employees;
    }
    public static ArrayList<Employee> getEmployees() {
        return employees;
    }
    public static  void addEmployee (Employee employee){
        employees.add(employee);
    }
    public static  void removeEmployee (int i){
        employees.remove(i);
    }
    public static  void removeEmployee (Employee employee){
        employees.remove(employee);
    }
}