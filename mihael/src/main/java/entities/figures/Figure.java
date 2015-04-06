package entities.figures;

/**
 * Created by user on 04.04.2015.
 */
public class Figure {
    private  String name;
    private double perimeter;
    private double area;

    public double getPerimeter() {
        return 0.0;
    }

    public double getArea() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
