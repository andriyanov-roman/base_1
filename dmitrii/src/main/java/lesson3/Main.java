package lesson3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 16.03.2015.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList employee = new ArrayList<>();
        employee.add("A");
        employee.add(1);
        employee.add(new Employee("John", "Lennon", 2205.55, true, 27));
        if (employee.get(1) instanceof Employee) {
            Employee employee1 = (Employee) employee.get(1);
            System.out.println (employee1);
        }
        System.out.println (employee.size());


        ArrayList<Employee> employees = new ArrayList<>();
        /*Employee e1 = new Employee("John", "Lennon", 2205.55, true, 27);*/
        employees.add(new Employee("John", "Lennon", 2205.55, true, 27));
        Employee e = employees.get(0);
        System.out.println(e.getName());
        employees.add(0,new Employee("Bill", "Gates", 80_000.01, true, 65)); // Добавит Билла в начало, а Джона сдвинет вправо на ОДНУ позицию
        employees.set(1,new Employee("Martin", "Laurens", 90_000.0, true, 39)); // установить. (ЗАМЕНИТ Билла c №1) SET - можно использовать
        // только для существующего элемента

        Employee em = new Employee("John", "Lennon", 2205.55, true, 27);
        System.out.println(employees.contains(em));
        employees.forEach(System.out::println);



    }
}
