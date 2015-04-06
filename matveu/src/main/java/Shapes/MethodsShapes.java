package Shapes;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MethodsShapes extends Shape {
    static Scanner scanner;
    static ArrayList<Shape> shapes;
    static Double spaceContainer;
    static Double freeSpace;
    static Integer maxLenght;

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
                    addSpace();
                    break;
                case "2":
                    addNewShape();
                    break;
                case "3":
                    readingFromShapes();
                    break;
                case "4":
                    freeSpace();
                    break;
                case "5":
                    maxPerimeter();
                    break;
                case "6":
                    maxSquare();
                    break;
            }
        }
    }
    public static void nextChoice() throws IOException {
        scanner=new Scanner(System.in);
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
    public static void writerToFile(Shape shapes) throws IOException {
        FileWriter writer = new FileWriter("matveu\\src\\main\\java\\Shapes\\Shapes.txt", true);
            writer.write(shapes.getName() + ":" + shapes.getPerimeter() + ":" + shapes.getSquare() + "\n");
            writer.flush();
            writer.close();
        nextChoice();

    }

    public static void addNewFoursquare() throws IOException {
        shapes=new ArrayList<>();
        Foursquare foursquare=new Foursquare();
        scanner=new Scanner(System.in);
        freeSpace();
        maxLenght=(int)Math.sqrt(freeSpace);
        System.out.println("Максимально-возможная длина стороны= " + maxLenght);
        foursquare.setName("Foursquare");
        System.out.println("Введите длину стороны квадрата(см)");
        foursquare.setSide(scanner.nextDouble());
        foursquare.setPerimeter(foursquare.getSide() * 4);
        foursquare.setSquare(foursquare.getSide() * foursquare.getSide());
        if(foursquare.getSquare()<freeSpace) {
            shapes.add(foursquare);
            writerToFile(foursquare);
        }else{
           shapeNotAdd();
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
        circle.setPerimeter(2*Math.PI*circle.getRadius());
        circle.setSquare(Math.PI * circle.getRadius() * circle.getRadius());
        if(circle.getSquare()<freeSpace) {
            shapes.add(circle);
            writerToFile(circle);
        }else{
            shapeNotAdd();
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
        triangle.setPerimeter(triangle.getSide() * 3);
        triangle.setSquare((triangle.getSide() * triangle.getHeight()) / 2);
        if(triangle.getSquare()<freeSpace) {
            shapes.add(triangle);
            writerToFile(triangle);
        }else{
            shapeNotAdd();
        }
    }

    public static void readingFromShapes() throws IOException {
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
            if(!shape.getName().equals("Container")) {
                shapes.add(shape);
                System.out.print(shape + "\n");
            }
        }
        System.out.print("Количество фигур: " + shapes.size() + "\n");
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
        FileWriter writer=new FileWriter("matveu\\src\\main\\java\\Shapes\\Shapes.txt", true);
        writer.write(container.getName() + ":" + container.getPerimeter()+":"+container.getSquare() + "\n");
        writer.flush();
        writer.close();
        nextChoice();
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
