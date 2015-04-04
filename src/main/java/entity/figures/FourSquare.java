package entity.figures;

/**
 * Created by Администратор on 04.04.2015.
 */
public class FourSquare extends Figure {
    private int side;

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public double getSquare() {
        return this.side * this.side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
