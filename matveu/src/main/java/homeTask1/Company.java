package homeTask1;


public class Company {
    private String companyName;
    private Employee[] employees;

    public void setCompanyName(String companyName){
        this.companyName=companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setEmployees(Employee[] employees){
        this.employees=employees;
    }

    public Employee[] getEmployees(){
        return employees;
    }

}
