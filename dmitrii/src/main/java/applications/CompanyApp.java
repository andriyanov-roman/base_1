package applications;

import mvc.controllers.CompanyController;

import java.io.IOException;

/**
 * Created by mit_OK! on 10.04.2015.
 */
public class CompanyApp extends ComApp {
    @Override
    public void run() {
        try {
            CompanyController.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
