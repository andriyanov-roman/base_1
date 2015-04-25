package entities;

import apps.reports.IReport;
import entities.mvc.CommonModel;
import entities.mvc.CommonView;

/**
 * Created by mit_OK! on 07.04.2015.
 */
abstract public class CommonApp implements IReport {
    protected CommonView view;
    protected CommonModel model;
    private static String workFolder = "dmitrii\\src\\main\\resources";

    public static String getWorkFolder() {
        return workFolder;
    }

    abstract public void run();


}
