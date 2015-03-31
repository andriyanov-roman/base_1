package Shapes;

public class Triangle extends Shape {
    public Double side;
    public Double height;

    public Triangle(){

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                ", height=" + height +
                '}';
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Triangle(String name, Double perimeter, Double square, Double side, Double height) {
        super(name, perimeter, square);
        this.side = side;
        this.height = height;
    }
}
