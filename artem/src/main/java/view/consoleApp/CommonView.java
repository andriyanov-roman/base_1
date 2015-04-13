package view.consoleApp;


import java.util.Scanner;


public class CommonView {
    protected Scanner scanner;


    public CommonView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String selectProject(){
        String s = "\n 1 for Company Util" +
                "\n 2 for Car Factory Util" +
                "\n 3 for Figure Util" +
                "\n 4 for University Util" +
                "\n r to return" +
                "\n e to Exit program";
        System.out.println("Chose the theme, please:" + s);
        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1": return "Company Util";
                case "2": return "Car Factory Util";
                case "3": return "Figure Util";
                case "4": return "University Util";
                case "r": return "return";
                case "e": System.exit(0);
                default: System.out.println("No such case! Try again:" + s);
            }
        }
        return null;
    }
}
