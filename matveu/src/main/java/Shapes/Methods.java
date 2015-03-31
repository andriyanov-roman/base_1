package Shapes;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Methods extends Shape {
    static Scanner scanner;
    static ArrayList<Shape> shapes;




    public static void start() throws IOException {
        scanner=new Scanner(System.in);
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
                    Space();
                    break;
                case "2":
                    addNewShape();
                    break;
                case "3":
                    ReadingFromShapes();
                    break;
                case "4":
                case "5":
                case "6":

            }
        }
    }


    public static void addNewShape() throws IOException {
        scanner=new Scanner(System.in);
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
    public static void addNewFoursquare() throws IOException {
        shapes=new ArrayList<>();
        Foursquare foursquare=new Foursquare();
        scanner=new Scanner(System.in);
        foursquare.setName("Foursquare");
        System.out.println("Введите длину стороны квадрата(см)");
        foursquare.setSide(scanner.nextDouble());
        foursquare.setPerimeter(foursquare.getSide() * 4);
        foursquare.setSquare(foursquare.getSide() * foursquare.getSide());
        shapes.add(foursquare);
        FileWriter writer=new FileWriter("matveu\\src\\main\\java\\Shapes\\Shapes.txt", true);
        writer.write(foursquare.getName() + ":" + foursquare.getPerimeter() + ":" + foursquare.getSquare() + "\n");
        writer.flush();
        writer.close();
    }
    public static void addNewCircle() throws IOException {
        shapes=new ArrayList<>();
        Circle circle=new Circle();
        scanner=new Scanner(System.in);
        circle.setName("Circle");
        System.out.println("Введите радиус круга(см)");
        circle.setRadius(scanner.nextDouble());
        circle.setPerimeter(2*Math.PI*circle.getRadius());
        circle.setSquare(Math.PI*circle.getRadius()*circle.getRadius());
        shapes.add(circle);
        FileWriter writer=new FileWriter("matveu\\src\\main\\java\\Shapes\\Shapes.txt", true);
        writer.write(circle.getName()+":"+circle.getPerimeter()+":"+circle.getSquare()+"\n");
        writer.flush();
        writer.close();
    }
    public static void addNewTriangle() throws IOException {
        shapes=new ArrayList<>();
        Triangle triangle=new Triangle();
        scanner=new Scanner(System.in);
        triangle.setName("Triangle");
        System.out.println("Введите длину стороны треугольника(см)");
        triangle.setSide(scanner.nextDouble());
        System.out.println("Введите длину высоты треугольника(см)");
        triangle.setHeight(scanner.nextDouble());
        triangle.setPerimeter(triangle.getSide() * 3);
        triangle.setSquare((triangle.getSide() * triangle.getHeight()) / 2);
        shapes.add(triangle);
        FileWriter writer=new FileWriter("matveu\\src\\main\\java\\Shapes\\Shapes.txt", true);
        writer.write(triangle.getName() + ":" + triangle.getPerimeter() + ":" + triangle.getSquare() + "\n");
        writer.flush();
        writer.close();
    }
    public static void ReadingFromShapesWithOutShow() throws IOException {
        File file = new File("matveu\\src\\main\\java\\Shapes\\Shapes.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Shape> shapes = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Shape shape = new Shape();
            shape.setName(pool[0]);
            shape.setPerimeter(Double.valueOf(pool[1]));
            shape.setSquare(Double.valueOf(pool[2]));
            shapes.add(shape);
        }
    }
    public static void ReadingFromShapes() throws IOException {
        File file = new File("matveu\\src\\main\\java\\Shapes\\Shapes.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Shape> shapes = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Shape shape = new Shape();
            shape.setName(pool[0]);
            shape.setPerimeter(Double.valueOf(pool[1]));
            shape.setSquare(Double.valueOf(pool[2]));
            shapes.add(shape);
            System.out.print(shape + "\n");
        }
    }
    public static void Space() throws IOException {
        scanner=new Scanner(System.in);
        Container container=new Container();
        System.out.println("Введите емкость(площадь) контейнера");
        container.setSquare(scanner.nextDouble());
    }
    public static void FreeSpace(){


    }
}
