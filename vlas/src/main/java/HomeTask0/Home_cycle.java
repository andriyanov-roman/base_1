package HomeTask0;

/**
 * Created by vlas on 03.12.2014.
 */
public class Home_cycle {
    public static void main(String[] Args) {
        int a = 1000;
        System.out.println("Task 1");
        while (a < 9999) {
            System.out.print(" " + a);
            a = a + 3;
        }
        a = 1;
        System.out.println(" ");
        System.out.println("Task 2");
        int number = 0;
        while (number < 55) {
            System.out.print(" " + a);
            a = a + 2;
            number++;
        }
        System.out.println(" ");
        System.out.println("Task 3");
        a = 90;
        while (a >= 0) {
            System.out.print(" " + a);
            a = a - 5;
        }
        System.out.println(" ");
        System.out.println("Task 4");
        a = 2;
        number = 0;
        while (number < 20) {
            System.out.print(" " + a);
            a = a * 2;
            number++;
        }
        System.out.println("");
        System.out.println("Task 5: n-Factorial");
        int n = 8;// целевое значение n-Факториал
        int x = 1;
        a = 1;
        while (a < (n+1)) {
            x = a * x;
            a++;
        }
        System.out.println(x);

        System.out.println("Task 6: 20 of Fibonacci");
        n=0;// counter
        int x1=0;// store for first number of Fibonacci
        int x2=1 ;// store for second number of Fibonacci
        a =0; // output store
        while (n<20){
            System.out.print(" " +a);
            a=x1+x2;
            x2=x1;
            x1=a;
            n++;
        }
    }
}
