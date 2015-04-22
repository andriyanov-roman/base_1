package entity.figures;

import java.awt.*;

/**
 * Created by R-Tem on 20.04.2015.
 */
abstract class AbstractFigure {

//    abstract protected void setName(String name);

    abstract protected void calculatePerimeter(); // почему abstract не может быть private
    abstract protected void calculateSquare();
}
