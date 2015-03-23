package home_works;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 23.03.2015.
 */
public class CompanyUtil {
    private static ArrayList<Company> getCompanies (){
        ArrayList<Company> companies = new ArrayList<>();
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        Company c1 = new Company();
        Company c2 = new Company();
        Company c3 = new Company();
        companies.add(c1);
        companies.add(c2);
        companies.add(c3);
        c1.setEmployees(new ArrayList<Employee>());
        c1.getEmployees().add(employees.get(0));
        c1.getEmployees().add(employees.get(1));
        c2.setEmployees(new ArrayList<Employee>());
        c2.getEmployees().add(employees.get(2));
        c2.getEmployees().add(employees.get(3));
        c3.setEmployees(new ArrayList<Employee>());
        c3.getEmployees().add(employees.get(4));
        c3.getEmployees().add(employees.get(5));
        c1.setCompanyName("Philips");
        c2.setCompanyName("Samsung");
        c3.setCompanyName("LG");

        return new ArrayList<>(Arrays.asList(c1, c2, c3));
    }
}
