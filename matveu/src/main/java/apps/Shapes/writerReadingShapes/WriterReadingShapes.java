package apps.shapes.writerReadingShapes;

import apps.shapes.view.CommonView;
import apps.shapes.entity.Shape;

import java.io.*;
import java.util.ArrayList;

public class WriterReadingShapes {
    public static void writerToFile(Shape shapes) throws IOException {
        FileWriter writer = new FileWriter("matveu\\src\\main\\java\\shapes\\shapes.txt", true);
        writer.write(shapes.getName() + ":" + shapes.getPerimeter() + ":" + shapes.getSquare() + "\n");
        writer.flush();
        writer.close();
        CommonView.nextChoice();
    }
    public static void readingFromShapes() throws IOException {
        File file = new File("matveu\\src\\main\\java\\shapes\\shapes.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Shape> shapes = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Shape shape = new Shape(){};
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
