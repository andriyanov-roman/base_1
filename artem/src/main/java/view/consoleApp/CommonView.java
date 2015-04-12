package view.consoleApp;

import validate.CommonDataValidator;

import java.util.Scanner;

/**
 * Created by R-Tem on 12.04.2015.
 */
public class CommonView {
    protected Scanner scanner;

    public CommonView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String selectProject(){
        System.out.println("Which project do you want to see next;" +
                "\n 1 for Company Util" +
                "\n 2 for Car Factory Util" +
                "\n 3 for Figure Util" +
                "\n 4 for University Util" +
                "\n 9 to return" +
                "\n 0 for Exit program");
        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "9": return "";
                case "0": System.exit(0);
                default: System.out.println("No such case! Try again:" +
                        "\n 1 for Company Util" +
                        "\n 2 for Car Factory Util" +
                        "\n 3 for Figure Util" +
                        "\n 4 for University Util" +
                        "\n 9 to return" +
                        "\n 0 for Exit program");
            }
        }
        return null;
    }
}
