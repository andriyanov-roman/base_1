package homeTask1;

import java.util.Scanner;


public class Methods {
    public static void scan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command key!");
        System.out.println("1. Show all users");
        System.out.println("2. Совпадение логина с именем или фамилией");

        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    showUsers();
                    break;
                case "2":
                    sovpadenue();
                    break;
                case "Exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("No such case");
            }
        }
    }

    public static void showUsers() {
        UserMatveu[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.print(users[i].name + " " + users[i].secondName + " ");
        }
        System.out.println();
    }

    public static void sovpadenue() {
        UserMatveu[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].login.equals(users[i].name)) {
                System.out.println("Логин совпадает с именем: "+users[i].name);
            }
            if (users[i].login.equals(users[i].secondName)) {
                System.out.println("Логин совпадает с фамилией: "+users[i].secondName);
            }

        }

    }
}
