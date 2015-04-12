package view;

import java.util.Scanner;


public class BaseView {
    protected Scanner scanner;

    public BaseView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String startProgram (){
        String s = "\n 1 for Console Programs" +
                "\n 2 for Swing Program" +
                "\n 0 for Exit";
        System.out.println("Hallo! This is Artem`s project. What kind of program do you want to see?" + s);
        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1": return "console";
                case "2": return "swing";
                case "0": System.exit(0);
                default: System.out.println("No such case! Try again:" + s);
            }
        }
        return null;
    }
}
