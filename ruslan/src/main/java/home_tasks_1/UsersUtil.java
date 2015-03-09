package home_tasks_1;


public class UsersUtil {
    public static User[] getUsers() {
        User u1 = new User();
        u1.age = 30;
        u1.id = 1L;
        u1.login = "vorobey";
        u1.password = "pass";
        u1.name = "Jack";
        u1.secondName = "Vorobey";

        User u2 = new User();
        u2.age = 28;
        u2.id = 2L;
        u2.login = "SuperPupey";
        u2.password = "pass123";
        u2.name = "Ihor";
        u2.secondName = "Ihor";

        return new User[]{u1, u2};


    }
}
