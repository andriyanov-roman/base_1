package lesson_1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command key" +
                "1. Show all users");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    showUsers();
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
            System.out.print(users[i].name + " " + users[i].secondName);
        }
        System.out.println();
    }

    public static void checkUsers() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {

            System.out.print(users[i].name + " " + users[i].secondName);
        }
        System.out.println();
    }


}
