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

    public static void showCompaniesAndEmployees() {
        Company[] companies = getCompanies();
        for (int i = 0; i < companies.length; i++) {
            for (int j = 0; j < companies[i].employees.length; j++) {
                System.out.println("Компания: " + companies[i].companyName + " содрежит сотрудников :" + companies[i].employees[j].name + " " + companies[i].employees[j].secondName);
            }
        }


    }

    public static void maxSalary() {
        Company[] companies = getCompanies();
        for (int i = 0; i < companies.length; i++) {
            int maxSalary = 0;
            String maxName = "", maxSecondName = "";
            for (int j = 0; j < companies[i].employees.length; j++) {
                for (int k = 0; k < companies[i].employees[j].salary; k++) {
                    if (companies[i].employees[j].salary > maxSalary) {
                        maxSalary = companies[i].employees[j].salary;
                        maxName = companies[i].employees[j].name;
                        maxSecondName = companies[i].employees[j].secondName;
                    }

                }

            }
            System.out.println("В компании " + companies[i].companyName + " сотрудник с максимальной ЗП: " + maxName + ",а именно :" + maxSalary);

        }


    }
}