package entities.figures;

/**
 * Created by user on 04.04.2015.
 */
public class FourSquare extends  Figure  {
    private double side;

    public FourSquare() {}
    public FourSquare(String name, double side) {
        this.setName(name);
        this.side = side;
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
    @Override
    public double getArea(){
        return this.side*this.side;
    }

    @Override
    public String toString() {
        return "FourSquare:" + this.getName()+
                ":" + side;
    }
}
