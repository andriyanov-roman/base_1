package apps.FXview.login;
import apps.FXview.DaemonApp;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static apps.FXview.helpers.IdFinder.getElementById;

/**
 * Created by mit_OK! on 06.05.2015.
 */
public class LoginFormController {
    private DaemonApp app;
    private GridPane loginPane;
    private TextField usernameField;
    private Label warning;
    private Boolean isAuthorized = false;


    public void load(GridPane loginPane, DaemonApp app) {
        this.app = app;
        this.loginPane = loginPane;
        initialize();
    }

    public Boolean getIsAuthorized() {
        return isAuthorized;
    }

    private void initialize() {
        ((Label) getElementById("a_lock", loginPane)).setText("\uf13e");
        ((Button) getElementById("o_Cancel", loginPane)).setOnAction(event -> System.exit(0));
        warning = (Label) getElementById("auth_warning", loginPane);
        Button okButton = (Button) getElementById("o_OK", loginPane);
        usernameField = (TextField) getElementById("username", loginPane);
        usernameField.textProperty().addListener((observable, oldValue, newValue) -> {
            checkUsernameOnInput();
        });
        okButton.setOnAction(event -> checkCredentials());
    }
    public void checkUsernameOnInput (){
        Pattern pattern = Pattern.compile("\\W");
        Matcher matcher = pattern.matcher(usernameField.getText());
        if (matcher.find()){
            warning.setText("Only letters and digits avaliable!");
            usernameField.setStyle("-fx-text-fill: derive(red, 0%)");
        } else {
            warning.setText("");
            usernameField.setStyle("");
        }
    }
    private void checkCredentials (){
        ArrayList<User> users = JSONProcessor.getUsers("dmitrii/src/main/resources/Users.json");
        String username = ((TextField) getElementById("username", loginPane)).getText();
        String password = ((PasswordField) getElementById("password",loginPane)).getText();
        for (User user : users){
            if (user.getLogin().equals(username)){
                if (user.getPassword().equals(password)){
                    isAuthorized = true;
                    app.setCurrentUser(user);
                    Stage stage = (Stage)loginPane.getScene().getWindow();
                    stage.close();
                    return;
                } else {
                    warning.setText("Wrong PASSWORD!");
                    return;
                }
            }
        }
        warning.setText("Wrong USERNAME!");
    }
}
