package home_work;

/**
 * Created by Stas on 10.03.2015.
 */
public class EmployeeUtil {
    public static Employee[] getEmployees() {
        Employee e1 = new Employee();
        e1.name = "Roman";
        e1.secondName = "Andersson";
        e1.salary = 2400;

        Employee e2 = new Employee();
        e2.name = "Vlad";
        e2.secondName = "Sokolov";
        e2.salary = 1500;

        Employee e3 = new Employee();
        e3.name = "Vlad";
        e3.secondName = "Sokolov";
        e3.salary = 1300;

        Employee e4 = new Employee();
        e4.name = "John";
        e4.secondName = "Elthton";
        e4.salary = 7000;

        return new Employee[]{
                e1, e2, e3, e4
        };

    }


}
