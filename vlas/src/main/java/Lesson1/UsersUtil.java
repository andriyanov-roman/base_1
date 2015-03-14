package Lesson1;



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
        u2.password = "pass1237";
        u2.name = "Ihor";
        u2.secondName = "ihor";

        User u3 = new User();
        u3.age = 32;
        u3.id = 3L;
        u3.login = "Valar";
        u3.password = "pass1223";
        u3.name = "Valar";
        u3.secondName = "Val";

        User u4 = new User();
        u4.age = 27;
        u4.id = 4L;
        u4.login = "Barsik";
        u4.password = "pass13243";
        u4.name = "Bars";
        u4.secondName = "Barsikovich";

        User u5 = new User();
        u5.age = 28;
        u5.id = 5L;
        u5.login = "Bifac";
        u5.password = "pass12439";
        u5.name = "Roma";
        u5.secondName = "Andriyanov";


        User[] users = new User[5];
        users[0] = u1;
        users[1] = u2;
        users[2] = u3;
        users[3] = u4;
        users[4] = u5;
        //return  users;
        return new User[]{u1, u2, u3, u4, u5};
    }



}
