package univer_project;

import java.util.Scanner;

/**
 * Created by mit_OK! on 04.04.2015.
 */
public class UniView {
    public static Scanner scanner = new Scanner(System.in);
    public static String next(){
        return scanner.next();
    }
    public static Boolean hasNext(){
        return scanner.hasNext();
    }
    public static void toPrintLN(String txt) {
        System.out.println(txt);
    }
    public static void toPrint(String txt) {
        System.out.print(txt);
    }
    public static void menu() {

    }
}
