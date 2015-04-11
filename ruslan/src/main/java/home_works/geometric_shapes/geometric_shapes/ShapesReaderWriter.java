package home_works.geometric_shapes.geometric_shapes;

import entity.CommonReaderWriter;

import java.io.*;
import java.util.*;

/**
 * Created by user on 03.04.2015.
 */
public class ShapesReaderWriter extends CommonReaderWriter {
    private String path = "ruslan\\src\\main\\java\\files.txt\\Shapes";

    public ArrayList<Shape> getShapes() throws IOException {
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
        return null;
    }
    public void writeShapesToFile(Shape shape)  {
        try {
            FileWriter writer = new FileWriter(getPath(), true);
            writer.write(  shape.getName()+" : " + shape.getPerimeter() +" : " +  shape.getSquare() + "\n");
            writer.flush();
            writer.close();
        } catch (IOException shapes) {
           shapes.printStackTrace();
        }
    }
}
