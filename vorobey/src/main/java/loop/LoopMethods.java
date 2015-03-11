package loop;


import java.util.Scanner;

public class LoopMethods {
    public static void loop1000() {
        for (int i = 1000; i < 10000; i += 3) {
            System.out.print(" " + i);
        }


    }

    public static void loopReverse() {
        int k = -1;
        for (int i = 0; i < 55; i++) {
            k += 2;
            System.out.print(" " + k);
        }
    }

    public static void loopMultiplicationToNext() {
        int k = 1;
        for (int i = 0; i < 20; i++) {
            k *= 2;
            System.out.print(" " + k);

        }
    }

    public static void loopFactorial() {
        int a = 5;//example
        System.out.println("Факториал числа,например '5',равен: ");
        int result = 1;
        for (int i = 2; i <= a; i++)
            result *= i;
        System.out.println(result);
        if (a == 0 || a == 1)
            System.out.println(result);

        System.out.println("Bye!");
    }
}


