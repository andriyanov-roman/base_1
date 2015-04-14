package apps.figure;

import entities.CommonApp;

/**
 * Created by mit_OK! on 09.04.2015.
 */
public class FigureApp extends CommonApp {
    @Override
    public void run() {
        FigureModel model = new FigureModel(getWorkFolder()+"\\figures");
        FigureView view = new FigureView();
        FigurerController controller = new FigurerController(model, view);
        controller.run();
    }
}
