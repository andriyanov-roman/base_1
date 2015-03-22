package homework.hw_2;


import lessons.lesson_2.*;
import lessons.lesson_2.Employee;

/**
 * Created by user on 14.03.2015.
 */
public class Company {
    private String companyName;
    private lessons.lesson_2.Employee[] employees;


    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setEmployees(lessons.lesson_2.Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }
}


