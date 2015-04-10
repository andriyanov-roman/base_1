package entities.figures;

/**
 * Created by user on 04.04.2015.
 */
public class Circle extends Figure {
    public Circle() {
        setName(this.getClass().getSimpleName());
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*getDimension();
    }

    @Override
    public double getSquare() {
        return Math.PI*getDimension()*getDimension();
    }

    @Override
    public String toString() {
        return super.toString()+"(radius), S="+getSquare()+", P="+getPerimeter();
    }
}
