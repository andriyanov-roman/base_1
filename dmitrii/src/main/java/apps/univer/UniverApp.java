package apps.univer;

import entities.CommonApp;

/**
 * Created by mit_OK! on 07.04.2015.
 */
public class UniverApp extends CommonApp {
    @Override
    public void run() {
        UniverModel model = new UniverModel(getWorkFolder()+"\\universities");
        UniverView view = new UniverView();
        UniverController controller = new UniverController(model, view);
        controller.run();
    }

    @Override
    public String generateReport() {
        return "";
    }
}
