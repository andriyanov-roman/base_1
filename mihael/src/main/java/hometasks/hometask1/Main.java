package hometasks.hometask1;

import java.util.Scanner;

/**
 * Created by user on 09.03.2015.
 */
public class Main {
    public static void main (String [] args){
        start();
    }

    public  static void start (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter comman key");
        System.out.println("1. Schow all users");
        System.out.println("2. Schow sovpadajuschie u odnogo usera");
        System.out.println("3. Schow sovpadajuschie u vseh userov");
        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1":
                    showUsers();
                    break;
                case "2":
                    showSovUsers();
                    break;
                case "3":
                    showObschFamiliiUsers();
                    break;
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("No such case");
            }

        }


    }

    public static void showUsers(){
        User[] users = UserUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.print(users[i].name + " "+ users[i].secondName);
        }
        System.out.println();
    }

    public static void showSovUsers(){
        User[] users = UserUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if(users[i].name.equals(users[i].login)  || users[i].secondName.equals(users[i].login)) {
                System.out.print(users[i].login + " " + users[i].name + " " + users[i].secondName);
            }
        }
        System.out.println();
    }

    public static void showObschFamiliiUsers(){
        User[] users = UserUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            for (int k = 0; k < users.length; k++) {

                if(users[i].secondName.equals(users[k].secondName)) {
                    System.out.println("i" + i + " k " + k);
                    System.out.println("i user" + users[i].login + " " + users[i].name + " " + users[i].secondName);
                    System.out.println("k user" + users[k].login + " " + users[k].name + " " + users[k].secondName);
                }

            }
        }
        System.out.println();
    }

}
