package home_task2;

import home_task2.Employee1;

import java.util.ArrayList;

/**
 * Created by Stas on 16.03.2015.
 */
public class Company {
    private String companyName;
    private ArrayList<Employee1> employees;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;

    }

    public ArrayList<Employee1> getEmployees() {
        return employees;


    }

    public void setEmployees(ArrayList<Employee1> employees) {
        this.employees = employees;
    }

}
