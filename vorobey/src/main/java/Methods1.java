import java.util.Scanner;

/**
 * Created by user on 09.03.2015.
 */
public class Methods1 {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Для получения информации об участниках,нажмите '1' ");
        System.out.println("2.Чтобы узнать,у каких участников совпадает логин с именем или фамлией,нажмите '2' ");
        System.out.println();


        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":
                    showUser();
                    break;
                case "2":
                    checkUsersLogin();
                    break;
                case "3":
                    checkUser();

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
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < 1; j++) {
                if (users[i].name.equals(users[i].secondName)) {
                    System.out.println("Имя и Фамилия совпадают: " + users[i].name + "  " + users[i].secondName);
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

