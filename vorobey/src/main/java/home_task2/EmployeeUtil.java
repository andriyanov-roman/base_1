package home_task2;

import home_task2.Employee1;

import java.util.ArrayList;
import java.util.Arrays;


public class EmployeeUtil {
    public static ArrayList<Employee1> getEmployees() {


        Employee1 e1=new Employee1();

        e1.name = "Sveta";
        e1.secondName = "Andersson";
        e1.salary = 2400;
        e1.age = 25;
        e1.sex = "female";

        Employee1 e2=new Employee1();
        e2.name = "Vlad";
        e2.secondName = "Sokolov";
        e2.salary = 2500;
        e2.age = 37;
        e2.sex = "male";

        Employee1 e3=new Employee1();
        e3.name = "Vlad";
        e3.secondName = "Sokolov";
        e3.salary = 1300;
        e3.age = 18;
        e3.sex = "male";

        Employee1 e4=new Employee1();
        e4.name = "Maria";
        e4.secondName = "Elthton";
        e4.salary = 7000;
        e4.age = 56;
        e4.sex = "female";

        Employee1 e5=new Employee1();
        e5.name = "Ivan";
        e5.secondName = "Starper";
        e5.salary = 8000;
        e5.age = 55;
        e5.sex = "male";


        Employee1 e6=new Employee1();
        e6.name = "Vasiliy";
        e6.secondName = "Ytkin";
        e6.salary = 7000;
        e6.age = 33;
        e6.sex = "male";

        Employee1 e7=new Employee1();
        e7.name = "Nina";
        e7.secondName = "Volkova";
        e7.salary = 17000;
        e7.age = 30;
        e7.sex = "female";

        Employee1 e8=new Employee1();
        e8.name = "Anton";
        e8.secondName = "Neudachnik";
        e8.salary = 500;
        e8.age = 37;
        e8.sex = "male";


        return new ArrayList<Employee1>(Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8));


    }
}
