package home_works.geometric_shapes.data.files;

import entity.CommonReaderWriter;
import home_works.geometric_shapes.entity_shapes.Triangle;
import home_works.geometric_shapes.entity_shapes.Shape;

import java.io.*;
import java.util.*;

/**
 * Created by user on 03.04.2015.
 */
public class ShapesReaderWriter extends CommonReaderWriter {
    //public String path = "ruslan\\src\\main\\java\\files.txt\\Shapes";



    public static ArrayList<Shape> getShapes() throws IOException {
        File file = new File("ruslan\\src\\main\\java\\files.txt\\Shapes.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Shape> cars = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Shape shape = new Shape() {
                @Override
                public double getPerimeter() {
                    return 0;
                }

                @Override
                public double getSquare() {
                    return 0;
                }
            };
            shape.setName(pool[0]);



    /*public ArrayList<Shape> getShapes () throws IOException {
        ArrayList<String[]> strings = readFromFile(path, ":");
        ArrayList<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < shapes.size(); i++) {
            if ("Triangle".equals(strings.get(i)[0])) {
                Triangle t = new Triangle();
                t.setHeight(Double.valueOf(strings.get(i)[1]));
                t.setSideTriangle(2);
                shapes.add(t);
            }
        }
        return null;*/
        }
        return cars;
    }



    public void writeShapesToFile(Shape shape) {
        try {
            FileWriter writer = new FileWriter(getPath(), true);
            writer.write(shape.getName() + " : " + shape.getPerimeter() + " : " + shape.getSquare() + "\n");
            writer.flush();
            writer.close();
        } catch (IOException shapes) {
            shapes.printStackTrace();
        }
    }
}
