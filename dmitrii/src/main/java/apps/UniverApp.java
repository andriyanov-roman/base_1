package apps;

import mvc.controllers.UniverController;
import mvc.models.UniverModel;
import mvc.views.UniverView;

/**
 * Created by mit_OK! on 07.04.2015.
 */
public class UniverApp extends Application {
    public static void run() {
        UniverModel model = new UniverModel(getWorkFolder()+"\\universities");
        UniverView view = new UniverView();
        UniverController controller = new UniverController(model, view);
        controller.run();
    }
}
