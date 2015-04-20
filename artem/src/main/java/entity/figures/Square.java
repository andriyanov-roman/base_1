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

    @Override
    protected void setName(String name) {
        this.name = name;
    }

    @Override
    protected void calculatePerimeter() {
        perimeter = side*4;
    }

    @Override
    protected void calculateSquare() {
        square = side*side;
    }
}
