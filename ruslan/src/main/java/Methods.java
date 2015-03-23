/*
import home_work.*;

import java.util.*;
import java.util.Scanner;

*/
/**
 * Created by user on 23.03.2015.
 *//*

public class Methods {
    public static void ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите интересующею Вас информацию:");
        System.out.println("1.  Информация о юзерах.");
        System.out.println("2.  Информация о юзерах у которых имя совпадает с логином.");
        System.out.println("3.  Информация о юзерах с одинаковым именем и фамилией.");
        System.out.println("4.  Сортировка юзеров по ID.");
        System.out.println("5.  Информация о работниках.");
        System.out.println("6.  Информация о заработной плате работников. Максимальная зарплата.");
        System.out.println("7.  Информация о работниках, c одинаковыми, именами и фамилиями. Показать их.");
        System.out.println("8.  Отсортировать работников компани №1, по заработной плате.");
        System.out.println("9.  Отсортировать работников компани №2, по возрасту.");
        System.out.println("10.  Отсортировать работников компани №3, по длине фамилии.");
        System.out.println("11.  Добавить сотрудника.");
        System.out.println("12.  Ввести нового сотрудника либо вывести в консоль того которого добавили.");
        System.out.println("13.  Поднять зарплату всем сотрудникам.");
        System.out.println("14.  Уволить всех женщин компании.");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    showUsers();
                    break;
                case "2":
                    checkUsersLogin();
                    break;
                case "3":
                    checkUsersName();
                    break;
                case "4":
                    sortUsersId();
                    break;
                case "5":
                    showEmployee();
                    break;
                case "6":
                    maxSalary();
                    break;
                case "7":
                    sameEmployee();
                    break;
                case "8":
                    sortSalary();
                    break;
                case "9":
                    sortAge();
                    break;
                case "10":
                    sortSecondName();
                    break;
                case "11":
                    addNewEmployee();
                    break;
                case "12":
                    showCreateEmployees();
                    break;
                case "13":
                    takeUpperSalaryForMan();
                    break;
                case "14":
                    firedAllWomen();
                    break;
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("Нету интересующей Вас информации.");
            }
        }
    }

    private static void sameEmployee() {
        ArrayList<Employee> employee = EmployeeUtil.getEmployee();
        for (int i = 0; i < employee.size(); i++) {
            for (int j = i + 1; j < employee.size(); j++) {
                if (employee.get(i).name == employee.get(j).name && employee.get(i).secondName == employee.get(j).secondName) {
                    System.out.println(" Имя  и фамилия однофамильцев - " + employee.get(i).getName() + " " + employee.get(i).getSecondName() + " и " +
                            employee.get(j).getName() + " " + employee.get(j).getSecondName());
                }
            }
        }
    }

    private static void maxSalary() {
        ArrayList<Employee> employee = EmployeeUtil.getEmployee();
        Employee temp = employee.get(0);
        for (int i = 0; i < employee.size(); i++) {
            if (employee.get(i).salary > temp.salary) {
                temp = employee.get(i);
                System.out.println("Сотрудник с самой высокой заработной платой :  " + "  Имя, фамилия - " +
                        employee.get(i).getName() + " " + employee.get(i).getSecondName() + " , зарплата " + employee.get(i).getSalary() + " USD ");
            }
        }
    }

    private static void showEmployee() {
        ArrayList<Employee> employee = EmployeeUtil.getEmployee();
        for (int i = 0; i < employee.size(); i++) {
            System.out.print(employee.get(i).getName() + " " + employee.get(i).getSecondName() + ",  - Зарплата -  " + employee.get(i).getSalary());
            System.out.println();
        }
    }

    private static void sortUsersId() {
        User[] users = UserUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length - 1; j++) {
                if (users[j].id < users[j + 1].id) {
                    User employee = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = employee;
                }
            }
        }
        System.out.println(" Сортировка оп ID :");
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].name + users[i].secondName + " - " + users[i].id);
        }
    }

    private static void checkUsersName() {
        User[] users = UserUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i].name == users[j].name && users[i].secondName == users[j].secondName) {
                    //if (users[i].name.equals(users[j].name) && users[i].secondName.equals(users[j].secondName)) {
                    System.out.println(" Юзеры, однофамильцы :  " + users[i].name + " " + users[i].secondName + " и " + users[j].name + " " + users[j].secondName);
                } else {
                    break;
                }
            }
        }
    }

    private static void checkUsersLogin() {
        User[] users = UserUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].name.equals(users[i].login)) {
                System.out.println(" Имя и Логин совпадают у юзера : " + users[i].name + " " + users[i].secondName + ", логин: " + users[i].login);
            } else {
                break;
            }
        }
    }

    private static void showUsers() {
        User[] users = UserUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.println(" Имя, Фамилия юзера: " + users[i].name + " " + users[i].secondName + ", Login - " + users[i].login);
            System.out.println();
        }
    }

    private static void firedAllWomen() {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size() - 1; j++) {
                if (companies.get(i).getEmployees().get(j).getGender() == "Female") {
                    companies.get(i).getEmployees().remove(j);
                    j--;
                }
            }
        }
        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size() - 1; j++) {
                System.out.println(" Имя и фамилия сотрудника " + companies.get(i).getEmployees().get(j).getName()+ " " +
                        companies.get(i).getEmployees().get(j).getSecondName());
            }
        }
    }

    private static void takeUpperSalaryForMan() {

        double payment = 5000.5;
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size() - 1; j++) {
                if (companies.get(i).getEmployees().get(j).getGender() == "Male") {
                    companies.get(i).getEmployees().get(j).setSalary(companies.get(i).getEmployees().get(j).getSalary() + payment);
                }
            }
        }
        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size() - 1; j++) {
                System.out.println(" Название компании : " + companies.get(i).getCompanyName() + " Имя и фимилия сотрудника : " +
                        companies.get(i).getEmployees().get(j).getName() + " " +
                        companies.get(i).getEmployees().get(j).getSecondName() + ", зарплата - " + companies.get(i).getEmployees().get(j).getSalary() + " USD ");
            }
        }
    }

    private static void showCreateEmployees() {

    }

    private static void addNewEmployee() {
        */
/*Scanner scannerNew = new Scanner(System.in);
        System.out.println("\nВыберите компанию,в которую желаете добавить сотрудника:" +
                "\n1) IBM" +
                "\n2) ORACLE" +
                "\n3) IKEA");
        while (scannerNew.hasNext()) {
            switch (scannerNew.next()) {
                case "1":
                    createEmployeeIBM();
                    break;
                case "2":
                    createEmployeeORACLE();
                    break;
                case "3":
                    createEmployeeIKEA();
                    break;
            }
        }
    }*//*


   */
/* private static void createEmployeeIKEA() {

    }

    private static void createEmployeeORACLE() {

    }

    private static void createEmployeeIBM() {*//*


    }

    private static void sortSecondName() {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 1; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size() - 1; j++) {
                if (companies.get(i).getEmployees().get(j).getSecondName().length() < companies.get(i).getEmployees().get(j + 1).getSecondName().length()) {
                    Employee employee = companies.get(i).getEmployees().get(j);
                    companies.get(i).getEmployees().set(j, companies.get(i).getEmployees().get(j + 1));
                    companies.get(i).getEmployees().set((j + 1), employee);
                }


                System.out.println(" Сортировка по длине букв в фамилии : ");
                System.out.println(companies.get(i).getEmployees().get(i).getSecondName());
                System.out.print(" Количество букв в фамилии: " + companies.get(i).getEmployees().get(j).getSecondName().length());
            }
        }
    }

    private static void sortAge() {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size() - 1; j++) {
                if (companies.get(i).getEmployees().get(j).getAge() < companies.get(i).getEmployees().get(j + 1).getAge()) {
                    Employee employee = companies.get(i).getEmployees().get(j);
                    companies.get(i).getEmployees().set(j, companies.get(i).getEmployees().get(j + 1));
                    companies.get(i).getEmployees().set((j + 1), employee);
                }
            }
            System.out.println(" Сортировка по возрасту : ");
            System.out.println(companies.get(i).getEmployees().get(i).getName() + " " +
                    companies.get(i).getEmployees().get(i).getSecondName() + " - " +
                    companies.get(i).getEmployees().get(i).getAge() + " year(s) ");
        }
    }

    private static void sortSalary() {
       */
/* ArrayList<Company> companies = CompanyUtil.getCompanies();

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size() - 1; j++) {
                if (companies.get(i).getEmployees().get(j).getSalary() < companies.get(i).getEmployees().get(j + 1).getSalary()) {
                    Employee employee = companies.get(i).getEmployees().get(j);
                    companies.get(i).getEmployees().set(j, companies.get(i).getEmployees().get(j + 1));
                    companies.get(i).getEmployees().set((j + 1), employee);

                    System.out.println(" Сортировка по зарплате : ");
                }

                System.out.println(companies.get(i).getEmployees().get(j).getName() + " " + companies.get(i).getEmployees().get(j).getSecondName() +
                        " зарплата : " + companies.get(i).getEmployees().get(j).getSalary());

            }
        }
    }*//*

        ArrayList<Company> companies = CompanyUtil.getCompanies();
        ArrayList<Employee> employees = EmployeeUtil.getEmployee();

        for (int i = 0; i < employees.size(); i++) {
            for (int j = 0; j < employees.size() - 1; j++) {
                if (employees.get(j).getSalary() < employees.get(j+1).getSalary()) {
                    Employee employee = employees.get(j);
                    companies.get(i).getEmployees().set(j, companies.get(i).getEmployees().get(j + 1));
                    companies.get(i).getEmployees().set((j + 1), employee);

                }
            }
        }
        System.out.println(" Сортировка оп ЗП :");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getName() + employees.get(i).getSecondName() + " - " + employees.get(i).getSalary());
        }
    }
}









*/
