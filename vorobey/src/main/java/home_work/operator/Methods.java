package home_work.operator;


import java.util.Scanner;

public class Methods {
    public static void launch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Для нахождения максимального числа из трех введенных,нажмите 1");
        System.out.println("2.Для перевода введенного числа в двоичный код,нажмите 2");
        System.out.println("3.Для нахождения максимального числа из 4-х,нажмите 3");
        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":
                    max();
                    break;
                case "2":
                    transfer();
                    break;
                case "3":
                    maxOfFour();

                    break;
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("No such case!");

            }
        }

    }

    public static void max() {
        System.out.println("Введите последовательно три целых числа:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a > b && a > c)
            System.out.println("a :" + a);
        else if (a < b && a > c)
            System.out.println("b :" + b);
        else
            System.out.println("c :" + c);

    }

    public static void transfer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введиет целое положиельное число для перевод в двоичный код: ");
        int a = sc.nextInt();
        String y = "";
        for (; a > 0; ) {
            if (a % 2 != 0) {
                y += "1";
            } else {
                y += "0";
            }
            a = a / 2;
        }
        StringBuffer x = new StringBuffer(y);
        x = (new StringBuffer(y)).reverse();
        System.out.println(x);

    }

    public static void maxOfFour() {
        int max = 0, maxFirst = 0, maxFinal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите последовательно четыре целых числа: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        if (a > b)
            max = a;
        else
            max = b;
        if (c > d)
            maxFirst = c;
        else
            maxFirst = d;
        if (max > maxFirst)
            maxFinal = max;
        else
            maxFinal = maxFirst;
        System.out.println("Максимальное число: " + maxFinal);

    }


}
