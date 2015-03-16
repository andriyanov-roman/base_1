package home_task2;

import home_task.Employee;

/**
 * Created by Stas on 16.03.2015.
 */
public class Company {
    private String companyName;
    private Employee[] employees;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;

    }

    public Employee[] getEmployees() {
        return employees;


    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

}
