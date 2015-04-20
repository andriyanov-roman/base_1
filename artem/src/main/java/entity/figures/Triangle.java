package entity.figures;

public class Triangle extends AbstractFigure{
    private String name;
    private double side;
    private double height;
    private double perimeter;
    private double square;

    public Triangle(String name, double side, double height) {
        this.name = name;
        this.side = side;
        this.height = height;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void calculatePerimeter() {
        perimeter = side*3;
    }
    @Override
    protected void calculateSquare() {
        square = (height * side)/2;
    }
}
