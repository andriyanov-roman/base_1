package entities.mvc;

/**
 * Created by mit_OK! on 06.04.2015.
 */
public class CommonModel {
    private String folderPath = "dmitrii\\src\\main\\resources";

    public String getFolderPath() {
        return folderPath;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public CommonModel(String folderPath) {
        this.folderPath = folderPath;

    }

    public CommonModel() {
    }
}
