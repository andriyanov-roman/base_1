package equal;

import cons.company.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Programmer on 20.05.2015.
 */
public class EqualsAndHashCode {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Ivan");
        e.setDateOfEmployment(LocalDate.now());
        e.setAge(10);
        e.setSurname("Ivan");
        e.setSex("male");

        Employee e1 = new Employee();
        e1.setName("Ivan");
        e1.setDateOfEmployment(LocalDate.now());
        e1.setAge(10);
        e1.setSurname("Ivan");
        e1.setSex("male");
        System.out.println(e1 == e);
        System.out.println(e.equals(e1));
        System.out.println(e.hashCode());
        System.out.println(e1.hashCode());
    }
}
