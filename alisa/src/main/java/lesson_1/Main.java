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
                "1.Show all users \t 2. Login matches name");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    showUsers();
                    break;
                case "2":
                    checkUsersName();
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

    public static void checkUsersName() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
                if (users[i].name.equals(users[i].login)) {
                    System.out.println(users[i].name + " " + "" + users[i].secondName + " " + ""+ users[i].login);
                } else {
                    break;
                }
            if(users[i].login.equals(users[i].secondName)){
                System.out.println(users[i].name + " " + "" + users[i].secondName + " " + ""+ users[i].login);
            } else {
                break;
            }
            }
        }
    }



