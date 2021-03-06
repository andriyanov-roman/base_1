package apps.figure;

import entities.figures.Figure;
import entities.mvc.CommonController;
import entities.mvc.CommonView;

/**
 * Created by mit_OK! on 09.04.2015.
 */
public class FigurerController extends CommonController {
    private FigureModel model;
    private FigureView view;

    public FigurerController(FigureModel model, FigureView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void run() {
         isDone = true;
        while (isDone) {
            //view.showMainMenu();
            isDone = executeTasks();
        }
    }

    @Override
    public Boolean executeTasks() {
        switch (CommonView.next()) {
            case "0":
                showAllFigures();
                break;
            case "1":
                findMaxFigure();
                break;
            case "2":
                addFigure();
                break;
            case "exit":
            case "Exit":
            case "e":
            case "E":
                model.saveToFile();
                return false;
            default:
                view.alert("No such case");
        }
        return true;
    }

    private void showAllFigures() {
        for (int i = 0; i < model.getBox().getFigures().size(); i++) {
            view.alert(model.getBox().getFigures().get(i)+"");
        }
        view.alert("Box square: " + model.getBox().getSquare());
    }

    private void addFigure() {
        model.getBox().setLimit(view.dialogSetLimit(model.getBox().getSquare()));
        Figure f = new Figure();
        Boolean wasAdded = false;
        while (model.getBox().getSquare()<model.getBox().getLimit()){
            f = view.dialogAddFigure();
            if (f.getSquare()+model.getBox().getSquare()<model.getBox().getLimit()){
                model.getBox().setFigures(f);
                view.alert("\t[ADDED]");
                wasAdded = true;
            } else break;
        }
        view.msgBoxFull(model.getBox().getSquare(),model.getBox().getLimit());
        if (wasAdded == true) {
            view.alert("\tSquare of new Figure is: "+f.getSquare()+
                    "("+(model.getBox().getLimit()-model.getBox().getSquare()-f.getSquare())+")");
        }
    }

    private void findMaxFigure() {
        Figure maxFigure = model.getBox().getFigures().get(0);
        for (int i = 0; i < model.getBox().getFigures().size(); i++) {
            Figure iFigure = model.getBox().getFigures().get(i);
            if (iFigure.getSquare()>maxFigure.getSquare() &&
                    iFigure.getPerimeter()>maxFigure.getPerimeter()){
                maxFigure = iFigure;
            }
        }
        view.alert(maxFigure.toString());
    }
}
