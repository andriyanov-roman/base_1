package lesson_2;

/**
 * Created by Администратор on 14.03.2015.
 */
public class Company {
    private String companyName;
    private Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}
