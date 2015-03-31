package Shapes;

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

    public Foursquare(String name, Double perimeter, Double square, Double side) {
        super(name, perimeter, square);
        this.side = side;
    }
}
