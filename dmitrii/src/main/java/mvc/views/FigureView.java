package mvc.views;

import entities.figures.Circle;
import entities.figures.Figure;
import entities.figures.FourSquare;
import entities.figures.Triangle;

/**
 * Created by mit_OK! on 09.04.2015.
 */
public class FigureView extends CommonView {
    private static final Double INPUT_LIMIT=1000000.0;
    @Override
    public void showMainMenu() {
        alert("");
        alert("0. Show all figures (with Square and Perimeter)");
        alert("1. Find figure with MAX Square and MAX Perimeter");
        alert("2. Add figure");
        alert("e. (or \'exit\') Save and Exit");
        alertInline("Your choice: ");
    }

    public double dialogSetLimit(Double square) {
        return fillInDoublePosField("Set limit (Box has square "+square+"): ",INPUT_LIMIT);
    }

    public Figure dialogAddFigure() {
        alertInline("Input figure type (Circle, FourSquare or Triangle): ");
        String input = next();
        Double side = fillInDoublePosField("Set dimension (side / radius): ",INPUT_LIMIT);
        switch (input){
            case "Circle":
                Figure c = new Circle();
                c.setDimension(side);
                return c;
            case "FourSquare":
                Figure f = new FourSquare();
                f.setDimension(side);
                return f;
            case "Triangle":
                Triangle t = new Triangle();
                t.setDimension(side);
                t.setHeight(fillInDoublePosField("Height: ", INPUT_LIMIT));
                return t;
            default:
                alert("Figure \'"+input+"\' NOT FOUND. Try again");
                return dialogAddFigure();
        }
    }

    public void msgBoxFull(double square, double limit) {
        alert("\tWe can't add new Figure, because BOX (S="+square+") limit is "+limit);
    }
}
