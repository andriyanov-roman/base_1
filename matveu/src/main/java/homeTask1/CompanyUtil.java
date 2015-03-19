package homeTask1;


import java.util.ArrayList;
import java.util.Arrays;

public class CompanyUtil {
    public static ArrayList<Company> getCompanies () {
        ArrayList<Company> companies = new ArrayList<>();
        ArrayList<Employee> employees=EmployeesUtil.getEmployees();
        Company c1=new Company();
        c1.setEmployees(new ArrayList<>());
        c1.getEmployees().add(employees.get(0));
        c1.getEmployees().add(employees.get(1));
        c1.getEmployees().add(employees.get(2));
        companies.add(c1);

        Company c2=new Company();
        c2.setEmployees(new ArrayList<>());
        c2.getEmployees().add(employees.get(3));
        c2.getEmployees().add(employees.get(4));
        companies.add(c2);

        Company c3=new Company();
        c3.setEmployees(new ArrayList<>());
        c3.getEmployees().add(employees.get(5));
        c3.getEmployees().add(employees.get(6));
        c3.getEmployees().add(employees.get(7));
        companies.add(c3);

        c1.setCompanyName("Luxsoft");
        c2.setCompanyName("Microsoft");
        c3.setCompanyName("Sony");
        return new ArrayList<>(Arrays.asList(c1,c2,c3));

    }

}
