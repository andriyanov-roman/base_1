package entity.figures;

/**
 * Created by user on 04.04.2015.
 */
public class FourSquare extends Figure {
    private double side;



    public FourSquare(String name, double perimeter, double square, double side) {
        super(name, perimeter, square);
        this.side = side;
    }
    public FourSquare(){

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        super.getPerimeter();
        return this.side*4;
    }

    @Override
    public double getSquare() {
        super.getSquare();
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
