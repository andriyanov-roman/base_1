package home_tasks_2;

import java.util.ArrayList;

/**
 * Created by user on 19.03.2015.
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
