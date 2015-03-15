package lesson_1;

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
                "0.Show all users \t 1. Login matches name \n 2. Login matches secondName \t 3.Sort by id");
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
                //case "Exit":
                // System.exit(0);
                //default:
                //System.out.println("No such case");
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
            } else {

            }
            if (users[i].login.equals(users[i].secondName)) {
                System.out.println(users[i].name + " " + "" + users[i].secondName + " " + "" + users[i].login);
            } else {

            }
        }
    }

    public static void checkUsersName() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length; j++) {
                if (users[i].name.equals(users[j].name)) {
                    System.out.println(users[i].name + " " + "" + users[i].secondName + " " + "" + users[i].login);
                } else {
                    break;
                }
            }
        }
    }
    public static void sortById() {
        User[] users = UsersUtil.getUsers();
        for (int i = users.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (users[j].id > users[j + 1].id) {
                    long tmp = users[j].id;
                    users[j].id = users[j + 1].id;
                    users[j + 1].id = tmp;
                }
            }

            System.out.println(users[i].name + " " + users[i].id);
        }
    }
    }




