package hometasks.Task;


/**
 * Created by user on 14.03.2015.
 */
public class Company {
    private String companyName;
    private   Employee[] employees;

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    public String getCompanyName (){
        return  companyName;
    }
    public Employee[] getEmployees (){
        return this.employees;
    }
    public void setEmployees(Employee[] employees){
        this.employees = employees;
    }


    public Company(String name, Employee[] employees){
        this.companyName = name;
        this.employees = employees;
    }
    public Company(String name){
        this.companyName = name;
    }
    public Company(){
    }
}
