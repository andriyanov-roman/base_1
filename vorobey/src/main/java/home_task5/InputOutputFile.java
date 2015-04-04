package home_task5;


import java.io.*;
import java.util.ArrayList;

public class InputOutputFile {
    public static ArrayList<Shape> readFromFile() throws IOException {
        File file = new File("vorobey\\src\\Shapes.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        ArrayList<Shape> shapes = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] array = line.split(":");
            Shape shape = new Shape();
            shape.setName(array[0]);
            shape.setSquare(Double.valueOf(array[1]));
            shape.setPerimetr(Double.valueOf(array[2]));
        }
        return shapes;

    }

    public static void writeCircleToFile(Shape shape) throws IOException {
        FileWriter writer = new FileWriter("vorobey\\src\\Shapes.txt");
        writer.write(shape.getName() + ":" + shape.getSquare() + ":" + shape.getPerimetr());
        writer.flush();
        writer.close();

    }
}
