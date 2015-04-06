package ua;


public class ShapesValidator {

    public boolean isSideValid(double side) {
        if(side > 10) {
            return true;
        }
        return false;
    }

    public void getPreFigure(int side, int perimeter) {
        PreFigure figure = new PreFigure();
        figure.side = side;
        figure.perimeter = perimeter;
    }

    public class PreFigure {
        int side;
        int perimeter;
    }

}
