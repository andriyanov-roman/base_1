package entity.figures;

/**
 * Created by R-Tem on 20.04.2015.
 */
public class Square extends AbsFigure {
    private String name;
    private double side;
    private double perimeter;
    private double square;

    public Square(String name, double side) {
        this.name = name;
        this.side = side;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return perimeter;
    }
    public double getSquare() {
        return square;
    }

    @Override
    public double calculatePerimeter() {
        return side*4;
    }
    @Override
    public double calculateSquare() {
         return side*side;
    }
}
