package applications;

import mvc.controllers.FactoryController;

/**
 * Created by mit_OK! on 10.04.2015.
 */
public class FactoryApp extends ComApp {
    @Override
    public void run() {
        FactoryController.run();
    }
}
