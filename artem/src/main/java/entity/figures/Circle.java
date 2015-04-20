package entity.figures;

import homework.Main;

/**
 * Created by R-Tem on 20.04.2015.
 */
public class Circle extends AbstractFigure {
    private String name;
    private double radius;
    private double perimeter;
    private double square;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void calculatePerimeter() {
        perimeter = Math.PI*2*radius;
    }

    @Override
    protected void calculateSquare() {
        square = Math.PI*radius*radius;
    }
}
