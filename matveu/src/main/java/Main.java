/**
 * Created by Администратор on 06.03.2015.
 */
import java.io.*;
import java.lang.System;

public class Main {
    public static void main(String [] args) throws IOException {
        int summa=0;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        String s=br.readLine();
        int x=Integer.parseInt(s);
        int[] mas=new int[x];
        int max=mas[0];
        for(int i=0;i<mas.length;i++){
            mas[i]=(int)(Math.random()*21-10);
            System.out.print(mas[i]+" ");
        }
        System.out.println();
        for(int i=0;i<mas.length;i++){
            summa=summa+mas[i];
        }
        for(int i=0;i<mas.length;i++){

        }
        System.out.println("Сумма элементов массива= "+summa);

    }
}
