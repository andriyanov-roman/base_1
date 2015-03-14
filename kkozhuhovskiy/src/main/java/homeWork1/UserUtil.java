package homeWork1;

/**
 * Created by Kirill on 12.03.2015.
 */
public class UserUtil {
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
        u3.age = 27;
        u3.id = 3L;
        u3.password = "string123";
        u3.name = "Testing";
        u3.secondName = "Barakyda";

        User u4 = new User();
        u4.age = 37;
        u4.id = 3L;
        u4.password = "user123";
        u4.name = "Andy" ;
        u4.secondName = "Andy" ;

        return new User[]{u1, u2, u3, u4};
}
}

