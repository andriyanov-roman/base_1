package hometask1;

import java.util.Random;
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
        welcome();
        while (scanner.hasNext()){

            switch (scanner.next()) {
                case "0":
                    showUsers();
                    break;
                case "1":
                    showUsersEq();
                    break;
                case "2":
                    showUsersDuplicate();
                    break;
                case "3":
                    sortById();
                    break;
                case "Exit":
                    System.exit(0);
                case "exit":
                    System.exit(0);
                default:
                    System.out.println ("No such case");
            }
            welcome();
        }
    }
    public static void welcome(){
        System.out.print (
                "\n 0.Show all users"+
                        "\n 1.Show users with equal parameters"+
                        "\n 2.Show duplicate users"+
                        "\n 3.Sort users by ID"+
                        "\n Exit. End program." +
                        "\nEnter command key:");
    }
    public static void showUsers() {
        User[] users = UsersUtil.getUsers();
        System.out.println("======== Total users: "+users.length+" =======\n\tShow all:");
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].id+"). Name: "+users[i].name + "\nSurname: "+users[i].secondName);
            System.out.println("Age: "+users[i].age);
            System.out.println("Login: "+users[i].login);
            System.out.println("--------------------------");
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

    public static void showUsersDuplicate(){
        // Барахло (пересмотреть!!!!!!!!)
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            for (int j = i+1; j < users.length; j++) {
                if ( users[i].name.equals(users[j].name) && users[i].secondName.equals(users[j].secondName) ) {
                    System.out.println ("Duplicates:"+users[i].name+" "+users[i].secondName+" | id="+users[i].id+", id="+users[j].id);
                }
            }
        }
    }
    public static void sortById() {
        User[] users = UsersUtil.getUsers();
        int i =0;
        Random r = new Random();
        System.out.println("\nMixing IDs:");
        for (int j = 0; j < users.length; j++) {
            users[j].id=r.nextInt(10)*users[j].id+1;
            System.out.print(users[j].id+")"+users[j].login+" ");
        }
        System.out.println("\nSorting by IDs:");
        User bubble;
        for (int j = 0; j < users.length-1; j++) {
            for (int k = 0; k < users.length-1-j; k++) {
                if (users[k+1].id < users[k].id){
                    bubble = users[k+1];
                    users[k+1]=users[k];
                    users[k]=bubble;
                }
            }
        }
        for (int j = 0; j < users.length; j++) {
            System.out.print(users[j].id+")"+users[j].login+" ");
        }
        System.out.println();
    }





}
