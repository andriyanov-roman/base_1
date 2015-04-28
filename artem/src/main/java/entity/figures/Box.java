package entity.figures;

import java.util.ArrayList;

/**
 * Created by R-Tem on 21.04.2015.
 */
public class Box extends AbsFigure{
    private double length;
    private double width;
    private double perimeter;
    private double square;
    private ArrayList<AbsFigure> figures;

    public Box(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return perimeter;
    }
    public double getSquare() {
        return square;
    }

    public ArrayList<AbsFigure> getFigures() {
        return figures;
    }
    public void setFigures(ArrayList<AbsFigure> figures) {
        this.figures = figures;
    }

    public void addFigures(AbsFigure f) {
        if (figures != null) {
            this.figures.add(f);
        } else {
            ArrayList<AbsFigure> figures = new ArrayList<>();
            figures.add(f);
            this.figures = figures;
        }
    }
    @Override
    public double calculatePerimeter() {
        return 2*(length + width);
    }
    @Override
    public double calculateSquare() {
        return length * width;
    }

    public Boolean vlezlo(){
        /* if(square >= circle.getSquare()+foursquare.getSquare()+triangle.getSquare()){
          && side1 >= circle.getRadius()+foursquare.getSide()+triangle.getSide()
          && side2 >= circle.getRadius()+foursquare.getSide()+triangle.getSide()
            return true;
        }
        else*/ return false;
    }
}
