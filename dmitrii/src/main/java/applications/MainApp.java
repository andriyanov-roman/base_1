package applications;

import mvc.views.MainView;

import java.util.ArrayList;

/**
 * Created by mit_OK! on 10.04.2015.
 */
public class MainApp extends ComApp {
    @Override
    public void run() {
        ComApp application;
        while ( (application = getUserInput()) != null ){
            System.out.println("\t\t...Running instance of \'"+
                    application.getClass().getSimpleName().split("App")[0].toUpperCase()
                    +"\' application...");
            application.run();
        }
        System.exit(0);
    }
    public ComApp getUserInput (){
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
