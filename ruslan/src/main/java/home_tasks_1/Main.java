package home_tasks_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command key");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    showUsers();
                    break;
                case "2":
                    checkUsers();
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
            System.out.println(users[i].name + " " + users[i].secondName + ", Login - " + users[i].login);
            System.out.println();

        }
    }

    public static void checkUsers() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            //for (int j = 0; j < users.length; j++)
            if (users[i].name.equals(users[i].login)) {
                System.out.println(" same ");
            } else {
                System.out.println(" not the same ");
            }
        }
    }
}





