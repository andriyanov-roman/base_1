package Shapes;

public class Circle extends Shape {
    public Double radius;

    public Circle(){

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getPerimeter() {
        return 2*Math.PI*getRadius();
    }

    @Override
    public Double getSquare() {
        return Math.PI *getRadius() *getRadius();
    }

    public Circle(String name, Double perimeter, Double square, Double radius) {
        super(name, perimeter, square);
        this.radius = radius;
    }
}
