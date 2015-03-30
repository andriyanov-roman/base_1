package entity;

import entity.Employee;

import java.util.ArrayList;

/**
 * Created by user on 16.03.2015.
 */
public class Company {
    private static String companyName;
    private static ArrayList<Employee> employees;



    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Company.companyName = companyName;
    }

    public static ArrayList<Employee> getEmployees() {
        return employees;
    }

    public static void setEmployees(ArrayList employees) {
        Company.employees = employees;
    }

    @Override
    public String toString() {
        return companyName + " " + " " + employees;
    }
}
