package mvc.controllers;

import mvc.models.CommonModel;
import mvc.views.CommonView;

/**
 * Created by mit_OK! on 06.04.2015.
 */
public class CommonController {
    /*private CommonModel model;*/
    private CommonView view;
    public Boolean isRun = false;

    public CommonController( CommonView view) {
        //this.model = model;
        this.view = view;
    }

    public CommonController() {
    }

    public void run() {
        isRun = true;
        while (isRun) {
            view.showMainMenu();
            isRun = executeTasks();
        }
        System.exit(0);
    }

    public Boolean executeTasks() {
        return true;
    }
}
