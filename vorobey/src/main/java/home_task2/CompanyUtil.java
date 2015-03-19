package home_task2;


import home_task.Employee;
import home_task.EmployeeUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class CompanyUtil {
    public static ArrayList<Company> getCompanies() {
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        Company c1 = new Company();
        Company c2 = new Company();
        Company c3 = new Company();
        c1.setEmployees(new ArrayList<>());
        c1.getEmployees().add(employees.get(0));
        c1.getEmployees().add(employees.get(1));
        c1.getEmployees().add(employees.get(2));

        c2.setEmployees(new ArrayList<>());
        c2.getEmployees().add(employees.get(3));
        c2.getEmployees().add(employees.get(4));

        c3.setEmployees(new ArrayList<>());
        c3.getEmployees().add(employees.get(5));
        c3.getEmployees().add(employees.get(6));
        c3.getEmployees().add(employees.get(7));


        c1.setCompanyName("FirstCompany");
        c2.setCompanyName("SecondCompany");
        c3.setCompanyName("ThirdCompany");

        return new ArrayList<Company>(Arrays.asList(c1, c2, c3));

    }

    public static void showCompaniesAndEmployees() {
        ArrayList<Company> companies = getCompanies();
        for (int i = 0; i < companies.size(); i++) {
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
        System.out.println("6.Чтобы вывести сотрудника с самой длинной фамилией(третья компания),нажмите 6");
        System.out.println("7.Чтобы вывести отсортированых в порядке увеличения длины фамилии сотрудников третьей компании,нажмите 7");
        System.out.println("8.Чтобы добавить нового сотрудника в первую(например) компанию, 8");

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

                case "8":
                    newEmployee();
                    break;

                case "9":
                    showNewEmployee();
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


    public static void newEmployee() {
        Company[] companies = getCompanies();
        Employee[] employees = EmployeeUtil.getEmployees();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < employees.length; j++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите Имя и Фамилию нового сотрудника");
                employees[j].name = sc.next();
                employees[j].secondName = sc.next();

                System.out.println("Возраст и ЗП нового сотрдуника");


                employees[j].age = sc.nextInt();
                employees[j].salary = sc.nextInt();

                System.out.println("Введите Пол сотрудника");
                employees[j].sex = sc.next();
                Employee e = new Employee(employees[j].name, employees[j].secondName, employees[j].age, employees[j].salary, employees[j].sex);
                employees[j] = e;
                for (int k = 0; k < 1; k++)
                    companies[i].setEmployees(new Employee[]{employees[j]});

            }
        }
        showNewEmployee();
    }


    public static void showNewEmployee() {
        Company[] companies = getCompanies();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < companies[i].getEmployees().length; j++) {
                System.out.println(companies[i].getEmployees()[j].name + " " + companies[i].getEmployees()[j].secondName);
            }

        }


    }


}
