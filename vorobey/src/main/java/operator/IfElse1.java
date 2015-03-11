package operator;


import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {
        System.out.println("Введите последовательно три целых числа:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a > b && a > c)
            System.out.println(" a :" + a);
        else if (a < b && a > c)
            System.out.println(" b :" + b);
        else
            System.out.println(" c :" + c);
    }
}
