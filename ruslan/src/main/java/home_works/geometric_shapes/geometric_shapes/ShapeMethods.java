package home_works.geometric_shapes.geometric_shapes;



import java.util.ArrayList;

/**
 * Created by user on 03.04.2015.
 */
public class ShapeMethods extends Shape {
    static ArrayList<Shape> shapes;
    private ShapesReaderWriter shapesReaderWriter = new ShapesReaderWriter();

    public void writeNewShapes(Shape shape) {
        shapesReaderWriter.setPath("ruslan\\src\\main\\java\\geometric_shapes\\NewShapes.txt");
        shapesReaderWriter.writeShapesToFile(shape);
        System.out.println("Wrote to file");
    }

}

