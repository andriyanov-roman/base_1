package hometask2;

import lesson2.*;
import lesson2.Company;
import lesson2.Employee;

/**
 * Created by user on 14.03.2015.
 */
public class CompanyUtil {
    public static hometask2.Company[] getCompanies() {
        hometask2.Employee[] employees = EmployeeUtil.getEmployees();

        hometask2.Company c1 = new hometask2.Company();
        c1.setCompanyName("Volvo");
        c1.employees = new hometask2.Employee[]{employees[0], employees[1], employees[2]};

        hometask2.Company c2 = new hometask2.Company();
        c2.setCompanyName( "ATB");
        c2.employees = new hometask2.Employee[]{employees[3], employees[4], employees[5]};

        hometask2.Company c3 = new hometask2.Company();
        c3.setCompanyName( "AZK");
        c3.employees = new hometask2.Employee[]{employees[6], employees[7], employees[8]};

        return new hometask2.Company[]{c1, c2, c3};
    }

/*    public static void highSalary() {
        hometask2.Company comps[] = CompanyUtil.getCompanies();
        for (int i = 0; i < comps.length; i++) {
            Employee temp = comps[i].employees[0];
            for (int j = 0; j < comps[i].employees.length; j++) {
                if (temp.salary < comps[i].employees[j].salary) {
                    temp = comps[i].employees[j];
                }
            }
             System.out.println("Company \""+comps[i].getCompanyName() + "\". Higher salary: " + temp.salary + "$. It gives " + temp.name+" "+temp.surname);
        }
    }*/
}
