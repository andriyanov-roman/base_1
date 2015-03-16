package Homeworks.homework_1;

/**
 * Created by MacBook on 16.03.15.
 */
public class UsersUtil {
    public static User[] getUsers() {
        User u1 = new User (0006, "Vasya", "Vasiliev", "vasyok", "vssss", 22);
        User u2 = new User (0002, "Vitalik", "Vitalich", "vetal", "vvvv3", 18);
        User u3 = new User (0003, "Volodymy", "Volodymyr", "Volodymyr", "oooo3", 33);
        User u4 = new User (0005, "Olga", "Olgina", "lyolya", "lyolik5", 25);
        User u5 = new User (0007, "Vitalik", "Vitalich", "vetal", "vv663", 30);

        return new User[] {u1, u2, u3, u4, u5};
    }
}
