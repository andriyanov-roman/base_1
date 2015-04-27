package entity.figures;

import java.awt.*;

/**
 * Created by R-Tem on 20.04.2015.
 */
abstract class AbsFigure /*implements IParameter*/ {
    private String name;
    private double per;
    private double sq;

    abstract protected void calculatePerimeter(); // почему abstract не может быть private
    abstract protected void calculateSquare();
}
