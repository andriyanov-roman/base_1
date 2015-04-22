package modules.consoleApp.figures;

import entity.figures.Circle;
import entity.figures.Container;
import entity.figures.Square;
import entity.figures.Triangle;

/**
 * Created by R-Tem on 06.04.2015.
 */
public class FiguresModule {
    public static Container createContainer(double s1, double s2){
        Container container = new Container(s1, s2);
        container.calculatePerimeter();
        container.calculateSquare();
        return container;
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
}
