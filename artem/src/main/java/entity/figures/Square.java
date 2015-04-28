package entity.figures;

/**
 * Created by R-Tem on 20.04.2015.
 */
public class Square extends AbsFigure {
    private String name;
    private double side;

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

    @Override
    public double calculatePerimeter() {
        return side*4;
    }
    @Override
    public double calculateSquare() {
         return side*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name = '" + name + '\'' +
                ", side = " + side +
                '}';
    }
}
