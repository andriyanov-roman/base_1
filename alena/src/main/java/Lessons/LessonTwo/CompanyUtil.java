package Lessons.LessonTwo;


import Homeworks.homework_1.Employee;
import Homeworks.homework_1.EmployeeUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class CompanyUtil {
    public static ArrayList<Company> getCompanies() {
        Company c1 = new Company();
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        c1.setEmployees (new ArrayList<>());
        c1.getEmployees().add(employees.get(0));
        c1.getEmployees().add(employees.get(1));
        c1.getEmployees().add(employees.get(2));
        c1.setCompanyName("Fist");

        Company c2 = new Company();
        c2.setEmployees(new ArrayList<>());
        c2.getEmployees().add(employees.get(3));
        c2.getEmployees().add(employees.get(4));
        c2.getEmployees().add(employees.get(5));
        c2.setCompanyName("Beast");

        Company c3 = new Company();
        c3.setEmployees(new ArrayList<>());
        c3.getEmployees().add(employees.get(6));
        c3.getEmployees().add(employees.get(7));
        c3.getEmployees().add(employees.get(8));
        c3.setCompanyName("Finest");
        return new ArrayList<Company>(Arrays.asList(c1, c2, c3));
    }

    public static void findMaxSalary() {
        ArrayList<Company> companies = getCompanies();
        double temp = companies.get(0).getEmployees().get(0).getSalary();
        String namey = companies.get(0).getEmployees().get(0).getName();
        for (int i = 0; i < companies.size(); i++) {
            if (companies.get(i).getEmployees().get(i).getSalary() > companies.get(0).getEmployees().get(0).getSalary()) {
                temp = companies.get(i).getEmployees().get(i).getSalary();
                namey = companies.get(i).getEmployees().get(i).getName();
            }
            System.out.println(companies.get(i).getEmployees().get(i).getName());

            break;


        }

    }
}

