package mvc.views;

/**
 * Created by mit_OK! on 10.04.2015.
 */
public class MainView extends CommonView {
    @Override
    public void showMainMenu() {
        alert("\nAPPLICATIONS MENU");
        alert("1. Company application");
        alert("2. Factory application");
        alert("3. University application");
        alert("4. Figure application");
        alert("EXIT. Shutdown program");
        alertInline("Your choice: ");
    }
}
