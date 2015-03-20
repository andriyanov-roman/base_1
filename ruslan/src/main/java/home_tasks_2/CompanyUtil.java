package home_tasks_2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 19.03.2015.
 */
public class CompanyUtil {
    public static ArrayList<Company> getCompanies () {
        ArrayList<Company> companies = new ArrayList<>();
        ArrayList<Employee> employees=EmployeeUtil.getEmployees();
        Company c1=new Company();
        c1.setEmployees(new ArrayList<>());
        c1.getEmployees().add(employees.get(0));
        c1.getEmployees().add(employees.get(1));
        c1.getEmployees().add(employees.get(2));
        c1.setCompanyName("Oracle");
        companies.add(c1);
        Company c2=new Company();
        c2.setEmployees(new ArrayList<>());
        c2.getEmployees().add(employees.get(1));
        c2.getEmployees().add(employees.get(2));
        c2.setCompanyName("IBM");
        companies.add(c2);
        Company c3=new Company();
        c3.setEmployees(new ArrayList<>());
        c3.getEmployees().add(employees.get(0));
        c3.getEmployees().add(employees.get(1));
        c3.getEmployees().add(employees.get(3));
        c3.setCompanyName("Brooklyn");
        companies.add(c3);
        return new ArrayList<>(Arrays.asList(c1,c2,c3));
    }
}
