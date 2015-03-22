package homework.hw_2;


import lessons.lesson_2.*;
import lessons.lesson_2.EmployeeUtil;

import java.util.Scanner;

/**
 * Created by user on 14.03.2015.
 */
public class CompanyUtil {

    public static Company[] getCompanies() {
        Employee[] employees = homework.hw_2.EmployeeUtil.getEmployees();

        Company c1 = new Company();
        c1.setCompanyName("Lenovo");
        c1.setEmployees(new Employee[]{employees[0], employees[1], employees[2]});

        Company c2 = new Company();
        c2.setCompanyName("IBM");
        c2.setEmployees(new Employee[]{employees[3], employees[4], employees[5]});

        Company c3 = new Company();
        c3.setCompanyName("Luxoft");
        c3.setEmployees(new Employee[]{employees[6], employees[7], employees[8]});
        return new Company[]{c1, c2, c3};
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command key: " +
                "\n 0.Show all companies " +
                "\n 1. Show employee with MaxSalary " +
                "\n 2.Sort first company  by salary " +
                "\n 3.Sort second company  by age" +
                "\n 4.Sort third company  by surname length \n");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "0":
                    showCompanies();
                    break;
                case "1":
                    getMaxSalary();
                    break;
                case "2":
                   // SortBySalary(c1);
                    break;
                case "3":
                  //  SortByAge(c2);
                    break;
               case "4":
                 // SortBySurnameLength(c3);
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("No such case");
            }
        }
    }

    public static void showCompanies() {
        Company[] companies = getCompanies();
        for (int i = 0; i < companies.length; i++) {
            System.out.println(companies[i].getCompanyName());
        }
    }

    public static void getMaxSalary() {
        Company[] companies = getCompanies();
        for (int i = 0; i < companies.length; i++) {
            Employee temp = companies[i].getEmployees()[0];
            for (int j = 0; j < companies[i].getEmployees().length; j++) {
                double salary = companies[i].getEmployees()[j].getSalary();
                if (temp.getSalary() < salary) {
                    temp = companies[i].getEmployees()[j];
                }
            }
            System.out.println(companies[i].getCompanyName() + " " + temp.getName() + " " + temp.getSalary());
        }
    }

    public static void SortBySalary(Company c ) {
        Company[] companies = CompanyUtil.getCompanies();
        for (int i = 0; i < c.getEmployees().length; i++) {
            for (int j = 0; j < c.getEmployees().length - 1; j++) {
                if (c.getEmployees()[j].getSalary() < c.getEmployees()[j + 1].getSalary()) {
                    Employee temp = c.getEmployees()[j];
                    c.getEmployees()[j] = c.getEmployees()[j + 1];
                    c.getEmployees()[j + 1] = temp;
                }

            }
        }
        System.out.println(c.getCompanyName());
        for (int j = 0; j < c.getEmployees().length; j++) {
            System.out.println(c.getEmployees()[j].getName() + " "
                    + c.getEmployees()[j].getSurname() + " "
                    + c.getEmployees()[j].getSalary());
        }
    }
    public static void SortByAge(Company c) {
        Company[] companies = lessons.lesson_2.CompanyUtil.getCompanies();
        for (int i = 0; i < c.getEmployees().length; i++) {
            for (int j = 0; j < c.getEmployees().length - 1; j++) {
                if (c.getEmployees()[j].getAge() < c.getEmployees()[j + 1].getAge()) {
                    Employee temp = companies[1].getEmployees()[j];
                    c.getEmployees()[j] = c.getEmployees()[j + 1];
                    c.getEmployees()[j + 1] = temp;
                }

            }
        }
        System.out.println(c.getCompanyName());
        for (int j = 0; j < c.getEmployees().length; j++) {
            System.out.println(c.getEmployees()[j].getName() + " "
                    + c.getEmployees()[j].getSurname() + " "
                    + c.getEmployees()[j].getAge());
        }
    }
    public static void SortBySurnameLength(Company c) {
        Company[] companies = lessons.lesson_2.CompanyUtil.getCompanies();
        for (int i = 0; i < c.getEmployees().length; i++) {
            for (int j = 0; j < c.getEmployees().length - 1; j++) {
                if (c.getEmployees()[j].getSurname() == c.getEmployees()[j + 1].getSurname()) {
                    Employee temp = companies[1].getEmployees()[j];
                    c.getEmployees()[j] = c.getEmployees()[j + 1];
                    c.getEmployees()[j + 1] = temp;
                }

            }
        }
        System.out.println(c.getCompanyName());
        for (int j = 0; j < c.getEmployees().length; j++) {
            System.out.println(c.getEmployees()[j].getName() + " "
                    + c.getEmployees()[j].getSurname());
        }
    }
}





