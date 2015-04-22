package entity.figures;

/**
 * Created by R-Tem on 20.04.2015.
 */
public class Square extends AbstractFigure {
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
    //    @Override
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
    public void calculatePerimeter() {
        perimeter = side*4;
    }
    @Override
    public void calculateSquare() {
        square = side*side;
    }
}
