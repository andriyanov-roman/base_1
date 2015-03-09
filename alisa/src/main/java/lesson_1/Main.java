package lesson_1;

import java.util.Scanner;

/**
 * Created by user on 09.03.2015.
 */
public class Main {
    public static void main(String args[]) {
        start();
    }
    public static void start () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command key" + " " +
                "1.Show all users" +
                "2. Check all users");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    showUsers();
                    break;
                case "2":
                    checkUsers();
                    break;
               // case "Exit":
                   // System.exit(0);
               // default:
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
    public static void checkUsers() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length; j++) {
                if(users[i].name.equals(users[j].login)) {

                }
            }

            System.out.println(users[i].name + " " + users[i].secondName);

        }
    }
    
}

