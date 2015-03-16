package homework;


import java.util.ArrayList;

public class EmployeeUtil {
    public static ArrayList<Employee> getEmployees() {
        Employee e1 = new Employee("Vasya", "Ivanow", 3000.13, "male", 28);
        Employee e2 = new Employee("Vasya", "Petrov", 5000.00, "male", 18);
        Employee e3 = new Employee("Sergey", "Sidorov", 87000.75, "male", 23);
        Employee e4 = new Employee("Caley", "Ivanowa", 13000.00, "female", 20);
        Employee e5 = new Employee("Zhora", "Simonov", 33000.00, "male", 21);
        Employee e6 = new Employee("Jack", "Woker", 287000.83, "male", 20);
        Employee e7 = new Employee("Lora", "Smith", 75000.00, "female", 22);
        Employee e8 = new Employee("Jack", "Woker", 301000.91, "male", 32);
        Employee e9 = new Employee("Marco", "Pantani", 5673000.00, "female", 44);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(new Employee("Vasya", "Petrov", 5000.00, "male", 18));
        employees.add(e3);
        employees.add(e4);
        employees.add(new Employee("Zhora", "Simonov", 33000.00, "male", 21));
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);

        return employees;
    }
}
