package entities.figures;

/**
 * Created by user on 04.04.2015.
 */
public class Triangle extends Figure {
    private double height;

    public Triangle() {
        setName(this.getClass().getSimpleName());
    }
    public Triangle(double height) {
        this.height = height;
        setName(this.getClass().getSimpleName());
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return getDimension()*3;
    }

    @Override
    public double getSquare() {
        return (height * getDimension())/2;
    }

    @Override
    public String toString() {
        return super.toString()+"(side), height="+height+", S="+getSquare()+", P="+getPerimeter();
    }
}
