package homeTask1;

import java.util.ArrayList;

public class EmployeesUtil {
    public static ArrayList<Employee> getEmployees() {

        Employee e1 = new Employee("Grisha", "Popov", "man", 25, 10000.0);
        Employee e2 = new Employee("Alisa", "Bragina", "woman", 20, 7000.0);
        Employee e3 = new Employee("Pasha", "Sidorov", "man", 22, 8000.0);
        Employee e4 = new Employee("Vova", "Petrenko", "man", 33, 12000.0);
        Employee e5 = new Employee("Misha", "Zaec", "man", 18, 13000.0);
        Employee e6 = new Employee("Olga", "Emec", "woman", 21, 6000.0);
        Employee e7 = new Employee("Kostj", "Dzuj", "man", 40, 19000.0);
        Employee e8 = new Employee("Alisa", "Bragina", "woman", 45, 7500.0);


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        return employees;
    }
}
