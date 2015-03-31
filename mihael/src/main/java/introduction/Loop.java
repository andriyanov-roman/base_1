package introduction;

/**
 * Created by Администратор on 01.04.2015.
 */
public class Loop {
    public static int numOfLucky = 0;

    public static void main (String[] args){
        loop3();
    }

    //1.	Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
    public static void loop3n () {
            int x = 1000;
            while (x<10000) {
                System.out.println(x+" ");
                x +=3;
            }

    }

    //2.	Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
    public static void loop2(){
        int x = 1;
        int num = 0;
        while (x<10000) {
            num++;
            System.out.println(x+" ");
            if (num >=55) break;
            x +=2;
        }
    }

    //3.	Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
    public static void loop3(){
        int x = 90;
        while (x>=0) {
            System.out.println(x+" ");
            x -=5;
        }
    }

    public static void loop4(){
        int x = 2;
        int num = 0;
        while (x>=0) {
            num++;
            System.out.println(num + " "+x+" ");
            if (num >=20) break;
            x *=2;
        }
    }

    public static void loop5(){
        int x = 4;
        int fact = 1;
        if (x==0) {fact = 1;}
        else {
            while (x>0) {
                fact *= x;
                x--;
            }
        }
        System.out.println(fact);
    }

    public static void loop6(){
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

    public static void loop62(){
        int number = 20;
        int x = 1;
        while (x<=number) {
            System.out.println(x + " " + fibonachi(x));
            x++;
        }
    }

    public static void loop7(){
        int number = 20;
        int x =1 ;
        while (x <=number) {
            if(mod(number,x)){
                System.out.println(x);
            }
            x++;
        }
    }

    public static void loop8(){
        int number1 = 50;
        int number2 = 550;
        int number;
        number = min(number1,number2);
        int x =1 ;
        while (x <=number) {
            if(mod(number1,x) && mod(number2,x)){
                System.out.println(x);
            }
            x++;
        }
    }

    public static void loop9(){
        int x = 1;
        int last = 999999;

        while (x <=last) {
            if(isLucky(x)){
                numOfLucky++;
                //System.out.println(numOfLucky + " " +x);
            }
            x++;
        }
    }

    public static int fibonachi(int n ) {
        if (n ==2 || n ==1) {
            return 1;
        }else
        {
            return fibonachi(n-1) + fibonachi(n-2);
        }
    }

    public static boolean mod( int n, int del) {
        if (n%del == 0) {
            return true;
        }else
        {
            return false;
        }
    }

    public static int min( int num1, int num2) {
        if (num1 > num2) {
            return num2;
        }else
        {
            return num1;
        }
    }

    public static boolean isLucky( int n) {
        //System.out.println(n);
        int[] a= new int[6];
        int k;
        if (n > 100000) {
            k= n -100000;
            a[0] = (n-k)/100000;
        } else a[0] = 0;
        if (n > 10000) {
            n= n -10000;
            a[1] = n/10000;
        }else a[1] = 0;
        if (n > 1000) {
            n= n -1000;
            a[2] = n/1000;
        } else a[2] = 0;
        if (n > 100) {
            n= n -100;
            a[3] = n/100;
        }else a[3] = 0;
        if (n > 10) {
            n= n -10;
            a[4] = n/10;
        }else a[4] = 0;
        if (n > 0) {
            a[5] = n;
        }else a[5] = 0;

        //System.out.println(numOfLucky + " " + n);
        for (int nu: a)	{

            System.out.print(nu);}
        System.out.print("\n");
        if ((a[0] + a[1] + a[2]) ==(a[3] + a[4] + a[5])) {

            return true;
        }
        else return false;
    }
}
