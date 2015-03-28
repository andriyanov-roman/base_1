package lesson3;

import entities.Employee;
import java.util.ArrayList;

/**
 * Created by Dmitriy Lisunov on 14.03.2015.
 */
public class EmployeeUtil {
    public static ArrayList<Employee> getEmployees () {
        ArrayList<Employee> empl = new ArrayList<>();
        empl.add( new Employee("John", "Lennon", 9_993_205.55, true, 27));
        empl.add( new Employee("Bill", "Gates", 80_000.01, true, 65));
        empl.add( new Employee("Steve", "Jobs", 15_000.24, true, 60));
        empl.add( new Employee("Linus","Torvalds", 50.00, true, 47));
        empl.add( new Employee("Marry", "Madison", 12_500.00, false, 53));
        empl.add( new Employee("Neil","Armstrong",89_999.01, true, 43 ));
        empl.add( new Employee("Helen", "Perry", 57.00, false, 28));
        empl.add( new Employee("Martin", "Laurens", 90_000.0, true, 39));
        empl.add( new Employee("Clint", "Eastwood", 99_999.0, true, 44));
        empl.add( new Employee("Artemiy","Lebedev", 4800.00, true, 35));
        empl.add( new Employee("Artur","Lebedev", 8000.00, true, 14));
        return empl;
    }
}
