package lesson_today;

import home_task5.Shape;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class TestClass {
    public static void main(String[] args) throws IOException {
        File file = new File("vorobey\\src\\test.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        ArrayList<Shape> shapes = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] array = line.split(":");
            Shape shape = new Shape();
            shape.setName(array[0]);
            shape.setSquare(Double.valueOf(array[1]));
            shape.setPerimetr(Double.valueOf(array[2]));
            System.out.println(shape.getName() + " " + shape.getSquare());


        }
    }
}

