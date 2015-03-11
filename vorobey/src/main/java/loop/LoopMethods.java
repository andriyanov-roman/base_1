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

    public static void loopAfter5() {
        for (int i = 90; i >= 0; i -= 5) {

            System.out.print(" " + i);
        }
    }

    public static void loopFibana44i() {
        int a = 2, b = 3, total;

        for (int i = 0; i < 20; i++) {
            total = a + b;
            a = b;
            b = total;
            System.out.print("  " + total);
        }
    }

    public static void loopClock() {
        int i, j, count = 0;
        for (i = 0; i < 24; i++) {
            for (j = 0; j < 60; j++) {
                if ((i / 10) == (j % 10) && (i % 10) == (j / 10))
                    count++;// Количество совпадений
            }
        }
    }

    public static void loppHappyTicket() {
        int i, count = 0, sumLeft = 0, sumRight = 0;
        for (i = 000001; i < 1000000; i++) {
            sumLeft = ((i / 100000) + ((i / 10000) % 10)) + ((i / 1000) % 10);
            sumRight = ((i % 10) + ((i / 10) % 10) + ((i / 100) % 10));
            if (sumLeft == sumRight)
                count++;
        }
        System.out.println("Количество счастливых билетов: " + count);
    }

    public static void loopInstanceOf13() {
        int i, count = 0;
        for (i = 0; i < 1000000; i++) {
            String s = String.valueOf(i);
            if (s.indexOf("13") != -1) {
                count++;
            }

        }
        System.out.println("Количество чисел ,включающих 13: " + count);
    }


}


