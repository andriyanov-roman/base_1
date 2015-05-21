package lessons.l20052014Hash;

import entities.company.Employee;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Programmer on 20.05.2015.
 */
public class EqualsAndHashcode {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Ivan");
        System.out.println(e1.hashCode());

        Employee e2 = new Employee();
        e2.setName("Ivan");
        System.out.println(e2.hashCode());

        System.out.println(e1.equals(e2));

        System.out.println("=======================");
        ArrayList<Employee> employees = new ArrayList<>();
        HashSet<Employee> employeeHashSet = new HashSet<>();
        employeeHashSet.add(e1);
        System.out.println(employeeHashSet.contains(e2));
        System.out.println(employeeHashSet.contains(e1));
    }
}
