package entity.figures;

import java.awt.*;

/**
 * Created by R-Tem on 20.04.2015.
 */
abstract class AbsFigure implements IParameter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
