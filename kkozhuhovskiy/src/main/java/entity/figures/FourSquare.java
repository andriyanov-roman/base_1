package entity.figures;

/**
 * Created by Kirill on 04.04.2015.
 */
public class FourSquare extends Figure {

    private int side;

    @Override
    public double getPerimetr() {
        return this.side * 4;
    }

    @Override
    public double getSquare() {
        return this.side * this.side;
    }
}
