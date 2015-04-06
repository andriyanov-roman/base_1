package entities.figures;

/**
 * Created by user on 04.04.2015.
 */
public class Triangle extends  Figure  {
    public Triangle(String name, double side, double height) {
        this.setName(name);
        this.side = side;
        this.height = height;
    }
    public Triangle() {}

    private double side;
    private  double height;

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

    @Override
    public double getPerimeter(){
        return this.side * 3;
    }
    @Override
    public double getArea() {
        return this.side*this.height/2;
    }

    @Override
    public String toString() {
        return "Triangle:" + this.getName() + ':' +
                 side + ':'+ height;
    }
}
