package view.consoleApp;

import entity.figures.Container;
import modules.consoleApp.figures.FiguresModule;

import java.util.Scanner;

/**
 * Created by R-Tem on 21.04.2015.
 */
public class FiguresView {
    protected Scanner scanner;

    public FiguresView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String menu(){
        String s = "\n '1' to add figure" +
                "\n '2' to get the figure with the biggest perimeter and square" +
                "\n 'r' to return" +
                "\n 'e' to Exit program";
        System.out.println(" Welcome to Figures util! Create a container, please:");
        Container container;
        System.out.print(" Enter parameters:" +
                "\n side1: ");
        double s1 = Double.valueOf(scanner.next());
        // здесь должен быть вызван валидатор, который проверяет на то, что это число
        System.out.print("\n side2: ");
        double s2 = Double.valueOf(scanner.next());
        // здесь должен быть вызван валидатор
        container = FiguresModule.createContainer(s1, s2); // почему вызываемый метод обязан быть static???
        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1":
                    break;
                case "2": break;
                case "r": return "return";
                case "e": System.exit(0);
                default:System.out.println("No such case! Try again:" + s);
            }
        }
        return null;
    }
}
