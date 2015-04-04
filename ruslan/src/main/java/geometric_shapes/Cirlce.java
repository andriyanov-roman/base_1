package geometric_shapes;

/**
 * Created by user on 03.04.2015.
 */
public class Cirlce extends Shape {

    public Cirlce(String name, Double perimeter, Double square, Double radius) {
        super(name, perimeter, square);
        this.radius = radius;
    }

    public Double radius;

    public Cirlce() {
    }


    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';


    }
}
