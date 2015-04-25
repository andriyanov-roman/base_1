package apps.factory;

import entities.CommonApp;

/**
 * Created by mit_OK! on 10.04.2015.
 */
public class FactoryApp extends CommonApp {
    @Override
    public void run() {
        FactoryController.run();
    }

    @Override
    public String generateReport() {
        return "";
    }
}
