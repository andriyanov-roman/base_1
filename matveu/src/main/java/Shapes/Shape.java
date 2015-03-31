package Shapes;

public class Shape  {
    private String name;
    private Double perimeter;
    private Double square;

    public Shape(){

    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", perimeter=" + perimeter +
                ", square=" + square +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    public Shape(String name, Double perimeter, Double square) {
        this.name = name;
        this.perimeter = perimeter;
        this.square = square;
    }
}
