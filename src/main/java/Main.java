import base_examples.objects.Human;
import home_work_2.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList employee = new ArrayList();
        employee.add("A");
        employee.add(1);
        employee.add(new Employee ("Vasya", "Ivanow", 3000.00));
        if(employee.get(1) instanceof Employee) {
            Employee employee1 = (Employee) employee.get(1);
        }
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee ("Vasya", "Ivanow", 3000.00));
        Employee e =  new Employee ("Vasya", "Petrov", 5000.00);
        employees.add(0, e);
        employees.set(1, new Employee("Artem", "Petrov", 5000.00));
        ArrayList<Employee> employees1 = new ArrayList<>();
        employees1.add(e);
        System.out.println(employee.toString());
        employees.forEach(System.out::println);
        employees.addAll(employees1);
        employees.removeAll(employees1);
        String[] strings = new String[10];
        strings[0] = "A";
        System.out.println(employee.size());
    }
}
