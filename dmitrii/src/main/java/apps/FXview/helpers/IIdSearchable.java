package apps.FXview.helpers;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

import java.util.NoSuchElementException;

/**
 * Created by mit_OK! on 12.05.2015.
 */
public interface IIdSearchable {
    default Node getElementById (String id, Pane pane){
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
}
