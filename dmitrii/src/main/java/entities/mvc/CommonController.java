package entities.mvc;

/**
 * Created by mit_OK! on 06.04.2015.
 */
public class CommonController {
    /*private CommonModel model;*/
    //private CommonView view;
    public Boolean isDone = false;

   /* public CommonController( CommonView view) {
        //this.model = model;
        this.view = view;
    }*/

    public CommonController() {
    }

    public void run() {
        isDone = true;
        while (isDone) {
            //view.showMainMenu();
            isDone = executeTasks();
        }
    }

    public Boolean executeTasks() {
        return true;
    }
}
