package home_task5;


public class Square extends Shape {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square() {
    }

    public Square(String name, double square, double perimetr, double side) {
        super(name, square, perimetr);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Квадрат" + "cо" + "стороной " + side;
    }
}
