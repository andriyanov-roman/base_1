package users;

import company.Employee;
import company.EmployeeUtil;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 09.03.2015.
 */
public class Main {
    public static void main(String args[]) {
        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command key" + " " +
                "0.Show all users \t 1. Login coincides with the name \n " +
                "2. Login coincides with the secondName \t 3.Sort by id \n 4. Identical Employees \t 5.MaxSalary" +
                "\t 6. sort by salary");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "0":
                    showUsers();
                    break;
                case "1":
                    checkUsersLogin();
                    break;
                case "2":
                    checkUsersName();
                    break;
                case "3":
                    sortById();
                    break;
                case "4":
                    getIdenticalEmployees();
                    break;
                case "5":
                    EmployeeMaxSalary();
                    break;
                case "6":
                    sortBySalary();
                    break;
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("No such case");
            }
        }

    }


    public static void showUsers() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].name + " " + users[i].secondName);

        }
    }

    public static void checkUsersLogin() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].name.equals(users[i].login)) {
                System.out.println(users[i].name + " " + "" + users[i].secondName + " " + "" + users[i].login);
            }
            if (users[i].login.equals(users[i].secondName)) {
                System.out.println(users[i].name + " " + "" + users[i].secondName + " " + "" + users[i].login);
            }
        }
    }

    public static void checkUsersName() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length; j++) {
                if (users[i].name.equals(users[j].name)) {
                    System.out.println(users[i].name + " " + "" + users[i].secondName + " " + "" + users[i].login);
                }
                break;
            }
        }
    }

    public static void sortById() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length - 1 - i; j++) {
                if (users[j].id > users[j + 1].id) {
                    User tmp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].name + " " + users[i].secondName + " " + users[i].id);

        }

    }

    public static void getIdenticalEmployees() {
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        for (int i = 0; i < employees.size(); i++) {
            for (int j = 0; j < employees.size(); j++) {
                if (employees.get(i).getName().equals(employees.get(j).getName())) {
                    System.out.println(employees.get(i).getName() + " " + "" + employees.get(i).getSurname());
                }
                break;
            }
        }
    }

    public static void EmployeeMaxSalary() {
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        Employee maxSalary = employees.get(0);
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getSalary() > maxSalary.getSalary()) {
                maxSalary = employees.get(i);
            }

        }
        System.out.println(maxSalary.getName() + " " + maxSalary.getSurname() + " " + maxSalary.getSalary());
    }

    public static void sortBySalary() {
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        for (int i = 0; i < employees.size(); i++) {
            for (int j = 0; j < employees.size() - 1 - i; j++) {
                if (employees.get(j).getSalary() < employees.get(j + 1).getSalary()) {
                    Employee tmp = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set((j + 1), tmp);
                }
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getName() + " " + employees.get(i).getSurname() + " "
                    + employees.get(i).getSalary());

        }

    }
}






