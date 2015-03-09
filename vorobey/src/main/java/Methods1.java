import java.util.Scanner;

/**
 * Created by user on 09.03.2015.
 */
public class Methods1 {
    public static void start(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    showUser();
                case "2":
                    checkUser();
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
        int count = 0;
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < users.length; j++) {
                if (users[i].name.equals(users[j].secondName)) {
                    System.out.println("Имя и Фамилия совпадают");
                    System.out.println(users[i].name + "  " + users[i].secondName);
                    count++;
                    System.out.println("Количество сотрудников с совпадениями: " + count);
                } else {
                    System.out.println("Имя и Фамилия не совпадают");
                    System.out.println(users[j].name + "  " + users[j].secondName);
                    System.out.println("Количество сотрудников с несовпадениями: " + count);

                }


            }

        }
    }
}

