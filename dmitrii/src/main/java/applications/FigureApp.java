package applications;

import mvc.controllers.FigurerController;
import mvc.models.FigureModel;
import mvc.views.FigureView;

/**
 * Created by mit_OK! on 09.04.2015.
 */
public class FigureApp extends ComApp {
    @Override
    public void run() {
        FigureModel model = new FigureModel(getWorkFolder()+"\\figures");
        FigureView view = new FigureView();
        FigurerController controller = new FigurerController(model, view);
        controller.run();
    }
}
