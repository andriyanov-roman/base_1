package entities.figures;

/**
 * Created by user on 04.04.2015.
 */
public class Circle extends  Figure {
    double radius;

    public Circle() {}
    public Circle(String name, double radius) {
        this.radius = radius;
        this.setName(name);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle:" + this.getName()+
                ":" + radius;
    }
}
