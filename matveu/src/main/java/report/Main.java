package report;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        View.startProgramm();
        ForAllProgramsReport report = new ForAllProgramsReport();
        report.showReport(new FactoryReportImpl());
    }
}
