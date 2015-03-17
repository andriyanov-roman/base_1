package homework.homework2;

/**
 * Created by R-Tem on 10.03.2015.
 */
public class UsersUtil {
    public static User[] getUsers() {
        User u1 = new User();
        u1.age = 17;
        u1.id = 1L;
        u1.login = "Artem";
        u1.password = "pass";
        u1.name = "Artem";
        u1.secondName = "Samoxa";

        User u2 = new User();
        u2.age = 28;
        u2.id = -2L;
        u2.login = "Petrov";
        u2.password = "pass123";
        u2.name = "Petya";
        u2.secondName = "Petrov";

        User u3 = new User();
        u3.age = 19;
        u3.id = 9L;
        u3.login = "Sasha";
        u3.password = "pass123";
        u3.name = "Sasha";
        u3.secondName = "Sasha";

        User u4 = new User();
        u4.age = 31;
        u4.id = 21L;
        u4.login = "pricol";
        u4.password = "pass123";
        u4.name = "Tonya";
        u4.secondName = "Sidorova";

        User u5 = new User();
        u5.age = 42;
        u5.id = 32L;
        u5.login = "Larissson";
        u5.password = "pass123";
        u5.name = "Larisa";
        u5.secondName = "Mix";

        User u6 = new User();
        u6.age = 16;
        u6.id = 5L;
        u6.login = "Eagle";
        u6.password = "pass123";
        u6.name = "Sasha";
        u6.secondName = "Sasha";

        User u7 = new User();
        u7.age = 25;
        u7.id = 27L;
        u7.login = "Vasya";
        u7.password = "pass123";
        u7.name = "Vasiliy";
        u7.secondName = "Sidorov";

        User u8 = new User();
        u8.age = 16;
        u8.id = 5L;
        u8.login = "Eagle";
        u8.password = "pass123";
        u8.name = "Sasha";
        u8.secondName = "Sasha";
        return new User[]{u1, u2, u3, u4, u5, u6, u7, u8};
    }
}
