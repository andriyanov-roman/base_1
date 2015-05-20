package apps.streamloader.task13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by mit_OK! on 18.05.2015.
 */
public class DownLoaderTest extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        DaemonDownloaderView view = new DaemonDownloaderView();
        DaemonDownloaderModel model = new DaemonDownloaderModel();
        view.getController().setModel(model);
        Scene scene = new Scene(view.getRootGrid());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
