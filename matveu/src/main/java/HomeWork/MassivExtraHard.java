package HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Пользователь вводит положительное число,программа создает массив указаного размера,в промежутке [-20;20].
// Написать программу, которая перемещает в конец массива все элементы, значения которых находится в отрезке [a,b]
// Отрезок [a;b] задает пользователь,причем "a" строго меньше "b".

public class MassivExtraHard {
    public static void main(String [] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x,i,a,b;
        int element=0;   //элемент попадающий в отрезок [a;b]
        int count=0;   //счетчик кол-ва элементов попадающих в отрезок [a;b]
        do{
            System.out.println("Введите размер массива: ");
            String s=br.readLine();
            x=Integer.parseInt(s);
        }while (x<0);
        do{
            System.out.println("Введите 'a': ");
            String s1=br.readLine();
            a=Integer.parseInt(s1);
            System.out.println("Введите 'b': ");
            String s2=br.readLine();
            b=Integer.parseInt(s2);
        }while (a>b);

        System.out.print("Исходный массив: ");
        int[] mas=new int[x];
        for(i=0;i<mas.length;i++){
            mas[i]=(int)(Math.random()*41-20);
            System.out.printf("%3d" + " ", mas[i]);
        }
        System.out.println();
        for(i=0;i<mas.length;i++) {
            if (mas[i] >= a && mas[i] <= b) {
                element = mas[i];
                mas[i]=mas[0+count];
                mas[0+count]=element;
                count=count+1;
            }
        }
        System.out.print("Конечный массив: ");
        for(i=mas.length-1;i>=0;i--){
            System.out.printf("%3d" + " ", mas[i]);
        }
    }
}
