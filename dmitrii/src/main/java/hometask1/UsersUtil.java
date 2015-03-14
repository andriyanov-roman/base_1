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
        u2.secondName = "ihorenko";

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

        User u5 = new User();
        u5.age = 27;
        u5.id = 5L;
        u5.login = "Karman";
        u5.password = "pass666";
        u5.name = "Ivan";
        u5.secondName = "Karman";

        User u6 = new User();
        u6.age = 27;
        u6.id = 6L;
        u6.login = "Ivan27";
        u6.password = "pass666";
        u6.name = "Ivan";
        u6.secondName = "Karman";
        
        User u7 = new User();
        u7.age = 27;
        u7.id = 7L;
        u7.login = "superAdmin";
        u7.password = "pass777";
        u7.name = "Ivan";
        u7.secondName = "Karman";

        User u8 = new User();
        u8.age = 85;
        u8.id = 8L;
        u8.login = "IhorSuper";
        u8.password = "pass183";
        u8.name = "Ihor";
        u8.secondName = "ihorenko";


        //User[] users = new User[2];
        //users[0]= u1;
        //users[1] = u2;
        //return  users;

        return new User[] {u1,u2,u3,u4,u5,u6,u7,u8};
    }
}
