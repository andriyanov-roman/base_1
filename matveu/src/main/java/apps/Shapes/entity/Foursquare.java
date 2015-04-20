package apps.shapes.entity;

public class Foursquare extends Shape {
    public Double side;

    public Foursquare(){

    }

    @Override
    public String toString() {
        return "Foursquare{" +
                "side=" + side +
                '}';
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public Double getPerimeter() {
        return getSide() * 4;
    }

    @Override
    public Double getSquare() {
        return getSide() * getSide();
    }

    public Foursquare(String name, Double perimeter, Double square, Double side) {
        super(name, perimeter, square);
        this.side = side;
    }
}
