package hometask2;

/**
 * Created by user on 14.03.2015.
 */
public class Company {
    private String companyName;
    private Employee[] employees;

    public void setEmployees (Employee[] employees){
        this.employees = employees;
    }

    public Employee[] getEmployees (){
        return employees;
    }

    public void setCompanyName (String name){
        this.companyName = name;
    }

    public String getCompanyName () {
        return companyName;
    }
}
