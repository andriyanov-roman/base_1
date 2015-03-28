package homeWork1;

import java.util.ArrayList;

/**
 * Created by Kirill on 12.03.2015.
 */
public class EmployeeUtil {
    public static ArrayList<Employee> getEmployees() {

        Employee eU1 = new Employee("Arina", "Bashkirova", 21800, "Female", 25);
        Employee eU2 = new Employee("Dima", "Kozuh", 31800, "male", 35);
        Employee eU3 = new Employee("Andrey", "Manzhul", 33800, "male", 26);
        Employee eU4 = new Employee("Kostya", "Sever", 21800, "male", 33);
        Employee eU5 = new Employee("Jonh", "Never", 19800, "male", 25);
        Employee eU6 = new Employee("Kira", "Nitly", 191800, "Female", 39);
        Employee eU7 = new Employee("Tanya", "Shkirova", 241800, "Female", 35);
        Employee eU8 = new Employee("Den", "Kirkorov", 21800, "male", 33);
        Employee eU9 = new Employee("Vlad", "Lermontov", 21800, "male", 47);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(eU1);
        employees.add(eU2);
        employees.add(eU3);
        employees.add(eU4);
        employees.add(eU5);
        employees.add(eU6);
        employees.add(eU7);
        employees.add(eU8);
        employees.add(eU9);
        return employees;

    }
}


