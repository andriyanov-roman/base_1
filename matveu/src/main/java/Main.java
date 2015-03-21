/**
 * Created by Администратор on 06.03.2015.
 */
import homeTask1.Employee;
import homeTask1.EmployeesUtil;

import java.io.*;
import java.lang.System;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args) throws IOException {
     /*   int summa=0;
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
        if(mas[i]>max){
            max=mas[i];
        }
        }
        System.out.println("Максимальное число массива = "+max);
        System.out.println("Сумма элементов массива = "+summa);
*/

       /* File file=new File("E:\\matveu_Project\\Text.txt");
        FileReader reader=new FileReader(file);                      //чтение с файла
        BufferedReader buffered=new BufferedReader(reader);
        ArrayList<String> words=new ArrayList<>();                  // массив слов
        String line;
        while ((line=buffered.readLine())!=null){               //чтитывает пока есть линия
            String[] pool=line.split(" ");           //разбивка строки на слова
            for(int i=0;i<pool.length;i++){
                words.add(pool[i]);
            }
        }
        System.out.println(words.toString());
*/
        File file1=new File("E:\\matveu_Project\\Text1.txt");
        FileReader reader1=new FileReader(file1);
        BufferedReader buffered1=new BufferedReader(reader1);
        ArrayList<Employee> employees=new ArrayList<>();
        String line1;
        while ((line1=buffered1.readLine())!=null){
            String[] pool1=line1.split(":");
               Employee e=new Employee();
                e.setName(pool1[0]);
                e.setSecondName(pool1[1]);
                e.setSex(pool1[2]);
                e.setAge(Integer.valueOf(pool1[3]));
                e.setSalary(Double.valueOf(pool1[4]));
                employees.add(e);
        }
        System.out.println(employees.toString());
    }

}
