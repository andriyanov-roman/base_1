package apps.FXview;

import java.util.ArrayList;

/**
 * Created by mit_OK! on 05.05.2015.
 */
public class TableViewHelper {
    private String windowName = "";
    private String header = "";
    private ArrayList<String> fields = new ArrayList<>();
    private ArrayList entities = new ArrayList();

    public TableViewHelper() {
    }

    public TableViewHelper(String windowName, String header) {
        this.windowName = windowName;
        this.header = header;
    }

    public TableViewHelper(String windowName, String header, ArrayList<String> fields, ArrayList entities) {
        this.windowName = windowName;
        this.header = header;
        this.fields = fields;
        this.entities = entities;
    }

    public String getWindowName() {
        return windowName;
    }

    public void setWindowName(String windowName) {
        this.windowName = windowName;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public ArrayList<String> getFields() {
        return fields;
    }

    public void setFields(ArrayList<String> fields) {
        this.fields = fields;
    }

    public ArrayList getEntities() {
        return entities;
    }

    public void setEntities(ArrayList entities) {
        this.entities = entities;
    }
}
