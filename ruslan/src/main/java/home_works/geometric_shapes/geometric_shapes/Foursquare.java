package home_works.geometric_shapes.geometric_shapes;

/**
 * Created by user on 03.04.2015.
 */
public class Foursquare extends Shape {
    private double side;

    public Foursquare() {
    }

    @Override
    public double getPerimeter() {
        return this.side*4;
    }

    @Override
    public double getSquare() {
        return this.side*this.side;
    }

    public Foursquare(String name, Double perimeter, Double square, Double side) {
        super(name, perimeter, square);
        this.side = side;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Foursquare{" +
                "side=" + side +
                '}';
    }
}
