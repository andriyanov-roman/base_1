package HomeWork;
import java.io.*;

        // Пользователь вводит положительное четное число, программа создает массив указаного размера,
        // из случайных чисел,в промежутке [-10;10].

public class MassivMiddle {

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

            // Вывести в консоль половину массива, среднеарифметическое которых является наибольшим

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
        System.out.println();
//*************************************************************************************************************
        System.out.println("**************************************************");

        //Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.

            int max=0;
            int indexMax=0;

            System.out.print("Исходный массив: ");
        for(i=0;i< mas.length;i++){
            System.out.print(mas[i]+" ");
            }
            System.out.println();
            System.out.print("Конечный массив: ");
            for(i=0;i<mas.length;i++){
                if(mas[i]>max) {
                    max = mas[i];
                    indexMax = i;
                }
            }
            int k=mas[mas.length-1];
            mas[mas.length-1]=max;
            mas[indexMax]=k;
            int maxNew=0;
            int indexMaxNew=0;
            int[] masNew = new int[mas.length];
            for(i=0;i<masNew.length;i++) {
                masNew[i]=mas[i];
                }
            for(i=0;i<(masNew.length)-1;i++){
                if(masNew[i]>maxNew){
                    maxNew=masNew[i];
                    indexMaxNew=i;
                }
            }
            int p=masNew[0];
            masNew[0]=maxNew;
            masNew[indexMaxNew]=p;
            for(i=0;i<masNew.length;i++){
                System.out.print(masNew[i]+" ");
            }
       System.out.println();
//*********************************************************************************************************
        System.out.println("************************************************");

            // Написать программу, которая выводит на экран элементы одномерного массива,
            // которые расположены до минимального элемента всего массива

            System.out.print("Исходный массив: ");
            for(i=0;i<mas.length;i++){
                System.out.print(mas[i]+" ");
            }
            int min=mas[0];
            int indexMin=0;
            for(i=0;i<mas.length;i++){
                if(mas[i]<min){
                    min=mas[i];
                    indexMin=i;
                }
            }
            System.out.println();
            System.out.print("Конечный массив: ");
            for(i=0;i<indexMin;i++){
                System.out.print(mas[i]+" ");
            }
        }else{
            System.out.println("Вы ввели отрицательное число!");
        }
    }
}
