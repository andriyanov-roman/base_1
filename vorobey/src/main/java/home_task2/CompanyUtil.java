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
        c1.setEmployees(new Employee[]{employees[0], employees[1], employees[6]});
        c2.setEmployees(new Employee[]{employees[2], employees[4]});
        c3.setEmployees(new Employee[]{employees[3], employees[5], employees[7]});
        c1.setCompanyName("FirstCompany");
        c2.setCompanyName("SecondCompany");
        c3.setCompanyName("ThirdCompany");

        return new Company[]{c1, c2, c3};

    }

    public static void showCompaniesAndEmployees() {
        Company[] companies = getCompanies();
        for (int i = 0; i < companies.length; i++) {
            System.out.println("********************************");
            System.out.println("В компании " + companies[i].getCompanyName() + " работают сотрудники: ");
            for (int j = 0; j < companies[i].getEmployees().length; j++) {
                System.out.print(companies[i].getEmployees()[j].name + " " + companies[i].getEmployees()[j].secondName + "(" + companies[i].getEmployees()[j].salary + ")");
                System.out.println();
            }
        }


    }

    public static void maxSalary() {
        Company[] companies = getCompanies();
        for (int i = 0; i < companies.length; i++) {
            int maxSalary = 0;
            String maxName = "", maxSecondName = "";
            for (int j = 0; j < companies[i].getEmployees().length; j++) {
                for (int k = 0; k < companies[i].getEmployees()[j].salary; k++) {
                    if (companies[i].getEmployees()[j].salary > maxSalary) {
                        maxSalary = companies[i].getEmployees()[j].salary;
                        maxName = companies[i].getEmployees()[j].name;
                        maxSecondName = companies[i].getEmployees()[j].secondName;
                    }

                }

            }
            System.out.println("В компании " + companies[i].getCompanyName() + " сотрудник с максимальной ЗП: " + maxName + ",а именно :" + maxSalary);

        }


    }

    public static void maxSalaryOfAllCompanies() {
        Company[] companies = getCompanies();
        int maxSalary = 0;
        String maxName = "";
        String maxSecondName = "";
        String maxNameCompany = "";

        for (int i = 0; i < companies.length; i++) {
            for (int j = 0; j < companies[i].getEmployees().length; j++) {
                for (int k = 0; k < companies[i].getEmployees()[j].salary; k++) {
                    if (companies[i].getEmployees()[j].salary > maxSalary) {
                        maxSalary = companies[i].getEmployees()[j].salary;
                        maxName = companies[i].getEmployees()[j].name;
                        maxSecondName = companies[i].getEmployees()[j].secondName;
                        maxNameCompany = companies[i].getCompanyName();

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
        System.out.println("4.Чтобы вывести отсортированых сотрудников первой фирмы в порядке возростания ЗП,нажмите 4");
        System.out.println("5.Чтобы вывести отсортированых сотрудников второй фирмы в порядке возростания возраста,нажмите 5");
        System.out.println("6.Чтобы вывести сотрудника с самой длинной фамилией(третья компнания),нажмите 6");
        System.out.println("7.Чтобы вывести отсортированых в порядке увеличения длины фамилии сотрудников третьей компании,нажмите 7");
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
                case "5":
                    sortAgeSecondCompany();
                    break;
                case "6":

                    maxLengthSecondNameThirdCompany();
                    break;
                case "7":
                    sortSecondName();
                    break;


            }
        }


    }

    public static void sortSalaryFirstCompany() {
        Company[] companies = getCompanies();
        for (int i = 0; i < 1; i++) {
            for (int j = companies[i].getEmployees().length - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (companies[i].getEmployees()[k].salary < companies[i].getEmployees()[k + 1].salary) {
                        Employee e = companies[i].getEmployees()[k];
                        companies[i].getEmployees()[k] = companies[i].getEmployees()[k + 1];
                        companies[i].getEmployees()[k + 1] = e;
                    }
                }
            }
            System.out.println("Сотрудники компании " + companies[i].getCompanyName() + " в порядке возростания ЗП:");
        }
        for (int i = 0; i < 1; i++) {
            for (int j = companies[i].getEmployees().length - 1; j >= 0; j--) {
                System.out.println(companies[i].getEmployees()[j].name + " " + companies[i].getEmployees()[j].secondName + " (" + companies[i].getEmployees()[j].salary + ")");
            }

        }

    }

    public static void sortAgeSecondCompany() {
        Company[] companies = getCompanies();
        for (int i = 1; i < 2; i++) {
            for (int j = companies[i].getEmployees().length - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (companies[i].getEmployees()[k].age < companies[i].getEmployees()[k + 1].age) {
                        Employee e = companies[i].getEmployees()[k];
                        companies[i].getEmployees()[k] = companies[i].getEmployees()[k + 1];
                        companies[i].getEmployees()[k + 1] = e;
                    }
                }
            }
            System.out.println("Сотрудники компании " + companies[i].getCompanyName() + " в порядке возростания возроста:");
        }
        for (int i = 1; i < 2; i++) {
            for (int j = companies[i].getEmployees().length - 1; j >= 0; j--) {
                System.out.println(companies[i].getEmployees()[j].name + " " + companies[i].getEmployees()[j].secondName + " (" + companies[i].getEmployees()[j].age + ")");
            }


        }

    }

    public static void maxLengthSecondNameThirdCompany() {
        Company[] companies = getCompanies();
        String maxLengthSecondName = "";
        int maxLength = 0;
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < companies[i].getEmployees().length; j++) {
                if (companies[i].getEmployees()[j].secondName.length() > maxLength) {
                    maxLengthSecondName = companies[i].getEmployees()[j].secondName;
                    maxLength = companies[i].getEmployees()[j].secondName.length();
                }

            }
        }
        System.out.println("Сотрудник с фамилией :" + maxLengthSecondName);
        System.out.println("Длина фамилии :" + maxLength);


    }

    public static void sortSecondName() {
        Company[] companies = getCompanies();
        for (int i = 2; i < 3; i++) {
            for (int j = companies[i].getEmployees().length - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (companies[i].getEmployees()[k].secondName.length() < companies[i].getEmployees()[k + 1].secondName.length()) {
                        Employee e = companies[i].getEmployees()[k];
                        companies[i].getEmployees()[k] = companies[i].getEmployees()[k + 1];
                        companies[i].getEmployees()[k + 1] = e;
                    }

                }
            }
            System.out.println("Сортировка сотрудников третьей компании в порядке увеличения длины фамилии: ");


        }
        for (int i = 2; i < 3; i++) {
            for (int j = companies[i].getEmployees().length - 1; j >= 0; j--) {
                System.out.println(companies[i].getEmployees()[j].name + " " + companies[i].getEmployees()[j].secondName + "  " + companies[i].getEmployees()[j].secondName.length());
            }
        }

    }

    public static void addNEwEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Добавим нового стотрудника!Чтобы сделать это для первой комапании,нажмите 1,для второй-нажмите 2,для третьей-3");
        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":

                    break;
                case "2":

                    break;

                case "3":

                    break;

            }
        }
    }


}
