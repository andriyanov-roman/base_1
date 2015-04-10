package entity.figures;

/**
 * Created by user on 04.04.2015.
 */
public class Circle extends Figure {
    final static double PI = 3.14;
    private double radius;

    public Circle(String name, double perimeter, double square, double radius) {
        super(name, perimeter, square);
        this.radius = radius;
    }
    public Circle(){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        super.getPerimeter();
        return PI*2*radius;
    }

    @Override
    public double getSquare() {
         super.getSquare();
        return PI*radius*radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
