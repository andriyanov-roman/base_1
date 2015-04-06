package geometric_shapes;

/**
 * Created by user on 03.04.2015.
 */
public class Triangle extends Shape{
    public int sideTriangle;
    public double height;

    public Triangle() {
    }

    public Triangle(String name, Double perimeter, Double square, int sideTriangle, double height) {
        super(name, perimeter, square);
        this.sideTriangle = sideTriangle;
        this.height = height;
    }

    public int getSideTriangle() {
        return sideTriangle;
    }

    public void setSideTriangle(int sideTriangle) {
        this.sideTriangle = sideTriangle;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Triangle" +
                "side=" + sideTriangle +
                ", height=" + height +
                '}';
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
