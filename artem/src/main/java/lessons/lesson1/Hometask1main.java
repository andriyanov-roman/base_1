package lessons.lesson1;

import java.util.Scanner;

public class Hometask1main {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command key\n1 - Show all users\n2 - Check login");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    showUsers();
                    break;
                case "2":
                    checkName();
                    break;
                case "9":
                    System.exit(0);
                default:
                    System.out.println("No such case");
            }
        }
    }

    public static void showUsers() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.print(users[i].name + " " + users[i].secondName + "\n");
        }
        System.out.println();
    }

    public static void checkName(){
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].login.equals(users[i].name)||users[i].login.equals(users[i].secondName)) System.out.println("Users "+i+"has the same login and name");
        }
    }
}
