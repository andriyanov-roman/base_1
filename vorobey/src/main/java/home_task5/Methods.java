package home_task5;


import com.sun.java.swing.plaf.windows.WindowsTreeUI;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;
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

    public static void createSpaceContainer() throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shape> shapes = InputOutputFile.readFromFile();
        Container container = new Container();
        container.setName("Контейнер");
        System.out.println("Введите емкость контейнера: ");
        container.setSquare(sc.nextDouble());
        shapes.add(container);
        InputOutputFile.writeCircleToFile(container);

    }

    public static void freeSpace() throws IOException {
        Double freeSpace;
        Double spaceContainer;
        Double sum = 0.0;
        ArrayList<Shape> shapes = InputOutputFile.readFromFile();
        spaceContainer = shapes.get(0).getSquare();
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).getName().equals("Container")) {
                spaceContainer = shapes.get(i).getSquare();
            }
        }
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).getName().equals("Container") == false) {
                sum = sum + shapes.get(i).getSquare();
            }
        }
        freeSpace = spaceContainer - sum;
        System.out.println("Свободная емкость контейнера: " + freeSpace);
    }

    public static void launch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Чтобы задать емкость контейнера,нажмите 1");
        System.out.println("Чтобы добавить новую фигуру(треугольник),нажмите 2");
        System.out.println("Чтобы добавить новую фигуру(квадрат),нажмите 3");
        System.out.println("Чтобы добавить новую фигуру(окружность),нажмите 4");
        System.out.println("Чтобы вывести все имеющиеся фигуры(Shapes),нажмите 5");
        System.out.println("Чтобы вывести фигуру с максимальным периметром,нажмите 6");
        System.out.println("Чтобы вывести фигуру с максимальной площадью,нажмите 7");

        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":

                    break;
                case "7":

                    break;

                default:
                    System.out.println("No such case!");
            }
        }

    }

}
