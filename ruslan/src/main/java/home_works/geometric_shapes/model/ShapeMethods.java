package home_works.geometric_shapes.model;


import home_works.geometric_shapes.entity_shapes.Shape;
import home_works.geometric_shapes.data.files.ShapesReaderWriter;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by user on 03.04.2015.
 */
public abstract class ShapeMethods extends Shape {
    static ArrayList<Shape> shapes = new ArrayList<>();

    /* private ShapesReaderWriter shapesReaderWriter = new ShapesReaderWriter();

     public void writeNewShapes(Shape shape) {
         shapesReaderWriter.setPath("ruslan\\src\\main\\java\\geometric_shapes\\NewShapes.txt");
         shapesReaderWriter.writeShapesToFile(shape);
         System.out.println("Wrote to file");
     }

     @Override
     public double getPerimeter() {
         return 0;
     }

     @Override
     public double getSquare() {
         return 0;
     }*/
    public static void maxPerimeter() throws IOException {
        shapes = ShapesReaderWriter.getShapes();
        shapes.get(0).getPerimeter();
        Shape temp = shapes.get(0);
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).getPerimeter() > temp.getPerimeter()) {
                temp = shapes.get(i);
            }
        }
        System.out.println(" Фігура з найбільшим периметром :" + temp.getName() + ", периметр " + temp.getPerimeter());
    }

    public static void maxSquare() throws IOException {
        shapes = ShapesReaderWriter.getShapes();
        shapes.get(0).getSquare();
        Shape temp = shapes.get(0);
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).getSquare() > temp.getSquare()) {
                temp = shapes.get(i);
            }
        }
        System.out.println(" Фігура з найбільшим периметром :" + temp.getName() + ", периметр " + temp.getSquare());

    }


}


