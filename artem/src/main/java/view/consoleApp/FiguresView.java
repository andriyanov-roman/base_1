package view.consoleApp;

import entity.figures.Circle;
import entity.figures.Box;
import entity.figures.Square;
import entity.figures.Triangle;
import modules.consoleApp.figures.FiguresModule;

import java.util.Scanner;

/**
 * Created by R-Tem on 21.04.2015.
 */
public class FiguresView {
    private Box box;
    protected Scanner scanner;

    public FiguresView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String menu(){
        String menu = " '1' to add figure" +
                "\n '2' to get the figure with the biggest perimeter and square" +
                "\n 'r' to return" +
                "\n 'e' to Exit program";
        System.out.println(" Welcome to Figures util!");
        try{
            double check = box.getPerimeter();
            System.out.println(menu);
        }
        catch (NullPointerException npe) {
            setContainer();
            System.out.println(" Done! Choose the action, please:\n" + menu);
        }
        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1":
                    addFigure();
                    System.out.println(" Done! Choose the action, please:\n" + menu);
                    break;
                case "2": System.out.print(FiguresModule.biggestFig(box)); break;
                case "r": return "return";
                case "e": System.exit(0);
                default:System.out.println("No such case! Try again:\n" + menu);
            }
        }
        return null;
    }
    private void setContainer(){
        System.out.print(" Create a container, please:" +
                "\n length: ");
        double length = Double.valueOf(scanner.next());
        // здесь должен быть вызван валидатор, который проверяет на то, что это число
        System.out.print(" width: ");
        double width = Double.valueOf(scanner.next());
        // здесь должен быть вызван валидатор
        box = FiguresModule.createBox(length, width); // почему вызываемый метод обязан быть static???
    }
    private void addFigure(){
        String chooseFig = "\n '1' for circle" +
                "\n '2' for square" +
                "\n '3' for triangle" +
                "\n 'r' to return" +
                "\n 'e' to Exit program";
        System.out.println(" What kind of figure do you want to add: " + chooseFig);
        String name;
        switch (scanner.next()){
            case "1":
                System.out.print("Enter name, please: ");
                name = scanner.next();
                System.out.print("Enter radius: ");
                double radius = Double.valueOf(scanner.next());
                Circle circle = FiguresModule.createCircle(name, radius);
                box.addFigures(circle);
                break;
            case "2":
                System.out.print("Enter name, please: ");
                name = scanner.next();
                System.out.print(" Enter side: ");
                double side = Double.valueOf(scanner.next());
                Square square = FiguresModule.createSquare(name, side);
                box.addFigures(square);
                break;
            case "3":
                System.out.print("Enter name, please: ");
                name = scanner.next();
                System.out.print(" Enter side: ");
                side = Double.valueOf(scanner.next());
                System.out.print(" Enter height: ");
                double triangleHeight = Double.valueOf(scanner.next());
                Triangle triangle = FiguresModule.createTriangle(name, side, triangleHeight);
                box.addFigures(triangle);
                break;
            case "r": menu();
            case "e": System.exit(0);
            default: System.out.println("No such case! Try again:" + chooseFig);
        }
    }
}
