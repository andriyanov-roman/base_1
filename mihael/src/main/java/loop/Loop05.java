package loop;

/**
 * Created by Администратор on 09.03.2015.
 */
public class Loop05 {
    public static void main (String[] args){
        int x = 4;
        int fact = 1;
        if (x==0) {fact = 1;}
        else {
            while (x>0) {
                fact *= x;
                x--;
            }
        }
        System.out.println(fact);
    }
}
