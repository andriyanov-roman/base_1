package entities.figures;

import java.util.ArrayList;

/**
 * Created by Администратор on 05.04.2015.
 */
public class Container {
    public Container() {
    }
    public Container(double area) {
        this.area = area;
    }
    private ArrayList<Figure> figures;

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Container{" +
                "figures=" + figures +
                ", area=" + area +
                '}';
    }
}
