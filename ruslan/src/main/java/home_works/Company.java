package home_works;

import java.util.ArrayList;

/**
 * Created by user on 23.03.2015.
 */
public class Company {
    private String CompanyName;

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    private ArrayList<Employee> employees;
}
