package Shapes.entity;

public class Container extends Shape {
    private Double squareContainer;

    Container(){

    }

    public Double getSquareContainer() {
        return squareContainer;
    }

    public void setSquareContainer(Double squareContainer) {
        this.squareContainer = squareContainer;
    }

    public Container(String name, Double perimeter, Double square, Double squareContainer) {
        super(name, perimeter, square);
        this.squareContainer = squareContainer;
    }

    @Override
    public String toString() {
        return "Container{" +
                "squareContainer=" + squareContainer +
                '}';
    }
}
