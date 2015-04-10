package entities.figures;

/**
 * Created by user on 04.04.2015.
 */
public class FourSquare extends Figure {
    public FourSquare() {
        setName(this.getClass().getSimpleName());
    }

    @Override
    public double getPerimeter() {
        return getDimension()*4;
    }

    @Override
    public double getSquare() {
        return getDimension() * getDimension();
    }

    @Override
    public String toString() {
        return super.toString()+", S="+getSquare()+", P="+getPerimeter();
    }
}
