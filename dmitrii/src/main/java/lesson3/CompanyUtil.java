package lesson3;

import entities.Company;
import entities.Employee;
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
        c1.setEmployees(new ArrayList<Employee> (employees.subList(0,2)) );

        Company c2 = new Company();
        c2.setCompanyName( "ATB");
        c2.setEmployees(new ArrayList<Employee> (employees.subList(3,5)) );

        Company c3 = new Company();
        c3.setCompanyName( "AZK");
        c3.setEmployees(new ArrayList<Employee> (employees.subList(6,10)) );

       // Пересмотреть, как сделано у Ромы

        return new ArrayList<Company> (Arrays.asList(c1, c2, c3));
    }

/*    public static void highSalary() {
        Company comps[] = CompanyUtil.getCompanies();
        System.out.println();
        for (int i = 0; i < comps.length; i++) {
            Employee temp = comps[i].getEmployees()[0];
            for (int j = 0; j < comps[i].getEmployees().length; j++) {
                if (temp.getSalary() < comps[i].getEmployees()[j].getSalary()) {
                    temp = comps[i].getEmployees()[j];
                }
            }
            System.out.println("Company \""+comps[i].getCompanyName() + "\". Higher salary: " + temp.getSalary() + "$. It gives " + temp.getName()+" "+temp.getSurname());
        }
    }*/
}
