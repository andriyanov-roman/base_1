package fx;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by user on 25.04.2015.
 */
public class SimpleMenu extends Application{

    @Override
    public  void  start (Stage primaryStage) throws Exception{
        primaryStage.setTitle ("JavaFX Welcome");
        primaryStage.show();

    }

    public static  void  main(String [] args) {
        launch(args);
    }
}
