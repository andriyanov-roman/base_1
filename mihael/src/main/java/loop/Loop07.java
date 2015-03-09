package loop;

/**
 * Created by Администратор on 09.03.2015.
 */
public class Loop07 {
    public static void main (String[] args){
        int number = 20;
        int x =1 ;
        while (x <=number) {
            if(mod(number,x)){
                System.out.println(x);
            }
            x++;
        }
    }
    public static boolean mod( int n, int del) {
        if (n%del == 0) {
            return true;
        }else
        {
            return false;
        }
    }
}
