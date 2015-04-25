package entity;

import entity.CommonReaderWriter;
import geometric_shapes.Shape;
import geometric_shapes.Triangle;

import java.io.*;
import java.util.*;

/**
 * Created by user on 03.04.2015.
 */
public class ShapesReaderWriter extends CommonReaderWriter {
    private String path = "ruslan\\src\\main\\java\\geometric_shapes\\shapes";

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

}
