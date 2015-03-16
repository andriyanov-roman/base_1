package Lessons.LessonTwo;


import Homeworks.homework_1.Employee;
import Homeworks.homework_1.EmployeeUtil;

public class CompanyUtil {
    public static Company[] getCompanies() {
        Company c1 = new Company();
        Employee[] employees = EmployeeUtil.getEmployees();
        c1.setEmployees (new Employee[]{employees[0], employees[1], employees[2]});
        c1.setCompanyName("Fist");

        Company c2 = new Company();
        c2.setEmployees(new Employee[]{employees[3], employees[4], employees[5]});
        c2.setCompanyName("Beast");

        Company c3 = new Company();
        c3.setEmployees(new Employee[]{employees[6], employees[7], employees[8]});
        c3.setCompanyName("Finest");
        return new Company[]{c1, c2, c3};
    }

    public static void findMaxSalary() {
        Company[] companies = getCompanies();
        double temp = companies[0].getEmployees()[0].getSalary();
        String namey = companies[0].getEmployees()[0].getName();
        for (int i = 0; i < companies.length; i++) {
            if (companies[i].getEmployees()[i].getSalary() > companies[0].getEmployees()[0].getSalary()) {
                temp = companies[i].getEmployees()[i].getSalary();
                namey = companies[i].getEmployees()[i].getName();
            }
            System.out.println(companies[i].getEmployees()[i].getName());

            break;


        }

    }
}

