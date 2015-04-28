package apps.FXview;

import apps.factory.FactoryController;
import javafx.fxml.FXML;


public class MainWindowController {
    private DaemonApp mainApp;

    @FXML
    private void runCompanyApp (){
        mainApp.loadCompanyApp();
    }
    @FXML
    private void loadFactoryApp(){
        System.out.println("loading Factory App");
        FactoryController.run();
    }
    public void setMainApp(DaemonApp mainApp) {
        this.mainApp = mainApp;

        // Add observable list data to the table
        //personTable.setItems(mainApp.getPersonData());
    }

}
