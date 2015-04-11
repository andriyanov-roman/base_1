package mvc.models;

import entities.figures.*;
import entities.file_tools.ComFileTool;

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
        super.setFolderPath(folderPath);
        Figure f;
        ComFileTool tool = new ComFileTool(folderPath + "\\Figures.txt", ":");
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
    public void saveToFile(){
        String dump = "";
        ComFileTool tool = new ComFileTool(getFolderPath() + "\\figures\\Figures.txt", ":");
        for (int i = 0; i < box.getFigures().size(); i++) {
            dump += box.getFigures().get(i).getName()+tool.getRegExp()+
                    box.getFigures().get(i).getDimension();
            if (box.getFigures().get(i) instanceof Triangle){
                dump += tool.getRegExp()+((Triangle) box.getFigures().get(i)).getHeight()+"\n";
            } else {
                dump += "\n";
            }
        }
        tool.writeToFile(dump,false);
    }

}
