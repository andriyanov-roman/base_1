package hometask1;

import java.util.Scanner;

/**
 * Created by user on 09.03.2015.
 */

public class Main {
    public static void main(String[] args) {
        startProgram();
    }

    public static void startProgram () {
        Scanner scanner = new Scanner(System.in);
        System.out.println (
                "\n 0.Show all users"+
                "\n 1.Show users with equal parametres"+
                "\n Exit. End programm." +
                "\nEnter command key:");
        while (scanner.hasNext()){
            switch (scanner.next()) {
                case "0":
                    showUsers();
                    break;
                case "1":
                    showUsersEq();
                    break;
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println ("No such case");
            }
        }
    }
    public static void showUsers() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.println("Name: "+users[i].name + " / Surname:"+users[i].secondName);
        }
        System.out.println();
    }

    public static void showUsersEq() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].login.equals(users[i].name) | users[i].login.equals(users[i].secondName)) {
                System.out.println("Login "+users[i].login+" Name: "+users[i].name + " Surname:"+users[i].secondName);
            }
        }
        System.out.println();
    }
}
