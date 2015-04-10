package entity.figures;

/**
 * Created by user on 04.04.2015.
 */
public class Figure {
    private String name;
    private double perimeter;
    private double square;

    public Figure(String name, double perimeter, double square) {
        this.name = name;
        this.perimeter = perimeter;
        this.square = square;
    }
    public Figure(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return 0.0;
    }


    public double getSquare() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                ", perimeter=" + perimeter +
                ", square=" + square +
                '}';
    }
}
