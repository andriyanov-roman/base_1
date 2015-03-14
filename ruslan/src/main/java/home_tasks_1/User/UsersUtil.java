package home_tasks_1.User;


public class UsersUtil {
    public static User[] getUsers() {
        User u1 = new User();
        u1.age = 30;
        u1.id = 198514578L;
        u1.login = "Jack";
        u1.password = "pass";
        u1.name = "Jack";
        u1.secondName = "Vorobey";

        User u2 = new User();
        u2.age = 28;
        u2.id = 156879878L;
        u2.login = "Thor";
        u2.password = "pass123";
        u2.name = "Jack";
        u2.secondName = "Vorobey";

        User u3 = new User();
        u3.age = 25;
        u3.id = 178965889L;
        u3.login = "Jordan";
        u3.password = "pass1234";
        u3.name = "Michael";
        u3.secondName = "Jordan";

        User u4 = new User();
        u4.age = 36;
        u4.id = 156887268L;
        u4.login = "Slamdunk";
        u4.password = "pass12345";
        u4.name = "Kobe";
        u4.secondName = "Bryant";

        return new User[]{u1, u2, u3, u4};


    }
}
