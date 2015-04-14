package apps.main;

import apps.company.CompanyApp;
import entities.CommonApp;
import apps.factory.FactoryApp;
import apps.figure.FigureApp;
import apps.univer.UniverApp;

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
        MainView view = new MainView();
        view.showMainMenu();
        switch (view.next()){
            case "1":
                return new CompanyApp();
            case "2":
                return new FactoryApp();
            case "3":
                return new UniverApp();
            case "4":
                return new FigureApp();
            case "EXIT":
                return null;
            default:
                view.alert("No such case");
                view = null;
                return getUserInput();
        }
    }
}
