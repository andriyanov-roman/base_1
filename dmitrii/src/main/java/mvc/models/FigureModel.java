package mvc.models;

import entities.figures.*;
import file_tools.ComFileTool;

/**
 * Created by mit_OK! on 09.04.2015.
 */
public class FigureModel extends CommonModel {
    private static final int TYPE_OF_FIGURE = 0;
    private static final int SIZE_OF_SIDE = 1;
    private static final int SIZE_OF_HEIGHT = 2;
    private Box box = new Box();

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public FigureModel(String folderPath) {
        Figure f;
        ComFileTool tool = new ComFileTool(folderPath + "\\figures\\Figures.txt", ":");
        for (int i = 0; i < tool.readFromFile().size(); i++) {
            String[] parameter = tool.readFromFile().get(i);
            switch (parameter[TYPE_OF_FIGURE]) {
                case "Circle":
                    f = new Circle();
                    f.setDimension(Double.valueOf(parameter[SIZE_OF_SIDE]));
                    box.setFigures(f);
                    break;
                case "Foursquare":
                    f = new FourSquare();
                    f.setDimension(Double.valueOf(parameter[SIZE_OF_SIDE]));
                    box.setFigures(f);
                    break;
                case "Triangle":
                    f = new Triangle(Double.valueOf(parameter[SIZE_OF_HEIGHT]));
                    f.setDimension(Double.valueOf(parameter[SIZE_OF_SIDE]));
                    box.setFigures(f);
                    break;
                default:
                    //Error Log
            }
        }
    }

}
