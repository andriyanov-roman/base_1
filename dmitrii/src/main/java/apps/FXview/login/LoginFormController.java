package apps.FXview.login;

import apps.FXview.helpers.CloseWindow;
import apps.FXview.helpers.IIdSearchable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mit_OK! on 06.05.2015.
 */
public class LoginFormController implements IIdSearchable{
    private GridPane loginPane;
    private TextField usernameField;
    private Label warning;
    private Boolean isAuthorized = false;


    public void setLoginPane(GridPane loginPane) {
        this.loginPane = loginPane;
        initialize();
    }

    public Boolean getIsAuthorized() {
        return isAuthorized;
    }

    private void initialize() {
        ((Label) getElementById("a_lock", loginPane)).setText("\uf13e");
        ((Button)getElementById("o_Cancel",loginPane)).setOnAction(new CloseWindow(loginPane));
        warning = (Label)getElementById("auth_warning",loginPane);
        Button okButton = (Button) getElementById("o_OK",loginPane);
        usernameField = (TextField) getElementById("username",loginPane);
        usernameField.textProperty().addListener((observable, oldValue, newValue) -> {
            checkUsernameOnInput();
        });
        okButton.setOnAction(event -> checkCredentials());
    }
    public void checkUsernameOnInput (){
        System.out.println(usernameField.getText());
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
        ArrayList<Pair<String,String >> credentials = new ArrayList<>();
        credentials.add(new Pair<>("admin","1234"));
        credentials.add(new Pair<>("user", "F111"));
        credentials.add(new Pair<>("user2", "F222"));
        String username = ((TextField) getElementById("username", loginPane)).getText();
        String password = ((PasswordField) getElementById("password",loginPane)).getText();
        for (Pair<String, String> c : credentials){
            if (c.getKey().equals(username) && c.getValue().equals(password)){
                isAuthorized = true;
                Stage s = (Stage) loginPane.getScene().getWindow();
                s.close();
            } else {
                warning.setText("Incorrect credentials!!!");
            }
        }

    }
    private void loadUsers (){

    }
}
