package fx.login;

import javafx.fxml.FXML;
import javafx.stage.Stage;

/**
 * Created by PC XP on 08.05.15.
 */
public class LoginFormController {
    private LoginApp app;

    public void setApp(LoginApp loginApp) {
        this.app = loginApp;
    }

    @FXML
    public void login (){
        app.writeToFile("txt");
    }
    @FXML
    public void cancel (){
       Stage stage = (Stage) app.getGrid().getScene().getWindow();
        stage.close();
          }
}
