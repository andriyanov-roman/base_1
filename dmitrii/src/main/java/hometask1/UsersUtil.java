package hometask1;

/**
 * Created by user on 09.03.2015.
 */
public class UsersUtil {
    public static User[] getUsers () {
        User u1 = new User();
        u1.age = 30;
        u1.id = 1L;
        u1.login = "Vorobey";
        u1.password = "pass";
        u1.name = "Jack";
        u1.secondName = "Vorobey";

        User u2 = new User();
        u2.age = 25;
        u2.id = 2L;
        u2.login = "IhorSuper";
        u2.password = "pass123";
        u2.name = "Ihor";
        u2.secondName = "ihor";

        User u3 = new User();
        u3.age = 65;
        u3.id = 3L;
        u3.login = "Ivan";
        u3.password = "pass432";
        u3.name = "Ivan";
        u3.secondName = "Karman";

        User u4 = new User();
        u4.age = 32;
        u4.id = 4L;
        u4.login = "va2017";
        u4.password = "pass777";
        u4.name = "Vasyl";
        u4.secondName = "Petrov";

        //User[] users = new User[2];
        //users[0]= u1;
        //users[1] = u2;
        //return users;

        return new User[] {u1, u2,u3,u4};
    }
}
