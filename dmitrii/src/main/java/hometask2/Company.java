package hometask2;

import lesson2.*;
import lesson2.Employee;

/**
 * Created by user on 14.03.2015.
 */
public class Company {
    private String companyName;
    public hometask2.Employee[] employees;

    public void setCompanyName (String name){
        this.companyName = name;
    }

    public String getCompanyName () {
        return companyName;
    }
}
