package apps.main;

import entities.CommonApp;
import entities.mvc.CommonView;

/**
 * Created by mit_OK! on 10.04.2015.
 */
public class MainView extends CommonView {
    @Override
    public void showMainMenu() {
        alert("\nAPPLICATIONS MENU");
        showAppsList();
        alert("5. Generate Report and Show");
        alert("6. Generate Report and Save to File");
        alert("EXIT. Shutdown program");
        alertInline("Your choice: ");
    }

    public void showAppsList() {
        alert("1. Company application");
        alert("2. Factory application");
        alert("3. University application");
        alert("4. Figure application");
    }

    public int selectApp(int appsQuantity) {
        showAppsList();
        int appNumber = -1;
        while (appNumber < 0 || appNumber > appsQuantity) {
            alert("There are ["+appsQuantity+"] applications available");
            alertInline("Select Number of application: ");
            try {
                appNumber = Integer.parseInt(scanner.next())-1;
            } catch (NumberFormatException e) {
                alert("Input the NUMBER, pls!");
            }
        }
        return appNumber;
    }
}
