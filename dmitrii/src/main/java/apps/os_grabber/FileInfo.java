package apps.os_grabber;

import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * Created by mit_OK! on 19.06.2015.
 */
public class FileInfo {
    private String extension;
    private int quantity;
    private Long fileSize;
    private int hidden;
    private int notHidden;

    public FileInfo(String extension) {
        this.extension = extension;
        this.quantity = 0;
        this.fileSize = 0L;
        this.hidden = 0;
        this.notHidden = 0;
    }
    public FileInfo() {
        this.extension = "";
        this.quantity = 0;
        this.fileSize = 0L;
        this.hidden = 0;
        this.notHidden = 0;
    }
    public void plusFile(File file){
        quantity++;
        fileSize += FileUtils.sizeOf(file);
        if (file.isHidden()) {
            hidden++;
        } else {
            notHidden++;
        }
    }
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public int getHidden() {
        return hidden;
    }

    public void setHidden(int hidden) {
        this.hidden = hidden;
    }

    public int getNotHidden() {
        return notHidden;
    }

    public void setNotHidden(int notHidden) {
        this.notHidden = notHidden;
    }
}
