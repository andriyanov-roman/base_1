package apps.reports;

import entities.CommonApp;

import java.util.ArrayList;

/**
 * Created by mit_OK! on 25.04.2015.
 */
public class ReportDisplayingApp extends ReportCommonApp {
    public ReportDisplayingApp(CommonApp app) {
        super(app);
    }

    @Override
    public void run() {
        System.out.println(app.generateReport());
    }


}
