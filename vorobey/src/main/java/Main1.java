/**
 * Created by user on 09.03.2015.
 */
public class Main1 {
    public static void main(String[] args) {
        getUsers();

    }

    public static User[] getUsers() {
        User u1 = new User();
        u1.age = 30;
        u1.id = 1L;
        u1.passsword = "pass";
        u1.login = "Vorobey";
        u1.name = "Jack";
        u1.secondName = "Vorobey";


        User u2 = new User();
        u2.age = 25;
        u2.id = 2L;
        u2.passsword = "password";
        u2.login = "Matveu";
        u2.name = "Ihor";
        u2.secondName = "Matveychusk";

        User[] users = new User[12];
        users[0] = u1;
        users[1] = u1;
        return users;


    }
}
