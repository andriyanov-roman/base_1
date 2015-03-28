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

}

