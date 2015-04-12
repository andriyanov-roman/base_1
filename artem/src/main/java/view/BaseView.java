package view;

import java.util.Scanner;

/**
 * Created by R-Tem on 12.04.2015.
 */
public class BaseView {
    public Scanner scanner = new Scanner(System.in);

    public static void startProgram (){
        System.out.println("Hallo! This is Artem`s project. What kind of program do you want to see?"
                + "\n 1 for Console Programs"
                + "\n 2 for Swing Program"
                + "\n 0 for Exit");
    }
}
