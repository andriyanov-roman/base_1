package home_task5;


import com.sun.java.swing.plaf.windows.WindowsTreeUI;
import sun.util.resources.cldr.it.CalendarData_it_CH;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    public static void addNewSquare() throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();
        Square square = new Square();
        square.setName("Квадрат");
        System.out.println("Введите величину стороны квадрата: ");
        square.setSide(sc.nextDouble());
        square.setSquare(square.getSide() * square.getSide());
        square.setPerimetr(square.getSide() * 4);
        shapes.add(square);
        InputOutputFile.writeCircleToFile(square);

    }

    public static void addNewTriagle() throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();
        Triagle triagle = new Triagle();
        triagle.setName("Треугольник");
        System.out.println("Введите величину стороны трегольника: ");
        triagle.setSide(sc.nextDouble());
        System.out.println("Введите величину высоты трегольника: ");
        triagle.setHeight(sc.nextDouble());
        triagle.setSquare(triagle.getSide() * triagle.getHeight() * 0.5);
        triagle.setPerimetr(triagle.getSide() * 3);
        shapes.add(triagle);
        InputOutputFile.writeCircleToFile(triagle);

    }

    public static void addNewCircle() throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle();
        circle.setName("Окружность");
        System.out.println("Введите радиус окружности:");
        circle.setRadius(sc.nextDouble());
        circle.setSquare(circle.getRadius() * circle.getRadius() * 3.14);
        circle.setPerimetr(circle.getRadius() * 2 * 3.14);
        shapes.add(circle);
        InputOutputFile.writeCircleToFile(circle);

    }

}
