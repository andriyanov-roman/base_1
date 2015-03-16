package Homeworks;

/**
 * Created by lbondarenko on 03.12.2014.
 */
public class HWFour {
    public static void main(String[] args) {
        int m1 = 997; // первое задание
        while (m1 <= 9997) {
            m1 = m1 + 3;
            System.out.print(m1);
        }

        int m2 = -1; // второе задание
        while (m2 <= 107) {
            m2 = m2 + 2;

            System.out.println("");

            System.out.print(m2);
        }

        int m3 = 90; // третье задание
        System.out.println();
        System.out.println(m3);

        while (m3 > 0) {
            m3 = m3 - 5;
            System.out.print(m3);
        }


        int m4 = 1; // четвертое задание
        int m5 = 0;

        while (m5 <= 20) {
            m4 = m4 * 2;
            m5++;
            System.out.println();

            System.out.print(m4);
        }
        System.out.println("");

        int n = 1; // пятое задание
        int r = 0;


        while (r <= 15) {
            r++;
            n++;
            n *= r;
        }

        System.out.print(n);

        System.out.println("");

        int a = 1;
        int b = 1;//шестое задание
        int c = 0;
        int x = 0;

        System.out.println(a);
        System.out.println(b);


        while (c < 20) {

            c++;
            x = a + b;
            b = a;
            a = x;

            System.out.println(x);
        }

        int r1 = 50; // седьмое задание
        int r2 = 1;
        int r3 = 0;
        while (r2 < 50) {
            if (r2 > 0) {
                r2++;
                r3 = r1 % r2;
                if (r3 == 0) {

                    System.out.println(r2);
                }
            }


        }


        int c1 = 60;        //восьмое задание
        int c2 = 120;
        int c12 = 1;
        int p1 = 0;
        int p2 = 0;


        while (c12 <= 60) {
            c12++;
            p1 = c1 % c12;
            if (p1 == 0) {
                p2 = c2 % c12;
                if (p2 == 0) {
                    System.out.println(c12);
                }
            }


        }




    }
}