package apps.streamloader.task13;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.io.File;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by mit_OK! on 19.05.2015.
 */
public class DaemonDownLoaderController implements Observer {
    private Observable model;
    private GridPane progressView;
    private String currentFileName = "";
    private Long totalFileLength;
    private ProgressBar progress;
    private int progressCounter = 0;
    private TextField addressField;

    public void setModel(Observable model) {
        this.model = model;
        model.addObserver(this);
    }

    public void setProgressView(GridPane progressView) {
        this.progressView = progressView;
    }

    public void setAddressField(TextField addressField) {
        this.addressField = addressField;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DaemonDownloaderModel) {
            File f = ((DaemonDownloaderModel) o).getCurrentFile();
            if (!f.getName().equals(currentFileName)) {
                currentFileName = f.getName();
                totalFileLength = f.length();
                createIndicator();
            } else {
                updateIndicator(f.length());
            }
        }
    }

    private void createIndicator() {
        progress = new ProgressBar(0);
        //progress.setId(currentFileName);
        progressView.add(progress, 0, progressCounter);
        progressView.add(new Label(currentFileName), 1, progressCounter);
        progressCounter++;
    }

    private void updateIndicator(double progressValue) {
        if (progress != null) {
            progress.setProgress(progressValue / totalFileLength);
        }
    }

    @FXML
    public void download() {
        ((DaemonDownloaderModel) model).startDownloading(addressField.getText());
    }
}
