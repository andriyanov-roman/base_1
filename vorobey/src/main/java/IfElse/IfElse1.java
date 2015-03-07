package IfElse;


public class IfElse1 {
    public static void main(String[] args) {
        int a = 9, b = 41, c = 5;
        if (a > b && a > c)
            System.out.println(" a :" + a);
        else if (a < b && a > c)
            System.out.println(" b :" + b);
        else
            System.out.println(" c :" + c);
    }
}
