package home_works.geometric_shapes.geometric_shapes;

/**
 * Created by user on 03.04.2015.
 */
public  class Shape {
    private String name;
    private Double perimeter;
    private Double square;

    public Shape() {
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", perimeter=" + perimeter +
                ", square=" + square +
                '}';
    }

    public Shape(String name, Double perimeter, Double square) {
        this.name = name;
        this.perimeter = perimeter;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPerimeter() {
        return 0.0;
    }



    public Double getSquare() {
        return 0.0;
    }


}
