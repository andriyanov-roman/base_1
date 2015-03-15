package home_task2;

import home_task.Employee;
import home_task.EmployeeUtil;

/**
 * Created by Stas on 16.03.2015.
 */
public class CompanyUtil {
    public static Company[] getCompanies() {
        Employee[] employees = EmployeeUtil.getEmployees();
        Company c1 = new Company();
        Company c2 = new Company();
        Company c3 = new Company();
        c1.employees = new Employee[]{employees[0], employees[1]};
        c2.employees = new Employee[]{employees[2], employees[4]};
        c3.employees = new Employee[]{employees[3], employees[5]};
        c1.companyName = "FirstCompany";
        c2.companyName = "SecondCompany";
        c3.companyName = "ThirdCompany";

        return new Company[]{c1, c2, c3};

    }

    public static void showCompanies() {
        Company[] companies = getCompanies();
        for (int i = 0; i < companies.length; i++) {
            for (int j = 0; j < companies[i].employees.length; j++) {
                System.out.println(companies[i].employees[j].name);
            }
        }

    }

}
