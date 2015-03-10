import java.util.Scanner;

/**
 * Created by user on 09.03.2015.
 */
public class Methods1 {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Для получения информации об участниках,нажмите '1' ");
        System.out.println("2.Чтобы узнать,у каких участников совпадает логин с Именем или Фамилией,нажмите '2' ");
        System.out.println("3.Чтобы узнать,у каких участников совпадает Имя и Фамилия,нажмите '3'");
        System.out.println("4.Чтобы отсортировать участников по id в порядке возростания,нажмите '4'");


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
                    break;
                case "4":
                    sort();
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
            System.out.println((i+1) + "." + users[i].name + " " + users[i].secondName + ", age: " + users[i].age + ", id: " + users[i].id + ", Login: " + users[i].login);
        }


    }

    public static void checkUser() {

        User[] users = UsersUtil.getUsers();
        System.out.println("Имя и Фамилимя совпадают у: ");
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < 1; j++) {
                if (users[i].name.equals(users[i].secondName)) {
                    System.out.println(users[i].name + "  " + users[i].secondName + ".");
                }


            }
        }


    }

    public static void checkUsersLogin() {
        User[] users = UsersUtil.getUsers();
        System.out.println("Логин и Имя(Фамилия) совпадают у: ");
        for (int i = 0; i < users.length; i++) {
            if (users[i].login.equals(users[i].name) || users[i].login.equals(users[i].secondName))
                System.out.println(users[i].name + "," + users[i].secondName + ".");
        }
    }

    public static void sort() {
        User[] users = UsersUtil.getUsers();
        for (int i = users.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (users[j].id < users[j + 1].id) {
                    User u = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = u;


                }

            }
            System.out.print(users[i].name + " ");
        }
    }
}
