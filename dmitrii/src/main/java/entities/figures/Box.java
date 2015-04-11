package entities.figures;

import java.util.ArrayList;

/**
 * Created by mit_OK! on 09.04.2015.
 */
public class Box {
    private double square;
    private double limit;
    private ArrayList<Figure> figures;

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getSquare() {
        return square;
    }

    private void setSquare() {
        square = 0.0;
        for (int i = 0; i < this.figures.size(); i++) {
            square += this.figures.get(i).getSquare();
        }
    }

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
        setSquare();
    }

    public void setFigures(Figure f) {
        if (figures != null) {
            this.figures.add(f);
        } else {
            ArrayList<Figure> figures = new ArrayList<>();
            figures.add(f);
            this.figures = figures;
        }
        setSquare();
    }
}
