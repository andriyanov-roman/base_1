package apps.streamloader.task13;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static apps.FXview.helpers.IdURLFinder.getElementByNodeType;

/**
 * Created by mit_OK! on 18.05.2015.
 */
public class DaemonDownloaderView {
    private static GridPane ourInstance;
    private static String FXMLpath = "dmitrii/src/main/java/apps/streamloader/task13/DaemonDownloader.fxml";

    public static GridPane getInstance() {
        URL url = null;
        try {
            url = new File(FXMLpath).toURL();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        FXMLLoader loader = new FXMLLoader();
        if (url!=null){
            loader.setLocation(url);
        }
        try {
            ourInstance = loader.load();
            if (ourInstance!=null){
                initialize ();
            } else {
                throw new NullPointerException("Loading Panel from "+FXMLpath+" failed!");
            }
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
        return ourInstance;
    }

    private DaemonDownloaderView() {
    }
    private static void initialize (){
        //TextField addressField = (TextField) getElementById("address_field", ourInstance);
        TextField addressField = (TextField) getElementByNodeType("TextField", ourInstance);
        addressField.setText("http://www.ex.ua/82091884");
        //WebView browser = (WebView) getElementById("browser",ourInstance);
        WebView browser = (WebView) getElementByNodeType("WebView", ourInstance);
        final WebEngine webEngine = browser.getEngine();
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(browser);
        webEngine.load(addressField.getText());
    }
}
