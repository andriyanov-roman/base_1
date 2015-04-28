package entity.figures;

import entity.figures.interf.IParameters;

/**
 * Created by R-Tem on 20.04.2015.
 */
abstract class AbsFigure implements IParameters {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
