package apps.login;

import javafx.fxml.FXML;

/**
 * Created by mit_OK! on 06.05.2015.
 */
public class LoginFormController {
    private LoginApp mainApp;

    public void setMainApp(LoginApp mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    public void login (){
        mainApp.writeToFile("");
    }
}
