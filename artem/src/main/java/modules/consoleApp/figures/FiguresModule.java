package modules.consoleApp.figures;

import entity.figures.*;

import java.util.ArrayList;

/**
 * Created by R-Tem on 06.04.2015.
 */
public class FiguresModule {
    public static Box createBox(double length, double width){
        Box box = new Box(length, width);
        box.calculatePerimeter();
        box.calculateSquare();
        return box;
    }
    public static Circle createCircle(String name, double radius){
        Circle circle = new Circle(name, radius);
        circle.calculatePerimeter();
        circle.calculateSquare();
        return circle;
    }
    public static Square createSquare(String name, double side){
        Square square = new Square(name, side);
        square.calculatePerimeter();
        square.calculateSquare();
        return square;
    }
    public static Triangle createTriangle(String name, double side, double height){
        Triangle triangle = new Triangle(name, side, height);
        triangle.calculatePerimeter();
        triangle.calculateSquare();
        return triangle;
    }
    public static String biggestFig(Box box){
        String biggestFig;

        return null;
    }
}
