package homework.homework1;

/**
 * Created by R-Tem on 10.03.2015.
 */
public class Show {
    public static void showUsers() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.print(users[i].name + " " + users[i].secondName+"\n");
        }
        System.out.println();
    }
}
