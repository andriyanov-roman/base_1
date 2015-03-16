package home_task2;

import com.sun.javafx.geom.AreaOp;
import home_task.Employee;
import home_task.EmployeeUtil;

import java.util.Scanner;

/**
 * Created by Stas on 16.03.2015.
 */
public class CompanyUtil {
    public static Company[] getCompanies() {
        Employee[] employees = EmployeeUtil.getEmployees();
        Company c1 = new Company();
        Company c2 = new Company();
        Company c3 = new Company();
        c1.employees = new Employee[]{employees[0], employees[1], employees[6]};
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
            System.out.println("********************************");
            System.out.println("В компании " + companies[i].companyName + " работают сотрудники: ");
            for (int j = 0; j < companies[i].employees.length; j++) {
                System.out.print(companies[i].employees[j].name + " " + companies[i].employees[j].secondName + "(" + companies[i].employees[j].salary + ")");
                System.out.println();
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

    public static void maxSalaryOfAllCompanies() {
        Company[] companies = getCompanies();
        int maxSalary = 0;
        String maxName = "";
        String maxSecondName = "";
        String maxNameCompany = "";

        for (int i = 0; i < companies.length; i++) {
            for (int j = 0; j < companies[i].employees.length; j++) {
                for (int k = 0; k < companies[i].employees[j].salary; k++) {
                    if (companies[i].employees[j].salary > maxSalary) {
                        maxSalary = companies[i].employees[j].salary;
                        maxName = companies[i].employees[j].name;
                        maxSecondName = companies[i].employees[j].secondName;
                        maxNameCompany = companies[i].companyName;

                    }
                }
            }


        }
        System.out.println("Из всех компаний,сотрудник с максимальной ЗП :" + maxName + ",а именно :" + maxSalary + ", работает в компании " + maxNameCompany);

    }

    public static void launch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Чтобы увидеть,какие сотрудники в каких компаниях работают,нажмите 1");
        System.out.println("2.Чтобы вывести сотрудников с максимальной ЗП в каждой компании,нажмите 2");
        System.out.println("3.Чтобы вывести сотрудника с максимальной ЗП относительно всех сотрудников(всех компаний),нажмите 3");
        System.out.println("4.Чтобы вывести отсортированых сотрудников первой фирмы в порядке возростания,нажмите 4");
        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":
                    showCompaniesAndEmployees();
                    break;

                case "2":
                    maxSalary();
                    break;
                case "3":
                    maxSalaryOfAllCompanies();
                    break;
                case "4":
                    sortSalaryFirstCompany();
                    break;


            }
        }


    }

    public static void sortSalaryFirstCompany() {
        Company[] companies = getCompanies();
        for (int i = 0; i < 1; i++) {
            for (int j = companies[i].employees.length - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (companies[i].employees[k].salary < companies[i].employees[k + 1].salary) {
                        Employee e = companies[i].employees[k];
                        companies[i].employees[k] = companies[i].employees[k + 1];
                        companies[i].employees[k + 1] = e;
                    }
                }
            }
            System.out.println("Сотрудники компании " + companies[i].companyName + " в порядке возростания ЗП:");
        }
        for (int i = 0; i < 1; i++) {
            for (int j = companies[i].employees.length - 1; j >= 0; j--) {
                System.out.println(companies[i].employees[j].name + " " + companies[i].employees[j].secondName + " (" + companies[i].employees[j].salary + ")");
            }

        }

    }

}





