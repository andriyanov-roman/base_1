package apps.reports;

import entities.CommonApp;
import entities.file_tools.ComFileTool;

/**
 * Created by mit_OK! on 25.04.2015.
 */
public class ReportSavingApp extends ReportCommonApp {
    public ReportSavingApp(CommonApp app) {
        super(app);
    }

    @Override
    public void run() {
        ComFileTool fileTool = new ComFileTool();
        fileTool.setPath(getWorkFolder() + "\\reports\\Report_" + app.getClass().getSimpleName() + ".txt");
        fileTool.writeToFile(app.generateReport(),false);

    }
}
