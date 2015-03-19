package Lessons.LessonTwo;

import Homeworks.homework_1.Employee;

import java.util.ArrayList;

/**
 * Created by user on 16.03.2015.
 */
public class Company {
    private String companyName;
    private ArrayList<Employee> employees;


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
