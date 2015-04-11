package lection9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 11.04.2015.
 */
public class Lection9 {
    public static ArrayList<String> colors;
    public static String colors2[];
    static{
        colors.add("green");
        colors2[0]="green";
    }
    // if validator.chekColor(scanner.next())
    // else
    //do while, recursion
    //предусмотреть выход из цикла
    public static void main(String [] args){

        //Class clazz = e.getClass();
        //Class clazz = e.getSuperClass(); // родителя

        int[] array = new int [] {1,2,3};
        check(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
    public static void check(int[] array){
        if(array[0]>0){
            array[0] = 88; // поменяли значение - определяем значение, не создавая новый объект
        }
        array = new int[]{4,5,6}; // поменяли ссылку - эта ссылка будет жить в пределах этого метода
    }
    /// private Scanner scanner = new Scanner(System.in); - View
    public class Controller {


    }

    public class ConsoleView{
       // public Scanner scanner = new Scanner();

    }
}

