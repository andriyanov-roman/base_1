package home_works.User;

import java.util.ArrayList;


public class UserUtil {
    public static ArrayList<User> getUsers(){
        User u1 = new User(30,198514578L, "Jack","Vorobey","password","Vorobey");
        User u2 = new User(30,198514578L, "Jack","Jack","password","Cris");
        User u3 = new User(30,199874578L, "Russ","Vankevich","password","Bryant");
        User u4 = new User(36,156887268L, "Slamdunk","Jordan","password","Bryant");


        ArrayList<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        return users;
    }
}
