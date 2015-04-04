package home_task5;


public class Triagle extends Shapes {
    private double height;
    private double side;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Triagle() {
    }

    public Triagle(String name, double side, double height, double square, double perimetr) {
        super(name, square, perimetr);
        this.side = side;
        this.height = height;

    }

    @Override
    public String toString() {
        return "Треугольник" + "со" + "стороной " + side + ", высотой " + height;
    }
}

