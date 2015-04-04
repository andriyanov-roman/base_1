package entities.figures;

/**
 * Created by user on 04.04.2015.
 */
public class Triangle extends  Figure  {
    private double side;
    private  double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter(){
        return this.side * 4;
    }

}
