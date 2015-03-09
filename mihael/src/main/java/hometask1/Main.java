package hometask1;

import java.util.Scanner;

/**
 * Created by user on 09.03.2015.
 */
public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter comman key");
        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1":
                    showUsers();
                break;
                default:
                    System.out.println("No such case");
            }

        }
        //showUsers();
        showSovUsers();

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
            if(users[i].name== users[i].login || users[i].secondName ==users[i].login) {
                System.out.print(users[i].login + " " + users[i].name + " " + users[i].secondName);
            }
        }
        System.out.println();
    }


}
