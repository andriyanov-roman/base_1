package Shapes.view;

import Shapes.entity.Circle;
import Shapes.entity.Foursquare;
import Shapes.entity.Shape;
import Shapes.entity.Triangle;
import Shapes.model.MethodsShapes;
import Shapes.writerReadingShapes.WriterReadingShapes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CommonView  extends MethodsShapes {
    static ArrayList<Shape> shapes=new ArrayList<>();
    static Scanner scanner=new Scanner(System.in);



    public static void start() throws IOException {
        System.out.println("Выберите действие!");
        System.out.println("1. Задать емкость(площадь) контейнера");
        System.out.println("2. Добавить новую фигуру в контейнер");
        System.out.println("3. Вывести на экран все фигуры хранящиеся в контейнере");
        System.out.println("4. Узнать свободную площадь контейнера");
        System.out.println("5. Вывести на экран фигуру с наибольшим периметром");
        System.out.println("6. Вывести на экран фигуру с наибольшей площадью");

        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1":
                    addSpace();
                    break;
                case "2":
                    addNewShape();
                    break;
                case "3":
                    WriterReadingShapes.readingFromShapes();
                    break;
                case "4":
                    MethodsShapes.freeSpace();
                    break;
                case "5":
                    MethodsShapes.maxPerimeter();
                    break;
                case "6":
                    MethodsShapes.maxSquare();
                    break;
            }
        }
    }
    public static void addNewShape() throws IOException {
        System.out.println("Выберите фигуру, которую желаете добавить");
        System.out.println("1. Квадрат");
        System.out.println("2. Круг");
        System.out.println("3. Треугольник");

        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1":
                    addNewFoursquare();
                    break;
                case "2":
                    addNewCircle();
                    break;
                case "3":
                    addNewTriangle();
                    break;
            }
        }
    }
    public static void addSpace() throws  IOException {
        shapes=new ArrayList<>();
        Shape container=new Shape();
        container.setName("Container");
        container.setPerimeter(0.0);
        System.out.println("Введите емкость(площадь) контейнера");
        container.setSquare(scanner.nextDouble());
        shapes.add(container);
        WriterReadingShapes.writerToFile(container);
    }

    public static void addNewFoursquare() throws IOException {
        shapes=new ArrayList<>();
        Foursquare foursquare=new Foursquare();
        freeSpace();
        maxLenght=(int)Math.sqrt(freeSpace);
        System.out.println("Максимально-возможная длина стороны= " + maxLenght);
        foursquare.setName("Foursquare");
        System.out.println("Введите длину стороны квадрата(см)");
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
    public static void nextChoice() throws IOException {
        System.out.println("1. Добавить следующую фигуру");
        System.out.println("2. Вернуться в главное меню");
        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1":
                    addNewShape();
                    break;
                case "2":
                    start();
                    break;
            }
        }
    }
    public static void shapeNotAdd() throws IOException {
        System.out.println("Площадь фигуры превышает свободную площадь контейнера");
        System.out.println("!!! ФИГУРА  НЕ  ДОБАВЛЕНА !!!");
        System.out.println("Введите другие размеры фигуры");
        nextChoice();
    }

}
