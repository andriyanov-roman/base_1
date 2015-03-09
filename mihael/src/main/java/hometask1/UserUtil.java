package hometask1;

/**
 * Created by user on 09.03.2015.
 */
public class UserUtil {

    public static User[] getUsers (){

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
        u3.age = 25;
        u3.id = 2L;
        u3.login = "Mihail";
        u3.password = "pass456";
        u3.name = "Mihailo";
        u3.secondName = "Mihail";



        User[] users = new User[2];
        users[0] = u1;
        users[1] = u2;
        //return users;
        return  new User[]{u1,u2};

    }

}
