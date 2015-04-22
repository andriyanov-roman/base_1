package view.consoleApp;

import entity.figures.Circle;
import entity.figures.Container;
import entity.figures.Square;
import entity.figures.Triangle;
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
        String menu = "\n '1' to add figure" +
                "\n '2' to get the figure with the biggest perimeter and square" +
                "\n 'r' to return" +
                "\n 'e' to Exit program";
        System.out.println(" Welcome to Figures util! Create a container, please:");
        System.out.print(" Enter parameters:" +
                "\n width: ");
        double width = Double.valueOf(scanner.next());
        // здесь должен быть вызван валидатор, который проверяет на то, что это число
        System.out.print(" height: ");
        double contHeight = Double.valueOf(scanner.next());
        // здесь должен быть вызван валидатор
        Container container = FiguresModule.createContainer(width, contHeight); // почему вызываемый метод обязан быть static???
        System.out.println(" Done! Choose the action, please:" + menu);
        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1":
                    container = addFigure(container);
                    System.out.println(" Done! Choose the action, please:" + menu);
                    break;
                case "2": break;
                case "r": return "return";
                case "e": System.exit(0);
                default:System.out.println("No such case! Try again:" + menu);
            }
        }
        return null;
    }
    private Container addFigure(Container container){
        String chooseFig = "\n '1' for circle" +
                "\n '2' for square" +
                "\n '3' for triangle" +
                "\n 'e' to Exit program";
        System.out.println(" What kind of figure do you want to add: " + chooseFig);
        String name;
        boolean b = true;
        do {
            switch (scanner.next()){
                case "1":
                    name = "circle";
                    System.out.print("Enter radius, please: ");
                    double radius = Double.valueOf(scanner.next());
                    Circle circle = FiguresModule.createCircle(name, radius);
                    container.setCircle(circle);
                    toDoNext(container);
                    b = false;
                    break;
                case "2":
                    name = "square";
                    System.out.print(" Enter side, please: ");
                    double side = Double.valueOf(scanner.next());
                    Square square = FiguresModule.createSquare(name, side);
                    container.setFoursquare(square);
                    toDoNext(container);
                    b = false;
                    break;
                case "3":
                    name = "triangle";
                    System.out.print(" Enter side, please: ");
                    side = Double.valueOf(scanner.next());
                    System.out.print(" Enter height, please: ");
                    double triangleHeight = Double.valueOf(scanner.next());
                    Triangle triangle = FiguresModule.createTriangle(name, side, triangleHeight);
                    container.setTriangle(triangle);
                    toDoNext(container);
                    b = false;
                    break;
                case "e": System.exit(0);
                default: System.out.println("No such case! Try again:" + chooseFig);
            }
        } while (b);
        return container;
    }
    private void toDoNext(Container container){
        String s = "\n '1' to add one more figure" +
                "\n '2' to go to Figures util menu" +
                "\n 'e' to Exit program";
        System.out.println(" Done! What do you want to do next?" + s);
        boolean b = true;
        do {
            switch (scanner.next()){
                case "1":
                    addFigure(container);
                    b = false;
                    break;
                case "2":
                    b = false;
                    break;
                case "e": System.exit(0);
                default: System.out.print("No such case! Try again, please:" + s);
            }
        } while (b);
    }
}
