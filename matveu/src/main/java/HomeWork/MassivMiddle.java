package HomeWork;
import java.io.*;

public class MassivMiddle {

    // Вывести в консоль половину массива, среднеарифметическое которых является наибольшим

    public static void main(String[] args) throws IOException {

        int i=0;
        double sr1=0,sr2=0;
        int sum=0,sum2=0;
        int x,indexNegative=0;
        int SummaPositiv=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Введите четное положительное число: ");
            String s = br.readLine();
            x = Integer.parseInt(s);
        }while(x%2 !=0);

        if(x>0 && x%2==0){
            int[] mas = new int[x];
            for(i=0;i<mas.length;i++){
                mas[i]=(int)(Math.random()*21-10);
                System.out.print(mas[i]+" ");
            }
            System.out.println();
            for(i=0;i<mas.length/2;i++){
                sum=sum+mas[i];
                sr1=sum/(double)(mas.length/2);
            }
            System.out.println("Среднеарифметическое первой половины: "+sr1);
            for(i=mas.length/2;i<mas.length;i++){
                sum2=sum2+mas[i];
                sr2=sum2/(double)(mas.length/2);
            }
            System.out.println("Среднеарифметическое второй половины: "+sr2);
            if(sr1>sr2){
                for (i = 0; i < mas.length / 2; i++) {
                    System.out.print(mas[i] + " ");
                }
            }
            if(sr1<sr2){
                    for(i=mas.length/2;i<mas.length;i++){
                        System.out.print(mas[i]+" ");
                    }
                }
            if(sr1==sr2){
                System.out.println();
                System.out.println("Среднеарифметические правой и левой половины массива РАВНЫ !!!");
                }

        System.out.println();
//************************************************************************************************************
        System.out.println("***********************************************");

        //﻿Найти индексы отрицательных чисел и сумму положительных чисел в одномерном массиве

            System.out.print("Индексы отрицательных элементов массива: ");
            for(i=0;i<mas.length;i++){
                if(mas[i]<0){
                    indexNegative=i;
                    System.out.print(indexNegative+", ");
                }else{
                    SummaPositiv=SummaPositiv+mas[i];
                }
            }
            System.out.println();
            System.out.println("Сумма положительных элементов массива равна: "+SummaPositiv);
        }else{
            System.out.println("Вы ввели отрицательное число!");
        }
//************************************************************************************************************
        System.out.println("*************************************************");

        // Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно

        int[] mas2={12,-3,4,11,54,-7,0,29,61,-7};
        int indexZero=0;
        System.out.print("Исходный массив: ");
        for(i=0;i<mas2.length;i++){
            System.out.print(mas2[i]+" ");
            if(mas2[i]==0){
                indexZero=i;
            }
        }
        System.out.println();
        System.out.print("Элементы массива до нуля включительно: ");
        for(i=0;i<=indexZero;i++){
            System.out.print(mas2[i]+" ");
        }
    }
}
