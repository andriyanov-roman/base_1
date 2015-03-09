package hometask1;

/**
 * Created by user on 09.03.2015.
 */
public class Main {
    public static void main(String[] args) {
        showUsers();
    }

    public static void showUsers() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.print(users[i].name+" "+users[i].secondName);
        }
        System.out.println();
    }
}
