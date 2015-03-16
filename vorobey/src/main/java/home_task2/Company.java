package home_task2;

import home_task.Employee;

import java.util.ArrayList;

/**
 * Created by Stas on 16.03.2015.
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
