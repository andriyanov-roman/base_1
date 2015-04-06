package Shapes;

import ua.ShapesValidator;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MethodsShapes extends Shape {
    static Scanner scanner;
    static ArrayList<Shape> shapes;
    static Double spaceContainer;
    static Double freeSpace;
    static Integer maxLenght;

    public static void addNewFoursquare() throws IOException {
        ShapesValidator validator = new ShapesValidator();
        shapes=new ArrayList<>();
        Foursquare foursquare=new Foursquare();
        scanner=new Scanner(System.in);
        freeSpace();
        maxLenght=(int)Math.sqrt(freeSpace);
        System.out.println("Максимально-возможная длина стороны= " + maxLenght);
        foursquare.setName("Foursquare");
        System.out.println("Введите длину стороны квадрата(см)");
        if(validator.isSideValid(scanner.nextDouble())) {

        } else {

        }
        foursquare.setSide(scanner.nextDouble());

        if(foursquare.getSquare()<freeSpace) {
            shapes.add(foursquare);
            WriterReadingShapes.writerToFile(foursquare);
        }else{
           CommonView.shapeNotAdd();
        }

    }
    public static void addNewCircle() throws IOException {
        shapes=new ArrayList<>();
        Circle circle=new Circle();
        scanner=new Scanner(System.in);
        freeSpace();
        maxLenght=(int)(Math.sqrt(freeSpace / Math.PI));
        System.out.println("Максимально-возможная длина радиуса= " + maxLenght);
        circle.setName("Circle");
        System.out.println("Введите радиус круга(см)");
        circle.setRadius(scanner.nextDouble());
        if(circle.getSquare()<freeSpace) {
            shapes.add(circle);
            WriterReadingShapes.writerToFile(circle);
        }else{
            CommonView.shapeNotAdd();
        }
    }
    public static void addNewTriangle() throws IOException {
        shapes=new ArrayList<>();
        Triangle triangle=new Triangle();
        scanner=new Scanner(System.in);
        freeSpace();
        maxLenght=(int)Math.sqrt(freeSpace*2);
        System.out.println("Максимально-возможная длина стороны и высоты= " + maxLenght);
        triangle.setName("Triangle");
        System.out.println("Введите длину стороны треугольника(см)");
        triangle.setSide(scanner.nextDouble());
        System.out.println("Введите длину высоты треугольника(см)");
        triangle.setHeight(scanner.nextDouble());
        if(triangle.getSquare()<freeSpace) {
            shapes.add(triangle);
            WriterReadingShapes.writerToFile(triangle);
        }else{
            CommonView.shapeNotAdd();
        }
    }

    public static void maxPerimeter() throws IOException {
        shapes=ReadingFromShapes.getShapes();
        Shape maxPerimeter=shapes.get(0);
        Double max=shapes.get(0).getPerimeter();
        for(int i=0;i<shapes.size();i++){
            if(shapes.get(i).getPerimeter()>max){
                maxPerimeter=shapes.get(i);
                max=shapes.get(i).getPerimeter();
            }
        }
        System.out.println("Фигура с наибольшим периметром:");
        System.out.println(maxPerimeter + " Периметр: " + max);
    }


    public static void maxSquare() throws IOException {
        shapes=ReadingFromShapes.getShapes();
        Shape maxSquare=shapes.get(0);
        Double max=shapes.get(0).getSquare();
        for(int i=0;i<shapes.size();i++){
            if(shapes.get(i).getName().equals("Container")){
                shapes.remove(i);
            }
        }
        for(int i=0;i<shapes.size();i++){
            if(shapes.get(i).getSquare()>max){
                maxSquare=shapes.get(i);
                max=shapes.get(i).getSquare();
            }
        }
        System.out.println("Фигура с наибольшей площадью:");
        System.out.println(maxSquare + " Площадь: " + max);
    }
    public static void addSpace() throws  IOException {
        shapes=ReadingFromShapes.getShapes();
        Container container=new Container();
        scanner=new Scanner(System.in);
        container.setName("Container");
        container.setPerimeter(0.0);
        System.out.println("Введите емкость(площадь) контейнера");
        container.setSquare(scanner.nextDouble());
        shapes.add(container);
        WriterReadingShapes.writerToFile(container);
    }
    public static void freeSpace() throws IOException {
        shapes=ReadingFromShapes.getShapes();
        Double summa=0.0;
        spaceContainer=shapes.get(0).getSquare();
        for(int i=0;i<shapes.size();i++){
            if(shapes.get(i).getName().equals("Container")){
                spaceContainer=shapes.get(i).getSquare();
            }
        }
        for(int i=0;i<shapes.size();i++){
            if(!shapes.get(i).getName().equals("Container")){
                summa=summa+shapes.get(i).getSquare();
            }
        }
        freeSpace=spaceContainer-summa;
        System.out.println("Свободная площадь контейнера равна: "+freeSpace);
    }
}
