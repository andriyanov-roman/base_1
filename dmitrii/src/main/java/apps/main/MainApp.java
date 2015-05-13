package apps.main;

import apps.company.CompanyApp;
import apps.reports.ReportSavingApp;
import apps.reports.ReportDisplayingApp;
import entities.CommonApp;
import apps.factory.FactoryApp;
import apps.figure.FigureApp;
import apps.univer.UniverApp;
import entities.mvc.CommonView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mit_OK! on 10.04.2015.
 */
public class MainApp extends CommonApp {
    @Override
    public void run() {
        CommonApp application;
        while ( (application = getUserInput()) != null ){
            System.out.println("\t\t...Running instance of \'"+
                    application.getClass().getSimpleName().split("App")[0].toUpperCase()
                    +"\' application...");
            application.run();
        }
        System.exit(0);
    }
    public CommonApp getUserInput (){
        ArrayList<CommonApp> apps = new ArrayList<>(Arrays.asList(
                new CompanyApp(),new FactoryApp(),new UniverApp(),new FigureApp()));
        MainView view = new MainView();
        view.showMainMenu();
        switch (CommonView.next()){
            case "1":
                return apps.get(0);
            case "2":
                return apps.get(1);
            case "3":
                return apps.get(2);
            case "4":
                return  apps.get(3);
            case "5":
                int n = view.selectApp(apps.size());
                return new ReportDisplayingApp(apps.get(n));
            case "6":
                int j = view.selectApp(apps.size());
                return new ReportSavingApp(apps.get(j));
            case "EXIT":
                return null;
            default:
                view.alert("No such case");
                view = null;
                return getUserInput();
        }
    }

    @Override
    public String generateReport() {
        return "";
    }
}
