package apps.company;

import entities.CommonApp;

/**
 * Created by mit_OK! on 10.04.2015.
 */
public class CompanyApp extends CommonApp {
    @Override
    public void run() {
        CompanyModel model = new CompanyModel();
        CompanyView view = new CompanyView();
        new CompanyController(view, model);
    }
}
