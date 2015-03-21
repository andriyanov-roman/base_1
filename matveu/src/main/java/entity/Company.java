package entity;


import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Employee> employees;

    public void setCompanyName(String companyName){
        this.companyName=companyName;
    }

    public String getCompanyName() {
        return companyName;
    }


    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Employee> getEmployees(){
        return employees;
    }

}
