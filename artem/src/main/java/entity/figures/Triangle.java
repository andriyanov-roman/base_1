package entity.figures;

public class Triangle extends AbsFigure {
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
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public double calculatePerimeter() {
        return side*3;
    }
    @Override
    public double calculateSquare() {
        return (height * side)/2;
    }
}
