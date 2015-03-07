package HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MassivHard {

    // Пользователь вводит положительное число,программа создает массив указаного размера,в промежутке [-15;15]
    // Найти сумму всех чисел находящихся между минимальным и максимальным
    // числом в массиве(невключая мин и макс значения)

    public static void main(String [] args) throws IOException {
        int x,i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Введите положительное число: ");
            String s = br.readLine();
            x = Integer.parseInt(s);
        }while (x<0);

        int[] mas=new int[x];
        int min=0;
        int indexMin=0;
        int max=0;
        int indexMax=0;
        int Summa=0;
        System.out.print("Исходный массив: ");
        for(i=0;i<mas.length;i++){
            mas[i]=(int)(Math.random()*31-15);
            System.out.print(mas[i]+" ");
        }
        System.out.println();
        for(i=0;i<mas.length;i++){
            if(mas[i]<min){
                min=mas[i];
                indexMin=i;
            }
            if(mas[i]>max){
                max=mas[i];
                indexMax=i;
            }
            if(mas[i]==min){
                min=mas[i];
                indexMin=i;
            }
            if(mas[i]==max){
                max=mas[i];
                indexMax=i;
            }
        }
        if(indexMin<indexMax) {
            for (i =indexMin + 1; i <indexMax; i++) {
                Summa = Summa + mas[i];
            }
            System.out.println("Сумма элементов массива между Min и Max значениями: "+Summa);
        }
        if(indexMin>indexMax){
            mas[indexMin]=max;
            mas[indexMax]=min;
            for(i=indexMax+1;i<indexMin;i++){
                Summa=Summa+mas[i];
            }
             System.out.println("Сумма элементов массива между Min и Max значениями: "+Summa);
        }
    }
}
