package homeWork1;

/**
 * Created by Kirill on 12.03.2015.
 */
public class UserUtil {
    public static User[] getUsers() {
        User u1 = new User("Sergey",1L,"Antilopov","123qwert","SergeyDeath",30);
        User u2 = new User("Igor",5L,"Sergeev","123qwert","IgorBIG",40);
        User u3 = new User("Yan",7L,"ALien","123qwert","NaN1",43);
        User u4 = new User("Linda",21L,"Kapitova","123qwert","LEGOBOY",23);





        return new User[]{u1, u2, u3, u4};
}
    public static void showIdUsers() {
        User[] users = UserUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getName() + "have id" + users[i].getId());
        }
    }
    public static void findMatches() {
        User[] users = UserUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].getLogin().equals(users[i].getName()))
                System.out.println("User " + users[i] + " have matched login with name");
            for (int c = 0; c < users.length; c++) {
                if (users[c].getLogin().equals(users[c].getSecondName()))
                    System.out.println("User" + users[c] + " have matched login with second name");
            }
        }

    }
    public static void showUsers() {
        User[] users = UserUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.print(users[i].getName() + " " + users[i].getSecondName());
        }
        System.out.println();
    }
}

