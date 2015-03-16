package Homeworks.homework_1;

import Homeworks.homework_1.Employee;
import Homeworks.homework_1.EmployeeUtil;
import Homeworks.homework_1.User;
import Homeworks.homework_1.UsersUtil;

import java.util.Scanner;

/**
 * Created by MacBook on 16.03.15.
 */
public class Main {
    public static void main(String[] args) { letsBegin(); }

    public static void letsBegin() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter command key" + " " +
                    " 0. Login coincides with the name \n " +
                    "1. Login coincides with the secondName \t 2.Sort by id \n 3. Identical Employees + MaxSalary" +
                    "\t 4. Sort by salary");
            while (scanner.hasNext()) {
                switch (scanner.next()) {
                    case "0":
                        checkUsersLogin();
                        break;
                    case "1":
                        checkUsersName();
                        break;
                    case "2":
                        sortById();
                        break;
                    case "3":
                        getIdenticalEmployees();
                        break;
                    case "4":
                        sortBySalary();
                        break;
                    //case "Exit":
                    // System.exit(0);
                    //default:
                    //System.out.println("No such case");
                }
            }

        }


    public static void checkUsersLogin() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].name.equals(users[i].login)) {
                System.out.println(users[i].name + " " + "" + users[i].secondName + " " + "" + users[i].login);
                break;
            }
            if (users[i].login.equals(users[i].secondName)) {
                System.out.println(users[i].name + " " + "" + users[i].secondName + " " + "" + users[i].login);
            }
        }
    }

    public static void checkUsersName() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            for (int j = 1; j < users.length; j++) {
                if (users[i].name.equals(users[j].name)) {
                    if (users[i].secondName.equals(users[j].secondName)) {
                        System.out.println(users[i].name + " " + "" + users[i].secondName + " " + "" + users[i].login);
                    }
                }
                break;
            }
        }
    }

    public static void sortById() {
        User[] users = UsersUtil.getUsers();
        for (int i = users.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (users[j].id > users[j + 1].id) {
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].name + " " + users[i].secondName + " " + users[i].id);

        }

    }

    public static void getIdenticalEmployees() {
        Employee[] employees = EmployeeUtil.getEmployees();
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length; j++) {
                if (employees[i].name.equals(employees[j].name)) {
                    if (employees[i].salary > employees[j].salary) {
                        System.out.println(employees[i].name + " " + employees[i].secondName + " " +
                                "has bigger salary, than" + " " + employees[j].name + " " + employees[j].secondName);
                    } else if (employees[j].salary > employees[i].salary) {
                        System.out.println(employees[j].name + " " + employees[j].secondName + " " +
                                "has bigger salary, than" + " " + employees[i].name + " " + employees[i].secondName);

                    }
                    break;
                }
            }
        }
    }

    public static void sortBySalary(){
        Employee [] employees = EmployeeUtil.getEmployees();
        for (int i = employees.length; i > 0; i--) {
            for (int j = 1; j < i; j++)
                if (employees[j].salary < employees[j - 1].salary) {
                    Employee temp = employees[j];
                    employees[j] = employees[j - 1];
                    employees[j - 1] = temp;
                }
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].name + " " + employees[i].secondName + " "+ employees[i].salary);

        }

    }

}