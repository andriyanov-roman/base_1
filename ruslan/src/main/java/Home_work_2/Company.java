package home_work_2;


public class Company {
    private String companyName;
    private Employee[] employees;

    public Employee[] getEmployee() {
        return employees;
    }

    public void setEmployee(Employee[] employees) {
        this.employees = employees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }



}
