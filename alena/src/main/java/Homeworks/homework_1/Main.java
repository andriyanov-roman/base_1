package Homeworks.homework_1;



import entity.Company;
import entity.Employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static Lessons.LessonTwo.Methods.addNewEmployee;

/**
 * Created by MacBook on 16.03.15.
 */
public class Main {
    public static void main(String[] args) throws IOException { letsBegin(); }

    public static void letsBegin() throws IOException {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter command key" + " " +
                    " 0. Login coincides with the name \n " +
                    "1. Login coincides with the secondName \t 2.Sort by id \n 3. Identical Employees + MaxSalary" +
                    "\t 4. Sort by salary" + "\t 5.Write new employee");
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
//                        getIdenticalEmployees();
                        break;
                    case "4":

                        /*sortBySalary();
                        break;*/
                    case "5":
                        addNewEmployee(scanner);
                        /*writeToFileEmployee(employees);
                        System.out.println(employees.toString());*/
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

//    public void getIdenticalEmployees() throws IOException {
//        ArrayList<Employee> employees = Company.getEmployees();
//        for (int i = 0; i < employees.size(); i++) {
//            for (int j = 0; j < employees.size(); j++) {
//                if (employees.get(i).getName().equals(employees.get(j).getName())) {
//                    if (employees.get(i).getSalary() > employees.get(j).getSalary()) {
//                        System.out.println(employees.get(i).getName() + " " + employees.get(i).getSecondName() + " " +
//                                "has bigger salary, than" + " " + employees.get(j).getName() + " " + employees.get(j).getSecondName());
//                    } else if (employees.get(j).getSalary() > employees.get(i).getSalary()) {
//                        System.out.println(employees.get(j).getName() + " " + employees.get(j).getSecondName() + " " +
//                                "has bigger salary, than" + " " + employees.get(i).getName() + " " + employees.get(i).getSecondName());
//
//                    }
//                    break;
//                }
//            }
//        }
//    }

    public static void sortBySalary( Company c) throws IOException {
        for (int i = 0; i < c.getEmployees().size(); i++) {
            for (int j = 1; j < c.getEmployees().size(); j++)
                if (c.getEmployees().get(j).getSalary() < c.getEmployees().get(j - 1).getSalary()) {
                    Employee temp = c.getEmployees().get(j);
                    c.getEmployees().set(j, c.getEmployees().get(j - 1));
                    c.getEmployees().set((j - 1), temp);
                }
        }
        for (int i = 0; i < c.getEmployees().size(); i++) {
            System.out.println(c.getEmployees().get(i).getName() + " " + c.getEmployees().get(i).getSecondName() + "" +
                    " " + c.getEmployees().get(i).getSalary());

        }

    }
}