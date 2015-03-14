package loop;

/**
 * Created by Администратор on 09.03.2015.
 */
public class Loop09 {
    public static int numOfLucky = 0;
    public static void main (String[] args){
        int x = 1;
        int last = 999999;

        while (x <=last) {
            if(isLucky(x)){
                numOfLucky++;
                //System.out.println(numOfLucky + " " +x);
            }
            x++;
        }
    }
    public static boolean isLucky( int n) {
        //System.out.println(n);
        int[] a= new int[6];
        int k;
        if (n > 100000) {
            k= n -100000;
            a[0] = (n-k)/100000;
        } else a[0] = 0;
        if (n > 10000) {
            n= n -10000;
            a[1] = n/10000;
        }else a[1] = 0;
        if (n > 1000) {
            n= n -1000;
            a[2] = n/1000;
        } else a[2] = 0;
        if (n > 100) {
            n= n -100;
            a[3] = n/100;
        }else a[3] = 0;
        if (n > 10) {
            n= n -10;
            a[4] = n/10;
        }else a[4] = 0;
        if (n > 0) {
            a[5] = n;
        }else a[5] = 0;

        //System.out.println(numOfLucky + " " + n);
        for (int nu: a)	{

            System.out.print(nu);}
        System.out.print("\n");
        if ((a[0] + a[1] + a[2]) ==(a[3] + a[4] + a[5])) {

            return true;
        }
        else return false;
    }

}
