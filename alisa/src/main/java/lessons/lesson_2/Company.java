package lessons.lesson_2;

import homework.hw_1.Employee;

/**
 * Created by user on 14.03.2015.
 */
public class Company {
    private String companyName;
    private Employee[] employees;

    public void setCompanyName (String companyName){
        this.companyName =companyName;
    }
    public String getCompanyName(){
        return companyName;
    }
}