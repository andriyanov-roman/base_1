package Lesson1;

import java.util.Scanner;

public class Start {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command key" +
                " 1. Show all users"+ " 2. Show who name=login");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    showUsers();
                    break;
                case "2":
                    checkUsers();
                    break;
                case "Exit":
                    System.exit(0); // закрывается поток
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
        System.out.println();
    }

    public static void checkUsers() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].name.equals(users[i].login)){

            }
            System.out.println(users[i].name + " " + users[i].secondName);
        }
        System.out.println();
    }
}



