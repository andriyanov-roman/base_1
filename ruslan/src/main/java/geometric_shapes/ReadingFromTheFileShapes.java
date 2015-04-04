package geometric_shapes;

import java.io.*;
import java.util.*;

/**
 * Created by user on 03.04.2015.
 */
public class ReadingFromTheFileShapes {
    public static ArrayList<Shape> getShapes() throws IOException {
        File file = new File("matveu\\src\\main\\java\\geometric_shapes\\Shapes.txt");
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
