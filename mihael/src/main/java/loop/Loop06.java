package loop;

/**
 * Created by Администратор on 09.03.2015.
 */
public class Loop06 {

    public static void main (String[] args){
        int number = 20;
        int fib1 = 1;
        int fib2 = 1;
        int fib;
        if (number == 1) {
            System.out.println("1");
        }else
        if (number ==2) {
            System.out.println("1 1 ");
            System.out.println("2 1 ");
        }else
        {
            System.out.println("1 1 ");
            System.out.println("2 1 ");
            int x = 3;
            while (x<=number) {
                fib = fib2 + fib1;
                System.out.println(x+" "+fib+ " ");
                fib2 = fib1;
                fib1 = fib;
                x++;
            }

        }
    }
}
