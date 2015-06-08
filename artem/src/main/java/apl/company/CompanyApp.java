package apl.company;

import entities.CommonApp;

/**
 * Created by R-Tem on 17.05.2015.
 */
public class CompanyApp extends CommonApp {
    @Override
    public void run() {
        view = new CompanyView();
        model = new CompanyModel();
        CompanyController controller = new CompanyController((CompanyView)view, (CompanyModel)model); //почему необходимо явное преобразование типа?
    }
}
