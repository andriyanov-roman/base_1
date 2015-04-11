package entity.figures;

/**
 * Created by user on 04.04.2015.
 */
public class Triangle extends Figure {
    private double side;
    private double height;

    public Triangle(String name, double perimeter, double square, double height, double side) {
        super(name, perimeter, square);
        this.height = height;
        this.side = side;
    }
    public Triangle(){

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(String name, double perimeter, double square) {
        super(name, perimeter, square);
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getSquare() {
        return super.getSquare();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
