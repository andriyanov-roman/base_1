package home_task5;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    static double freeSpace;
    static double spaceContainer;

    public static void addNewSquare() throws IOException {
        freeSpace();
        Scanner sc = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();
        Square square = new Square();
        square.setName("Квадрат");
        System.out.println("Введите величину стороны квадрата: ");
        square.setSide(sc.nextDouble());
        square.setSquare(square.getSide() * square.getSide());
        square.setPerimetr(square.getSide() * 4);
        if (square.getSquare() < freeSpace) {
            shapes.add(square);
            InputOutputFile.writeCircleToFile(square);
        } else
            System.out.println("Емкости контейнера недостаточно,введите другие параметры фигуры");
        launch();

    }

    public static void addNewTriagle() throws IOException {
        freeSpace();
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
        if (triagle.getSquare() < freeSpace) {
            shapes.add(triagle);
            InputOutputFile.writeCircleToFile(triagle);
        } else
            System.out.println("Емкости контейнера недостаточно,введите другие параметры фигуры");
        launch();
    }

    public static void addNewCircle() throws IOException {
        freeSpace();
        Scanner sc = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle();
        circle.setName("Окружность");
        System.out.println("Введите радиус окружности:");
        circle.setRadius(sc.nextDouble());
        circle.setSquare(circle.getRadius() * circle.getRadius() * 3.14);
        circle.setPerimetr(circle.getRadius() * 2 * 3.14);
        if (circle.getSquare() < freeSpace) {
            shapes.add(circle);
            InputOutputFile.writeCircleToFile(circle);
        } else
            System.out.println("Емкости контейнера недостаточно,введите другие параметры фигуры");
        launch();
    }

    public static void createSpaceContainer() throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();
        Container container = new Container();
        container.setName("Контейнер");
        System.out.println("Введите емкость контейнера: ");
        container.setSquare(sc.nextDouble());
        shapes.add(container);
        InputOutputFile.writeCircleToFile(container);
        launch();

    }

    public static double freeSpace() throws IOException {
        double sum = 0d;
        ArrayList<Shape> shapes = InputOutputFile.readFromFile();
        spaceContainer = shapes.get(0).getSquare();
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).getName().equals("Контейнер")) {
                spaceContainer = shapes.get(i).getSquare();
            }
        }
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).getName().equals("Контейнер") == false) {
                sum = sum + shapes.get(i).getSquare();
            }
        }
        freeSpace = spaceContainer - sum;
        System.out.println("Свободная емкость контейнера: " + freeSpace);
        return freeSpace;
    }

    public static void showSapes() throws IOException {
        File file = new File("vorobey\\src\\shapes.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        ArrayList<Shape> shapes = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] array = line.split(":");
            Shape shape = new Shape();
            shape.setName(array[0]);
            shape.setSquare(Double.valueOf(array[1]));
            shape.setPerimetr(Double.valueOf(array[2]));
            if (shape.getName().equals("Контейнер") == false) {
                shapes.add(shape);
                System.out.println(shape.getName() + ":" + shape.getSquare() + ":" + shape.getPerimetr());
            }

        }
        launch();

    }

    public static void launch() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Чтобы задать емкость контейнера,нажмите 1");
        System.out.println("Чтобы добавить новую фигуру(треугольник),нажмите 2");
        System.out.println("Чтобы добавить новую фигуру(квадрат),нажмите 3");
        System.out.println("Чтобы добавить новую фигуру(окружность),нажмите 4");
        System.out.println("Чтобы вывести все имеющиеся фигуры(shapes),нажмите 5");

        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":
                    createSpaceContainer();
                    break;
                case "2":
                    addNewTriagle();
                    break;
                case "3":
                    addNewSquare();
                    break;
                case "4":
                    addNewCircle();
                    break;
                case "5":
                    showSapes();
                    break;

                default:
                    System.out.println("No such case!");
            }
        }

    }

}
