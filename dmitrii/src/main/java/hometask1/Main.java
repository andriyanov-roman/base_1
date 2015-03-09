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
                        "\n 2.Show users with equal Names + Surnames"+
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
                case "2":
                    showUsersWithEqualNamesAndSurnames();
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
            if (users[i].login.equals(users[i].name) ) {
                System.out.println("Login Eq Name. Login:"+users[i].login+" / name: "+users[i].name+" (user id="+users[i].id+")");
            }
            if ( users[i].login.equals(users[i].secondName)) {
                System.out.println("Login Eq Surname. Login:"+users[i].login + " Surname:"+users[i].secondName+" (user id="+users[i].id+")");
            }
        }
        System.out.println();
    }

    public static void showUsersWithEqualNamesAndSurnames(){
        // Барахло (пересмотреть!!!!!!!!)
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            for (int j = 1; j < users.length; j++) {
                if ( users[i].name.equals(users[j].name) & users[i].secondName.equals(users[j].secondName) ) {
                    System.out.println ("Duplicates:"+users[i].name+" "+users[i].secondName+" | id="+users[i].id+", id="+users[j].id);
                }
            }
        }
    }
}
