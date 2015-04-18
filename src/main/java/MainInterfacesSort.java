import entity.Employee;
import home_work_2.EmployeeUtil;
import ua.CompareByName;
import ua.CompareBySecondName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Администратор on 18.04.2015.
 */
public class MainInterfacesSort {
    public static void main(String[] args) {
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        //Collections.sort(employees);
        //employees.forEach(System.out::println);
        Collections.sort(employees, new CompareByName());
        employees.forEach(System.out::println);
        Collections.sort(employees, new CompareBySecondName());
    }
}
