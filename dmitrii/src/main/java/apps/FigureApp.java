package apps;

import mvc.controllers.FigurerController;
import mvc.models.FigureModel;
import mvc.views.FigurerView;

/**
 * Created by mit_OK! on 09.04.2015.
 */
public class FigureApp extends Application {
    public static void run() {
        FigureModel model = new FigureModel(getWorkFolder());
        FigurerView view = new FigurerView();
        FigurerController controller = new FigurerController(model, view);
        controller.run();
    }
}
