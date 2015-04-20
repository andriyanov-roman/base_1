package hometasks.hometask1;

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
        u2.login = "Ihor";
        u2.password = "pass123";
        u2.name = "Ihor";
        u2.secondName = "ihor";


        User u3 = new User();
        u3.age = 25;
        u3.id = 3L;
        u3.login = "Mihail";
        u3.password = "pass456";
        u3.name = "Mihailo";
        u3.secondName = "Mihail";

        User u4 = new User();
        u4.age = 18;
        u4.id = 4L;
        u4.login = "Alisa";
        u4.password = "pass222";
        u4.name = "Alisa";
        u4.secondName = "Alisa";

        User u5 = new User();
        u5.age = 18;
        u5.id = 5L;
        u5.login = "Alisa";
        u5.password = "pass222";
        u5.name = "Alisa";
        u5.secondName = "Alisa";

        User u6 = new User();
        u6.age = 18;
        u6.id = 6L;
        u6.login = "Alisa";
        u6.password = "pass222";
        u6.name = "Alisa";
        u6.secondName = "Alisa";

        User u7 = new User();
        u7.age = 25;
        u7.id = 7L;
        u7.login = "Mihail";
        u7.password = "pass456";
        u7.name = "Mihailo";
        u7.secondName = "Mihail";

        User[] users = new User[2];
        users[0] = u1;
        users[1] = u2;
        //return users;
        return  new User[]{u1,u2,u3,u4,u5,u6,u7};

    }

}
