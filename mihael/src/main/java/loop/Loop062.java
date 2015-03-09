package loop;

/**
 * Created by Администратор on 09.03.2015.
 */
public class Loop062 {
    public static void main (String[] args){
        int number = 20;
        int x = 1;
        while (x<=number) {
            System.out.println(x + " " + fibonachi(x));
            x++;
        }

    }
    public static int fibonachi(int n ) {
        if (n ==2 || n ==1) {
            return 1;
        }else
        {
            return fibonachi(n-1) + fibonachi(n-2);
        }
    }
}
