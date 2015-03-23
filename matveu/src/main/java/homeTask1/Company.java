package homeTask1;


import java.util.ArrayList;

public class Company {
    public String companyName;
    public ArrayList<Employee> employees;

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
