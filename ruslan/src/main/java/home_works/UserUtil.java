package home_works;

import java.util.ArrayList;

/**
 * Created by user on 23.03.2015.
 */
public class UserUtil {
    public static ArrayList<User> getUsers(){
        User u1 = new User(30,198514578L, "Jack","pass","Jack","Vorobey");
        User u2 = new User(30,198514578L, "Jack","pass321","Jack","Cris");
        User u3 = new User(30,199874578L, "Russ","pass42342","Jack","Vorobey");
        User u4 = new User(36,156887268L, "Slamdunk","pass12345","Kobe","Bryant");


        ArrayList<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        return users;
    }
}
