package HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MassivHard {

    //Пользователь вводит положительное число,программа создает массив указаного размера,в промежутке [-15;15]
    //Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве

    public static void main(String [] args) throws IOException {
        int x;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Введите положительное число: ");
            String s = br.readLine();
            x = Integer.parseInt(s);
        }while (x<0);



    }

}
