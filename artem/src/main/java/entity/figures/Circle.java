package entity.figures;

/**
 * Created by R-Tem on 20.04.2015.
 */
public class Circle extends AbsFigure {
    private String name;
    private double radius;
    private double perimeter;
    private double square;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }
    //    @Override
    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = Math.PI*2*radius;
    }
    @Override
    public void calculateSquare() {
        square = Math.PI*radius*radius;
    }
}
