package entities.figures;

/**
 * Created by user on 04.04.2015.
 */
public class Figure {
    private String name;
    private double dimension;
    private double perimeter;
    private double square;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public double getPerimeter() {
        return 0.0;
    }


    public double getSquare() {
        return 0.0;
    }

    @Override
    public String toString() {
        return name + ": " +
                " dimension=" + dimension;
    }
}
