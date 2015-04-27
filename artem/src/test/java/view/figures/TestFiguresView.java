package view.figures;

import entity.figures.Circle;
import entity.figures.Container;
import entity.figures.Square;
import entity.figures.Triangle;
import modules.consoleApp.figures.FiguresModule;
import org.junit.Test;
import view.consoleApp.FiguresView;

import java.util.Scanner;

/**
 * Created by R-Tem on 21.04.2015.
 */
public class TestFiguresView {

    @Test
    public void test(){
        Container container = new Container(6, 5);
        container.setCircle(FiguresModule.createCircle("circ", 5));
        container.setFoursquare(FiguresModule.createSquare("sq", 4));
        container.setTriangle(FiguresModule.createTriangle("tr", 5, 3));

    }
    @Test
    public void menu() throws Exception {
        String s = "\n '1' to add figure" +
                "\n '2' to get the figure with the biggest perimeter and square" +
                "\n 'r' to return" +
                "\n 'e' to Exit program";
        String choose = " What kind of figure do you whant to add:" +
                "\n '1' for circle" +
                "\n '2' for square" +
                "\n '3' for triangle";
        System.out.println(" Welcome to Figures util! Create a container, please:");
        System.out.print(" Enter parameters:" +
                "\n side1: ");
        double s1 = Double.valueOf("5");
        // здесь должен быть вызван валидатор, который проверяет на то, что это число
        System.out.print("\n side2: ");
        double s2 = Double.valueOf("5");
        // здесь должен быть вызван валидатор
        Container container = FiguresModule.createContainer(s1, s2); // почему вызываемый метод обязан быть static???
        boolean b = true;
        while (b){
            switch ("1"){
                case "1":
                    System.out.print(choose);
                    switch ("1"){
                        case "1":
                            System.out.print(" Enter parameters:" +
                                    "\n name: ");
                            String name = "circle";
                            System.out.print("\n radius: ");
                            double radius = Double.valueOf("5");
                            Circle circle = FiguresModule.createCircle(name, radius);
                            container.setCircle(circle);
                            break;
                        case "2":
                            System.out.print(" Enter parameters:" +
                                    "\n name: ");
                            name = "square";
                            System.out.print("\n side: ");
                            double side = Double.valueOf("5");
                            Square square = FiguresModule.createSquare(name, side);
                            container.setFoursquare(square);
                            break;
                        case "3":
                            System.out.print(" Enter parameters:" +
                                    "\n name: ");
                            name = "square";
                            System.out.print("\n side: ");
                            side = Double.valueOf("5");
                            System.out.print("\n height: ");
                            double height = Double.valueOf("5");
                            Triangle triangle = FiguresModule.createTriangle(name, side, height);
                            container.setTriangle(triangle);
                            break;
                    }
                    System.out.println(container.getPerimeter() + ", " + container.getSquare() +
                    "\n " + container.getCircle().getPerimeter() + ", " + container.getCircle().getSquare()/* +
                    "\n " + container.getFoursquare().getPerimeter() + ", " + container.getFoursquare().getSquare() +
                    "\n " + container.getTriangle().getPerimeter() + ", " + container.getTriangle().getSquare()*/);
                    b = false;
                    break;
                case "2": break;
                case "e": System.exit(0);
                default:System.out.println("No such case! Try again:" + s);
            }
        }
    }
}
