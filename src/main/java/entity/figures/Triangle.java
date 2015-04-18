package entity.figures;

/**
 * Created by Администратор on 04.04.2015.
 */
public class Triangle extends Figure {
    private int side;
    private double height;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getSquare() {
        return 0;
    }
}
