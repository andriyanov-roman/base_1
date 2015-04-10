package entity.figures;

/**
 * Created by user on 04.04.2015.
 */
public class FourSquare extends Figure {
    private int side;

   /* @Override
    public double getPerimetr() {
        return side*4;
    }*/

    @Override
    public double getSquare() {
        return this.side * this.side;
    }
}
