package home_task5;

public class Shape {
    public Shape() {
    }

    Shape(String name, double square, double perimetr) {
        this.name = name;
        this.square = square;
        this.perimetr = perimetr;
    }

    private String name;
    private double square;
    private double perimetr;

    public String getName() {
        return name;
    }

    public double getSquare() {
        return square;
    }

    public double getPerimetr() {
        return perimetr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setPerimetr(double perimetr) {
        this.perimetr = perimetr;
    }


}
