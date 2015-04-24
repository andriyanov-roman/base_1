package report;

import java.io.IOException;
import java.util.Scanner;

public class View {
    public static Scanner scanner=new Scanner(System.in);

    public static void startProgramm() throws IOException{
        System.out.println("Выберите действие");
        System.out.println("1. Получить отчет отсортированных фигур");
        System.out.println("2. Получить отчет отсортированных автомобилей");

        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1":
                    System.out.println("1. Выполнить сортировку фигур по периметру");
                    System.out.println("2. Выполнить сортировку фигур по площади");
                    while (scanner.hasNext()){
                        switch (scanner.next()){
                            case "1":
                                new ForAllProgramsReport().reportFromShapesByPerimeter();
                                nextChoiceShapes();
                                break;
                            case "2":
                                new ForAllProgramsReport().reportFromShapesBySquare();
                                nextChoiceShapes();
                                break;
                        }
                    }
                case "2":
                    System.out.println("1. Выполнить сортировку автомобилей по цене");
                    System.out.println("2. Выполнить сортировку автомобилей по году выпуска");
                    while (scanner.hasNext()){
                        switch (scanner.next()){
                            case "1":
                                new ForAllProgramsReport().reportFromCatalogCarsByPrice();
                                nextChoiceCars();
                                break;
                            case "2":
                                new ForAllProgramsReport().reportFromCatalogCarsByYear();
                                nextChoiceCars();
                                break;
                        }
                    }
            }
        }
    }
    public static void nextChoiceShapes() throws IOException {
        System.out.println();
        System.out.println("Если желаете записать в файл - нажмите '1' !!!");
        System.out.println("Вернуться в главное меню - нажмите '2' !!!");
        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1":
                   new ForAllProgramsReport().writerToFileSortShapes();
                    System.out.println("Отсортированные фигуры успешно записаны в новый файл!!!");
                    break;
                case"2":
                    startProgramm();
                    break;
            }
        }

    }
    public static void nextChoiceCars() throws IOException {
        System.out.println();
        System.out.println("Если желаете записать в файл - нажмите '1' !!!");
        System.out.println("Вернуться в главное меню - нажмите '2' !!!");
        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1":
                    new ForAllProgramsReport().writerToFileSortCars();
                    System.out.println("Отсортированные автомобили успешно записаны в новый файл!!!");
                    break;
                case"2":
                    startProgramm();
                    break;
            }
        }

    }

}
