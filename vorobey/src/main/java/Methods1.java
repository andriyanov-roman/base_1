import java.util.Scanner;

/**
 * Created by user on 09.03.2015.
 */
public class Methods1 {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.For obtaining information of users, press button  1");
        System.out.println("2.Whether the name and a surname of the user coincides, press button  2");
        System.out.println();


        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":
                    showUser();
                    break;
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
            System.out.print(users[i].name + " " + users[i].secondName + ",");
        }
        System.out.println();

    }

    public static void checkUser() {

        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < users.length; j++) {
                if (users[i].name.equals(users[j].secondName)) {
                    System.out.println("Имя и Фамилия совпадают");
                    System.out.println(users[i].name + "  " + users[i].secondName);


                } else {
                    System.out.println("Имя и Фамилия не совпадают");
                    System.out.println(users[j].name + "  " + users[j].secondName);


                }


            }

        }
    }

    public static void checkUsersLogin() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].login.equals(users[i].name) || users[i].login.equals(users[i].secondName))
                System.out.println("Логин и Имя(Фамилия) совпадают:  " + users[i].name + "," + users[i].secondName);
        }
    }
}

