package entity.figures;

import java.awt.*;

/**
 * Created by R-Tem on 20.04.2015.
 */
abstract class AbstractFigure {
    private String name;
    private double perimeter;
    private double square;

    protected abstract void setName(String name);

    abstract protected void calculatePerimeter(); // почему abstract не может быть private
    abstract protected void calculateSquare();
}
