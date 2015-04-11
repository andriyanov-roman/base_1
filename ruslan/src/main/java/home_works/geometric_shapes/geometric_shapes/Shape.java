package home_works.geometric_shapes.geometric_shapes;

/**
 * Created by user on 03.04.2015.
 */
public abstract class Shape {
    private String name;
    private double perimeter;
    private double square;

    public Shape() {
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", perimeter=" + perimeter +
                ", square=" + square +
                '}';
    }

    public Shape(String name, Double perimeter, Double square) {
        this.name = name;
        this.perimeter = perimeter;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getPerimeter();


    public abstract double getSquare();


}
