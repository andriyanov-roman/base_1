package apl.company;

import entities.mvc.CommonController;

/**
 * Created by R-Tem on 17.05.2015.
 */
public class CompanyController extends CommonController {
    CompanyView view;
    CompanyModel model;

    public CompanyController(CompanyView view, CompanyModel model) {
        this.view = view;
        this.model = model;
    }
}
