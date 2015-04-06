package Shapes;

import java.io.IOException;
import java.util.Scanner;

public class CommonView {
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
                    MethodsShapes.addSpace();
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
                    MethodsShapes.addNewFoursquare();
                    break;
                case "2":
                    MethodsShapes.addNewCircle();
                    break;
                case "3":
                    MethodsShapes.addNewTriangle();
                    break;
            }
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
