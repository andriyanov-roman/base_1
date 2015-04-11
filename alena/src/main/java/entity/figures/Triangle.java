package entity.figures;

/**
 * Created by user on 04.04.2015.
 */
public class Triangle extends Figure {
    private int side;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }


    @Override
    public double getPerimetr() {
        return side*3;
    }

    @Override
    public double getSquare() {
        return side * side * side;
    }
}
