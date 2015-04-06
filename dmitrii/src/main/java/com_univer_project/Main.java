package com_univer_project;

import mvc.controllers.UniverController;
import mvc.models.UniverModel;
import mvc.views.UniverView;

/**
 * Created by mit_OK! on 06.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        UniverModel model = new UniverModel("dmitrii\\src\\main\\resources\\universities");
        UniverView view = new UniverView();
        UniverController controller = new UniverController(model, view);
        controller.run();
    }
}
