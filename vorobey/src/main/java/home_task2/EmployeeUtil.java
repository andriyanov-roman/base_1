package home_task2;

import home_task2.Employee1;

import java.util.ArrayList;
import java.util.Arrays;


public class EmployeeUtil {
    public static ArrayList<Employee1> getEmployees() {


        Employee1 e1 = new Employee1();

        e1.setName("Sveta");
        e1.setSecondName("Andersson");
        e1.setSalary(2400);
        e1.setAge(25);
        e1.setSex("female");

        Employee1 e2 = new Employee1();
        e2.setName("Vlad");
        e2.setSecondName("Sokolov");
        e2.setSalary(2500);
        e2.setAge(27);
        e2.setSex("male");

        Employee1 e3 = new Employee1();
        e3.setName("Vlad");
        e3.setSecondName("Sokolov");
        e3.setSalary(3500);
        e3.setAge(18);
        e3.setSex("male");

        Employee1 e4 = new Employee1();
        e4.setName("Maria");
        e4.setSecondName("Elthton");
        e4.setSalary(7000);
        e4.setAge(56);
        e4.setSex("female");

        Employee1 e5 = new Employee1();
        e5.setName("Ivan");
        e5.setSecondName("Starper");
        e5.setSalary(8000);
        e5.setAge(60);
        e5.setSex("male");


        Employee1 e6 = new Employee1();
        e6.setName("Vasiliy");
        e6.setSecondName("Ytkin");
        e6.setSalary(3000);
        e6.setAge(33);
        e6.setSex("male");


        Employee1 e7 = new Employee1();
        e7.setName("Nina");
        e7.setSecondName("Ohrenevsheva");
        e7.setSalary(17000);
        e7.setAge(23);
        e7.setSex("female");

        Employee1 e8 = new Employee1();
        e8.setName("Anton");
        e8.setSecondName("Neudachnik");
        e8.setSalary(340);
        e8.setAge(38);
        e8.setSex("male");

        return new ArrayList<Employee1>(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8));


    }
}
