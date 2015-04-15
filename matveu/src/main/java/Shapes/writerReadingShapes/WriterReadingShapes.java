package Shapes.writerReadingShapes;

import Shapes.view.CommonView;
import Shapes.entity.Shape;

import java.io.*;
import java.util.ArrayList;

public class WriterReadingShapes {
    public static void writerToFile(Shape shapes) throws IOException {
        FileWriter writer = new FileWriter("matveu\\src\\main\\java\\Shapes\\Shapes.txt", true);
        writer.write(shapes.getName() + ":" + shapes.getPerimeter() + ":" + shapes.getSquare() + "\n");
        writer.flush();
        writer.close();
        CommonView.nextChoice();
    }
    public static void readingFromShapes() throws IOException {
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
            if(!shape.getName().equals("Container")) {
                shapes.add(shape);
                System.out.print(shape + "\n");
            }
        }
        System.out.print("Количество фигур: " + shapes.size() + "\n");
    }
}
