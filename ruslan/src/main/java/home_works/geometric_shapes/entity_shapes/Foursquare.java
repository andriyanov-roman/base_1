package home_works.geometric_shapes.entity_shapes;


public class Foursquare extends Shape {
    private double side;

    public Foursquare() {

    }

    @Override
    public String toString() {
        return "Foursquare{" +
                "side = " + side +
                '}';
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getSquare() {
        return getSide() * getSide();
    }

    @Override
    public double getPerimeter() {
        return  getSide() * 4;
    }

    public Foursquare(String name, Double perimeter, Double square, double side) {
        super(name, perimeter, square);
        this.side = side;
    }
}
