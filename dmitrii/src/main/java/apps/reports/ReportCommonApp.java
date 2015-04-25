package apps.reports;

import entities.CommonApp;

/**
 * Created by mit_OK! on 25.04.2015.
 */
abstract public class ReportCommonApp extends CommonApp {
    protected CommonApp app;

    public ReportCommonApp(CommonApp app) {
        this.app = app;
    }

    @Override
    public String generateReport() {
        return "";
    }
}
