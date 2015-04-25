package report;

import apps.carFactory.entity.Car;
import apps.carFactory.readingFromCatalogCar.ReadingFromCatalogCars;
import apps.shapes.entity.Shape;
import apps.shapes.writerReadingShapes.ReadingFromShapes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ForAllProgramsReport implements IReport {
    public static ArrayList<Shape> shapes=new ArrayList<>();
    public static ArrayList<Car> cars=new ArrayList<>();

    @Override
    public ArrayList<String> generateReport() throws IOException {
        return null;
    }

    public void showReport(IReport reportImpl)  throws IOException{
        reportImpl.generateReport().forEach(System.out::println);
    }

    public void writeToFileReport(IReport reportImpl)  throws IOException{
        reportImpl.generateReport().forEach(System.out::println);
    }

    @Override
    public ArrayList reportFromShapesByPerimeter () throws IOException {
            shapes= ReadingFromShapes.getShapes();
        for(int i=0;i<shapes.size();i++) {
            if (shapes.get(i).getName().equals("Container")){
                shapes.remove(i);
            }
        }
            Collections.sort(shapes, Comparator.comparing(Shape::getPerimeter));
            shapes.forEach(System.out::println);
        return shapes;
    }

    @Override
    public ArrayList reportFromShapesBySquare() throws IOException {
        shapes=ReadingFromShapes.getShapes();
        for(int i=0;i<shapes.size();i++) {
            if (shapes.get(i).getName().equals("Container")){
                shapes.remove(i);
            }
        }
        Collections.sort(shapes, Comparator.comparing(Shape::getSquare));
        shapes.forEach(System.out::println);
        return shapes;
    }

    @Override
    public ArrayList reportFromCatalogCarsByPrice() throws IOException {
        cars= ReadingFromCatalogCars.getCars();
        Collections.sort(cars, Comparator.comparing(Car::getPrice));
        cars.forEach(System.out::println);
        return cars;
    }

    @Override
    public ArrayList reportFromCatalogCarsByYear() throws IOException {
        cars=ReadingFromCatalogCars.getCars();
        Collections.sort(cars, Comparator.comparing(Car::getYear));
        cars.forEach(System.out::println);
        return cars;
    }
    public ArrayList writerToFileSortShapes () throws IOException {
        FileWriter writer = new FileWriter("matveu\\src\\main\\java\\apps\\appsFiles\\shapes\\ShapesSort.txt", true);
        writer.write(shapes.toString()+"\n");
        writer.flush();
        writer.close();
        return shapes;
    }
    public ArrayList writerToFileSortCars () throws IOException {
        FileWriter writer = new FileWriter("matveu\\src\\main\\java\\apps\\appsFiles\\carFactory\\CarsSort.txt", true);
        writer.write(cars.toString()+"\n");
        writer.flush();
        writer.close();
        return cars;
    }
}

