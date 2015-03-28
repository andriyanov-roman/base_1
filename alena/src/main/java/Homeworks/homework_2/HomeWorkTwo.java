package Homeworks.homework_2;

/**
 * Created by lbondarenko on 02.12.2014.
 */
public class HomeWorkTwo {
    public static void main (String[] args) {
        int a1 = 30;
        int a2 = 15;
        int a3 = 22;


        // первое задание
        // первый вариант
        if (a1 < a2 ) {
            System.out.println("a2 is bigger a1");
        }  else  if (a1 > a3) {
            System.out.println("a1 is the biggest");
        }

        // второй вариант
        if ((a1 > a2 ) & (a1 > a3)) {
            System.out.println("a1 is max");
        }

        int b1 = 15;
        int b2 = 33;
        int b3 = 55;
        int b4 = 44;

        // второе задание

        if (b1 > b2 & b1 > b3 & b1 > b4) {
            System.out.println("b1 is max");
        } if (b2 > b1 & b2 > b3 & b2 > b4) {
            System.out.println("b2 is max");
        } if (b3 > b1 & b3 > b2 & b3 > b4) {
            System.out.println("b3 is max");
        } if (b4 > b3 & b4 > b1 & b4 > b2) {
            System.out.println("b4 is max");
        }

        if (b1 > b2 & b1 > b4) {
            System.out.println("b1 is the second after b3");
        } if (b2 > b1 & b2 > b4) {
            System.out.println("b2 is the second after b3");
        } if (b4 > b1 & b4 > b2) {
            System.out.println("b4 is the second after b3");
        }

     }

}
