package geometric_shapes;

/**
 * Created by user on 03.04.2015.
 */
public class Triangle extends Shape{
    public Double sideTriangle;
    public Double height;

    public Triangle() {
    }

    public Triangle(String name, Double perimeter, Double square, Double sideTriangle, Double height) {
        super(name, perimeter, square);
        this.sideTriangle = sideTriangle;
        this.height = height;
    }

    public Double getSideTriangle() {
        return sideTriangle;
    }

    public void setSideTriangle(Double sideTriangle) {
        this.sideTriangle = sideTriangle;
    }

    public Double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Triangle" +
                "side=" + sideTriangle +
                ", height=" + height +
                '}';
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
