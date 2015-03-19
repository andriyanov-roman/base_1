package lesson3;


import java.util.ArrayList;

/**
 * Created by user on 14.03.2015.
 */
public class Company {
    private String companyName;
    private ArrayList<Employee> employees;

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    public String getCompanyName (){
        return  companyName;
    }
    public ArrayList<Employee> getEmployees (){
        return this.employees;
    }
    public void setEmployees(ArrayList<Employee> employees){
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{}";
    }

    public Company(String name, ArrayList<Employee> employees){
        this.companyName = name;
        this.employees = employees;
    }
    public Company(String name){
        this.companyName = name;
    }
    public Company(){
    }
}
