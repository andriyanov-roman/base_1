package hometask2_4;

import entity.Company;
import entity.Employee;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 14.03.2015.
 */
public class CompanyUtil {

    public static ArrayList<Company> getCompanies() {
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();

        Company c1 = new Company();
        c1.setCompanyName("Volvo");
        c1.setEmployees(new ArrayList<>());
        c1.getEmployees().add(employees.get(0));
        c1.getEmployees().add(employees.get(1));
        c1.getEmployees().add(employees.get(2));
        c1.getEmployees().add(employees.get(3));

        Company c2 = new Company();
        c2.setCompanyName( "ATB");
        c2.setEmployees(new ArrayList<> (employees.subList(4,8)) );

        Company c3 = new Company();
        c3.setCompanyName( "AZK");
        c3.setEmployees(new ArrayList<Employee> (employees.subList(8,12)) );

        return new ArrayList<Company> (Arrays.asList(c1, c2, c3));
    }
}
