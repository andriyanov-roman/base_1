package Shapes.model;

import Shapes.writerReadingShapes.ReadingFromShapes;
import Shapes.entity.Shape;

import java.io.IOException;
import java.util.ArrayList;

public class MethodsShapes extends Shape {
    static ArrayList<Shape> shapes=new ArrayList<>();
    static Double spaceContainer;
    static Double freeSpace;

    public static void maxPerimeter() throws IOException {
        shapes= ReadingFromShapes.getShapes();
        Shape maxPerimeter=shapes.get(0);
        Double max=0.0;
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
        Shape maxSquare=shapes.get(1);
        Double max=0.0;
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

    public static void freeSpace() throws IOException {
        shapes=ReadingFromShapes.getShapes();
        Double summa=0.0;
        spaceContainer=0.0;
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
