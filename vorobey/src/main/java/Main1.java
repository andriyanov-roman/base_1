import java.util.Scanner;

/**
 * Created by user on 09.03.2015.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        checkUser();


        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    showUser();
                    break;
                case "Exit":
                    System.exit(0);

                default:
                    System.out.println("No such case");
            }
        }

    }

    public static void showUser() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.print(" " + users[i].name + "  " + users[i].secondName);
        }
        System.out.println();

    }

    public static void checkUser() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length; j++) {
                if (users[i].name.equals(users[j].secondName)) {
                    System.out.println("Имя и Фамилия совпадают");
                } else {
                    System.out.println("Не совпадают");
                }
            }
            System.out.println();


        }

    }
}


