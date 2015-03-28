package base_examples.sorting;

import entity.Employee;
import home_work_2.EmployeeUtil;

import java.util.ArrayList;

/**
 * Created by user on 3/19/2015.
 */
public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        for (int i = 0; i < employees.size(); i++) {
            for (int j = 0; j < employees.size() - i - 1; j++) {
                if (employees.get(j).getSalary() > employees.get(j + 1).getSalary()) {
                    Employee temp = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, temp);
                }
            }
        }
        employees.forEach(System.out::println);
    }
}
