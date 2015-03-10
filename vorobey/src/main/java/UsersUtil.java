/**
 * Created by user on 09.03.2015.
 */
public class UsersUtil {
    public static User[] getUsers() {
        User u1 = new User();
        u1.age = 30;
        u1.id = 1L;
        u1.passsword = "pass";
        u1.login = "Jack";
        u1.name = "Jack";
        u1.secondName = "Vorobey";


        User u2 = new User();
        u2.age = 25;
        u2.id = 2L;
        u2.passsword = "password";
        u2.login = "Matveu";
        u2.name = "Ihor";
        u2.secondName = "Matveychusk";

        User u3 = new User();
        u3.age = 23;
        u3.id = 3L;
        u3.passsword = "password1";
        u3.login = "Vlad";
        u3.name = "Vlad";
        u3.secondName = "Popov";

        User u4 = new User();
        u4.age = 35;
        u4.id = 4L;
        u4.passsword = "password2";
        u4.login = "someMan";
        u4.name = "Alex";
        u4.secondName = "Alex";

        User u5 = new User();
        u5.age = 25;
        u5.id = 5L;
        u5.passsword = "password";
        u5.login = "Jack";
        u5.name = "Jack";
        u5.secondName = "Spirrow";


        return new User[]{u1, u2, u3, u4, u5};
    }
}
