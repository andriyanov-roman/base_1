package HomeTask2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Master on 14.03.2015.
 */
public class EmployeeUtil {

    public static ArrayList<Employee> getEmployees () {

        Employee e1 = new Employee();
        e1.setSalary(300);
        e1.setName ("Jack");
        e1.setSecondName("Vorobey");
        e1.setAge(25);
        e1.setSex("Male");

        Employee e2 = new Employee();
        e2.setSalary(370);
        e2.setName("john");
        e2.setSecondName("Black");
        e2.setAge(26);
        e2.setSex("Male");

        Employee e3 = new Employee();
        e3.setSalary(150);
        e3.setName("Johny");;
        e3.setSecondName("Walker");
        e3.setAge(37);
        e3.setSex("Male");

        Employee e4 = new Employee();
        e4.setSalary(556);
        e4.setName("White");
        e4.setSecondName("Horse");
        e4.setAge(27);
        e4.setSex("Male");

        Employee e5 = new Employee();
        e5.setSalary (345);
        e5.setName("White");
        e5.setSecondName("Tiger");
        e5.setAge(24);
        e5.setSex("Male");

        Employee e6 = new Employee();
        e6.setSalary(235);
        e6.setName("Black");
        e6.setSecondName("Bear");
        e6.setAge(29);
        e6.setSex("Male");

        Employee e7 = new Employee();
        e7.setSalary (345);
        e7.setName("Zina");
        e7.setSecondName("Rose");
        e7.setAge(23);
        e7.setSex("Female");

        Employee e8 = new Employee();
        e8.setSalary(235);
        e8.setName("Lena");
        e8.setSecondName("Fox");
        e8.setAge(24);
        e8.setSex("Female");



        return new ArrayList<Employee>(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8));
    }


}
