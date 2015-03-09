/**
 * Created by user on 09.03.2015.
 */
public class Main1 {
    public static void main(String[] args) {
        showUser();

    }

    public static void showUser() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.print(users[i].name + "  " + users[i].secondName);
        }
    }

}



