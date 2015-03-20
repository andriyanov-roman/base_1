package Homeworks.homework_1;

import Homeworks.homework_1.Employee;
import Homeworks.homework_1.EmployeeUtil;
import Homeworks.homework_1.User;
import Homeworks.homework_1.UsersUtil;

import java.util.ArrayList;
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
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        for (int i = 0; i < employees.size(); i++) {
            for (int j = 0; j < employees.size(); j++) {
                if (employees.get(i).getName().equals(employees.get(j).getName())) {
                    if (employees.get(i).getSalary() > employees.get(j).getSalary()) {
                        System.out.println(employees.get(i).getName() + " " + employees.get(i).getSecondName() + " " +
                                "has bigger salary, than" + " " + employees.get(j).getName() + " " + employees.get(j).getSecondName());
                    } else if (employees.get(j).getSalary() > employees.get(i).getSalary()) {
                        System.out.println(employees.get(j).getName() + " " + employees.get(j).getSecondName() + " " +
                                "has bigger salary, than" + " " + employees.get(i).getName() + " " + employees.get(i).getSecondName());

                    }
                    break;
                }
            }
        }
    }

    public static void sortBySalary(){
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        for (int i = 0; i < employees.size(); i++) {
            for (int j = 1; j < employees.size(); j++)
                if (employees.get(j).getSalary() < employees.get(j - 1).getSalary()) {
                    Employee temp = employees.get(j);
                    employees.set(j, employees.get(j - 1));
                    employees.set((j - 1), temp);
                }
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getName() + " " + employees.get(i).getSecondName() + " "+ employees.get(i).getSalary());

        }

    }

}