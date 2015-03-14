package homework.homework1;

/**
 * Created by R-Tem on 10.03.2015.
 */
public class CheckSame {
    public static void checkSame(){
        User[] users = UsersUtil.getUsers();
        //int n;
        for (int i = 1; i <= users.length; i++) {
            for (int n = i+1; n < users.length; n++){
                if (users[i].name.equals(users[n].name)&&users[i].secondName.equals(users[n].secondName)){
                    int q = i+1;
                    int w = n+1;
                    System.out.println("Users "+q+" and "+w+" have the same names and second names");
                }
            }
        }
    }
}
