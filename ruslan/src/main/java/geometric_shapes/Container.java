package geometric_shapes;

import java.util.ArrayList;

/**
 * Created by user on 03.04.2015.
 */
public class Container extends Shape{

private ArrayList<Shape> shapes;

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }
}
