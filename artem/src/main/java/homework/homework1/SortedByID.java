package homework.homework1;

import java.util.*;

public class SortedByID {
    public static void sortedById(){
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length - i - 1; j++) {
                if (users[j].id > users[j + 1].id) {
                    User t = users[j + 1];
                    users[j + 1] = users[j];
                    users[j] = t;
                }
            }
        }

        /*User[] usersSorted = UsersUtil.getUsers();
        long [][] arr = new long [users.length][2];
        long [] tmp = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            arr[i][0] = users[i].id;
            tmp[i] = arr [i][0];
            //System.out.print("("+i+")"+tmp[i]+"; ");//порядковый номер массива можно сразу редактировать "[i-1]"
        }
        Arrays.sort(tmp);
        for (int i = 0; i < users.length; i++) {
            arr[i][1] = tmp[i];
        }
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length; j++) {
                if(arr[i][0] == arr[j][1]) usersSorted[i] = users[j];
            }
            System.out.print("("+i+")"+users[i].id+", "+usersSorted[i].id+"; ");
        }*/
    }
    /*public static User[] sortedbyid(){
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            User u[i] = user;
        }

        return new UserSorted[]{u1, u2, u3, u4, u5, u6, u7};
    }*/
}
