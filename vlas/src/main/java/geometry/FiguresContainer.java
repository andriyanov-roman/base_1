package geometry;

import entity.figures.Figure;

import java.util.ArrayList;

/**
 * Created by user on 04.04.2015.
 */
public class FiguresContainer {

    public ArrayList<Figure> figures;

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }
}
