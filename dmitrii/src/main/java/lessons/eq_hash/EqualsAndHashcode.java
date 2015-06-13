package lessons.eq_hash;

import entities.company.Employee;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Programmer on 20.05.2015.
 */
public class EqualsAndHashcode {
    private int test;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EqualsAndHashcode)) return false;

        EqualsAndHashcode that = (EqualsAndHashcode) o;

        return test == that.test;

    }

    @Override
    public int hashCode() {
        return test;
    }
}
