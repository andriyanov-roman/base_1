package entities.figures;

import controllers.FigureController;
import io_tools.CommonWriterReader;
import io_tools.FigureWriteReader;
import io_tools.IOTools;

import java.io.IOException;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by Администратор on 05.04.2015.
 */
public class ContainerUtils {


    public static Scanner  scanner = IOTools.scanner;
    public static void mainMenu() throws IOException {
        Container container = new Container(100);
        Boolean showMenu = true;
        showMenu();
        while(showMenu){
            String line = scanner.next();
            switch (line) {
                case "1":
                    Figure figure = new Triangle("Triangle1",3,4);
                    System.out.println(figure.toString());
                    System.out.println(figure.getPerimeter());
                    System.out.println(figure.getArea());
                    Figure figure2 = new FourSquare("FourSquare1",5);
                    System.out.println(figure2.toString());
                    System.out.println(figure2.getPerimeter());
                    System.out.println(figure2.getArea());
                    Figure figure3 = new Circle("Circle1",1);
                    System.out.println(figure3.toString());
                    System.out.println(figure3.getPerimeter());
                    System.out.println(figure3.getArea());
                break;
                case "2":
                    inputFigure();
                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "0":
                    showMenu = false;
                    break;

            }

            if(showMenu){
                showMenu();
            }
        }

    }
    public static void showMenu(){
        System.out.println("1. Show the area of Container");
        System.out.println("2. Add figure to Container");
        System.out.println("3. Show figures in Container");
        System.out.println("4. Show the figure with max area");
        System.out.println("5. Show the figure with max perimeter");
        System.out.println("0. Exit");
    }

    public static void showInputMenu(){
        System.out.println("1. Add triangle");
        System.out.println("2. Add circle");
        System.out.println("3. Add foursquare");
        System.out.println("0. Exit");
    }
    public static void inputFigure() throws IOException {
        Boolean showInputMenu = true;
        showInputMenu();
        while(showInputMenu){
            String line = scanner.next();
            switch (line) {
                case "1":
                    inputTriangle();
                    break;
                case "2":
                    addCircle();
                    break;
                case "3":
                    inputFoursquare();
                    break;
                case "0":
                    showInputMenu =false;
                    break;

            }

            if(showInputMenu){
                showInputMenu();
            }
        }

    }
    public static void inputTriangle() throws IOException {
        Figure figure = new Triangle();
        addSide(figure);
        addHeight(figure);
        System.out.println(figure.toString());
        CommonWriterReader cwr = new FigureWriteReader();
        cwr.read();
    }
    public static void inputFoursquare(){
        Figure figure = new FourSquare();
        addSide(figure);
    }
    public static void addCircle(){
        Figure figure = new Circle();
        addRadius(figure);
    }

    public static void addHeight(Figure figure){
        Boolean loop= true;
        while (loop){
            System.out.println("Input height");
            String line = scanner.next();
            if(FigureController.controlHeight(line)){
                if (figure instanceof Triangle){
                      Double hight = Double.parseDouble(line);
                      ((Triangle) figure).setHeight(hight);
                }
                loop = false;
            }
        }
    }
    public static void addSide(Figure figure){
        Boolean loop= true;
        while (loop){
            System.out.println("Input side");
            String line = scanner.next();
            if(FigureController.controlSide(line)){
                Double side = Double.parseDouble(line);
                if(figure instanceof FourSquare){
                    ((FourSquare) figure).setSide(side);
                }else if (figure instanceof  Triangle){
                    ((Triangle) figure).setSide(side);
                }
                loop = false;

            }

        }
    }
    public static void addRadius(Figure figure){
        Boolean loop= true;
        while (loop){
            System.out.println("Input radius");
            String line = scanner.next();
            if(FigureController.controlRadius(line)){
                loop = false;
                Double radius = Double.parseDouble(line);
                if(figure instanceof Circle){
                    ((Circle) figure).setRadius(radius);

                }

            }
        }
    }
}
