package homework.homework1;

/**
 * Created by R-Tem on 10.03.2015.
 */
public class CheckLogin {
    public static void checkLogin(){
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].login.equals(users[i].name)/*||users[i].login.equals(users[i].secondName)*/){
                int n=i+1;
                System.out.println("Users "+n+" has the same login and name");
            }
            if (users[i].login.equals(users[i].secondName)){
                int n=i+1;
                System.out.println("Users "+n+" has the same login and second name");
            }
        }
    }
}
