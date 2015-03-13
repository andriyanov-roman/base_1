package lessons.lesson1;


public class UsersUtil {
    public static User[] getUsers() {
        User u1 = new User();
        u1.age = 30;
        u1.id = 1L;
        u1.login = "Artem";
        u1.password = "pass";
        u1.name = "Artem";
        u1.secondName = "Samoxa";

        User u2 = new User();
        u2.age = 25;
        u2.id = 2L;
        u2.login = "IhorSuper";
        u2.password = "pass123";
        u2.name = "Ihor";
        u2.secondName = "ihor";
        return new User[]{u1, u2};
    }
}
