package lesson_1;

/**
 * Created by user on 09.03.2015.
 */
public class UsersUtil {
    public static User[] getUsers() {
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
        u3.age = 34;
        u3.id = 3L;
        u3.login = "Zhora";
        u3.password = "pass45";
        u3.name = "Zhora";
        u3.secondName = "Woker";

        User u4 = new User();
        u4.age = 75;
        u4.id = 4L;
        u4.login = "Santiago";
        u4.password = "password";
        u4.name = "Jack";
        u4.secondName = "Smith";

        User[] users = new User[4];
        users[0] = u1;
        users[1] = u2;
        users[2] = u3;
        users[3] = u4;

        return users;// return new User [] {u1,u2};
    }
}
