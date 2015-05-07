package apps.FXview.login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import tools.FileUtil;

import java.io.File;
import java.net.URL;

/**
 * Created by mit_OK! on 06.05.2015.
 */
public class LoginApp extends Application {
    GridPane gp;
    @Override
    public void start(Stage primaryStage) throws Exception {
        File f = new File("dmitrii\\src\\main\\java\\apps\\FXview\\login\\LoginForm.fxml");
        URL url = f.toURL();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(url);
        gp = loader.load();
        LoginFormController controller = loader.getController();
        controller.setMainApp(this);
        Scene scene = new Scene(gp);
        TextField username = new TextField("ffffff");
        for (int i = 0; i < gp.getChildren().size(); i++) {
            if ("username".equals(gp.getChildrenUnmodifiable().get(i).getId())){
                username = (TextField) gp.getChildrenUnmodifiable().get(i);
                break;
            }
        }
        Label lockLabel = (Label) getElementById("a_lock",gp);
        lockLabel.setText("\uf13e");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    public void writeToFile (String txt){
        TextField username = new TextField("ffffff");
        for (int i = 0; i < gp.getChildren().size(); i++) {
            if ("username".equals(gp.getChildrenUnmodifiable().get(i).getId())){
                username = (TextField) gp.getChildrenUnmodifiable().get(i);
                break;
            }
        }
        //System.out.println(username.getText());
        //FileUtil.WriteToFile(username.getText(),"F:\\WEB\\_repositories\\base_test\\dmitrii\\src\\main\\java\\apps\\login\\RRRRR.txt",true);
    }
    public Node getElementById (String id, Parent parent){
        for (Node i : parent.getChildrenUnmodifiable()) {
            if (id.equals(i.getId())){
                return i;
            }
        }
        return null;
    }
}
