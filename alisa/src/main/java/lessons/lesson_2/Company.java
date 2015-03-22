package lessons.lesson_2;


import java.util.ArrayList;

/**
 * Created by user on 14.03.2015.
 */
public class Company {
    private String companyName;
    private ArrayList<Employee> employees;


    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}


