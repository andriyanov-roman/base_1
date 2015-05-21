package apps.FXview.helpers;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;

/**
 * Created by mit_OK! on 18.05.2015.
 */
public class IdURLFinder {
    public static Node getElementById (String id, Pane pane){
        try {
            for (Node i : pane.getChildren()) {
                if (i.getId()!=null){
                    if (i.getId().equals(id)){
                        return i;
                    }
                }
            }
            throw new NoSuchElementException("Element with id \'"+id+"\' not faund");
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }

        return null;
    }
    public static URL getDaemonURL (String FXMLfileName){
        //getClass().getResource("MainWindow.fxml");
        URL url = null;
        try {
            url = new File("dmitrii/src/main/java/apps/FXview/"+FXMLfileName).toURI().toURL();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }
    public static Node getElementByNodeType (String nodeClassName, Pane pane){
        for (Node i : pane.getChildren()){
            if (i.getClass().getSimpleName().equals(nodeClassName)){
                return i;
            }
        }
        return null;
    }
}
