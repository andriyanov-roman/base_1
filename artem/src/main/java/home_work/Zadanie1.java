package home_work; /**
 * Created by R-Tem on 04.03.2015.
 */

import java.util.Scanner;
public class Zadanie1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); //создаем переменную in класса Scanner
        boolean go = true; //объявляем переменную логического типа и присваиваем ей значение
        while (go) { //цикл будет повторяться пока go == true
            go = false;
            //начало блока контролирующего введенное число
            System.out.print("Здравствуйте!\nВведите чётное положительное число, отличное от 0:\t");
            int chislo = in.nextInt(); //объявляем переменную типа int и присваиваем ей зачитанное значение; диапазон (-2147483648..2147483647)
            int proverka=Math.abs(chislo)%2; //объявляем переменную, присваиваем ей остаток деления i, взятого по модулю, на 2;
                                        // почему нельзя использовать тип byte если операция всеравно возвращает 0 или 1?
            while ((chislo>=0)&&(proverka==1)||(chislo<=0)&&(proverka==0)||(chislo<=0)&&(proverka==1)) {
                System.out.print("Неверное значение!\nЕще раз введите чётное положительное число, отличное от 0,\n(например 2,4,..,124):\t");
                chislo = in.nextInt();
                proverka=Math.abs(chislo)%2; //присваиваем ей остаток деления i, взятого по модулю, на 2;
            }   //конец блока контролирующего введенное число
            //начало блока создающего массив случайных чисел и определяющего сумму модулей
                    /*Random r = new Random();
                    int[] arr = new int[i];
                    for(int a = 0; a < arr.length; a++){
                       arr[a] = r.nextInt();
                       System.out.println(arr[i]);
                    }*/
            int[] arr1 = new int[chislo/2];
            int[] arr2 = new int[chislo/2];
            for(int a = 0; a < arr1.length; a++){
                arr1[a] = (int)(Math.random()*11) - 5; //наполняем массив arr1 псевдослучайными целыми числами из [-5;5]
                                                       // инфо http://kostin.ws/java/java-math.html
                System.out.print(arr1[a]+", "); //System.out.println("Окружность с центром ("+x+";"+y+") и радиусом "+r);
            }
            System.out.println();
            for(int a = 0; a < arr2.length; a++){
                arr2[a] = (int)(Math.random()*11) - 5; //наполняем массив arr2 псевдослучайными целыми числами из [-5;5]
                                                       // инфо http://kostin.ws/java/java-math.html
                System.out.print(arr2[a]+", ");
            }
            System.out.println();
            int summ_mod1=0;
            int summ_mod2=0;
            for (int anArr1 : arr1) {
                summ_mod1 += Math.abs(anArr1);
            }
            for(int a = 0; a < arr2.length; a++){
                summ_mod2 += Math.abs(arr2[a]);
            }
            if(summ_mod1>summ_mod2) System.out.println("Сумма модулей первой половины массива больше");
            if(summ_mod1<summ_mod2) System.out.println("Сумма модулей второй половины массива больше");
            if(summ_mod1==summ_mod2) System.out.println("Сумма модулей обоих половин массива одинакова");
            //--------------------------------------------------------------------------------------
            System.out.println("Продолжить:\tвведите - go\nВыйти:\t\tнажмите - Enter");
            //String c = in.nextLine(); //считываем одну строку целиком
            if("go".equals(in.next())) go = true;
            //else go = false;
        }
    }
}
