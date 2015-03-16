package lesson3;

import java.util.ArrayList;

/**
 * Created by user on 14.03.2015.
 */
public class Company {
    private String companyName;
    private ArrayList<Employee> employees;

    public void setEmployees (ArrayList<Employee> employees){
        this.employees = employees;
    }

    public ArrayList<Employee> getEmployees (){
        return employees;
    }

    public void setCompanyName (String name){
        this.companyName = name;
    }

    public String getCompanyName () {
        return companyName;
    }


    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
