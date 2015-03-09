package loop;

/**
 * Created by Администратор on 09.03.2015.
 */
public class Loop08 {
    public static void main (String[] args){
        int number1 = 50;
        int number2 = 550;
        int number;
        number = min(number1,number2);
        int x =1 ;
        while (x <=number) {
            if(mod(number1,x) && mod(number2,x)){
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
    public static int min( int num1, int num2) {
        if (num1 > num2) {
            return num2;
        }else
        {
            return num1;
        }
    }
}
