package Shapes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadingFromShapes {
    public static ArrayList<Shape> getShapes() throws IOException {
        File file = new File("matveu\\src\\main\\java\\Shapes\\Shapes.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Shape> shapes = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Shape shape = new Shape();
            shape.setName(pool[0]);
            shape.setPerimeter(Double.valueOf(pool[1]));
            shape.setSquare(Double.valueOf(pool[2]));
            shapes.add(shape);
        }
        return shapes;
    }
}
