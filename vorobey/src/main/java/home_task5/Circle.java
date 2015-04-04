package home_task5;


public class Circle extends Shapes {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    public Circle() {
    }

    public Circle(String name, double radius, double square, double perimetr) {
        super(name, square, perimetr);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Окружность"+" ,радиуом "+radius;
    }
}
