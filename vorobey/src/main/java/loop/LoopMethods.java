package loop;


import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class LoopMethods {
    public static void LaunchLoop() {
        System.out.println("1.Если хотите увидеть последовательность всех четырехзначных чисел 1000,1003,1006 и т.д.,нажмите 1");
        System.out.println("2.Если хотите увидеть первых 55 элементов  последовательности 1 3 5 7 и т.д.,нажмите 2");
        System.out.println("3.Если хотите увидеть последовательность всех неотрицательных чисел 90,85,80 и т.д.,нажмите 3");
        System.out.println("4.Если хотите увидеть первые 20 элементов последовательности  2,4,8 и т.д.,нажмите 4");
        System.out.println("5.Если хотите вычислить Факториал,например,числа 5,нажмите '5'");
        System.out.println("6.Чтобы вывести последовательность первых 20 чисел Фибаначчи,нажмите '6'");
        System.out.println("7.Чтобы вывести количество счастливых билетов(от 1 до 999999),нажмите '7'");
        System.out.println("8.Чтобы вывести количество совпадений цифр часов(например,02:20),нажмите '8'");
        System.out.println("9.Чтобы вывести количество номерных знаков от 1 до 999999,содержащих '13',нажмите '9'");
        System.out.println("10.Чтобы вывести общие целые делители двух чисел,например 20 и 90,нажмите '10'");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":
                    loop1000();
                    break;
                case "2":
                    loopFirst55();
                    break;
                case "3":
                    loopAfter5();
                    break;
                case "4":
                    loopMultiplicationToNext();
                    break;
                case "5":
                    loopFactorial();
                    break;
                case "6":
                    loopFibana44i();
                    break;
                case "7":
                    loopHappyTicket();
                    break;
                case "8":
                    loopClock();
                    break;
                case "9":
                    loopInstanceOf13();
                    break;
                case "10":
                    loopDel();
                    break;
                default:
                    System.out.println("No such case!!");


            }

        }
    }


    public static void loop1000() {
        for (int i = 1000; i < 10000; i += 3) {
            System.out.print(" " + i);
        }


    }

    public static void loopFirst55() {
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
        System.out.println(count);
    }

    public static void loopHappyTicket() {
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

    public static void loopDel() {
        int i, k;


        int a = 20;
        int b = 90;
        for (i = 1; i < 10; i++) {
            if (a % i == 0 && b % i == 0 && a % i == b % i)
                System.out.print(i + ", ");
        }

    }


}


