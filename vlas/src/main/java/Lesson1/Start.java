package Lesson1;

import java.util.Scanner;

public class Start {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command key:" +
                " 1. Show all users" + " 2. Show who login= Name or secondName" + " 3. Show who name = secondName" + " 4. Sort users by ID");
        System.out.println("Enter command key:" +
                " 5. Find equal emploees" + " 6. print emploee with biggest salary" + " 7. Sort by salary");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    showUsers();
                    break;
                case "2":
                    checkUsersLeqN();
                    break;
                case "3":
                    checkUsersNeqSN();
                    break;
                case "4":
                    sortByID();
                    break;
//                case "5":
//                    showEmployeesDuplicates();
//                    break;
//                case "6":
//                    prnBiigSal();
//                case "7":
//                    sortBySalary();
//                    break;
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

    public static void checkUsersLeqN() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {

            if (users[i].name.equals(users[i].login)) {
                System.out.println(users[i].name + " " + users[i].secondName + " " + users[i].id);
            }
            if (users[i].secondName.equals(users[i].login)) {
                System.out.println(users[i].secondName + " " + users[i].login + " " + users[i].id);
            }
        }

    }


    public static void checkUsersNeqSN() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].name.equals(users[i].secondName)) {
                System.out.println(users[i].name + " " + users[i].secondName);
            }
        }
    }


    public static void sortByID() {
        User[] users = UsersUtil.getUsers();
        for (int i = users.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (users[j].id < users[j + 1].id) {
                    User u = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = u;
                }
            }
            System.out.print(users[i].name + ',');
        }
    }
}




