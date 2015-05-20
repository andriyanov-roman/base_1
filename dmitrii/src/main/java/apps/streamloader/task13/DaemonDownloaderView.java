package apps.streamloader.task13;

import javafx.concurrent.Worker.State;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by mit_OK! on 18.05.2015.
 */
public class DaemonDownloaderView {
    private GridPane rootGrid;
    private GridPane progressGrid;
    private DaemonDownLoaderController controller;
    TextField addressField;
    private static String FXMLpath = "dmitrii/src/main/java/apps/streamloader/task13/DaemonDownloader.fxml";

    public DaemonDownLoaderController getController() {
        return controller;
    }

    public GridPane getRootGrid() {
        return rootGrid;
    }

    public DaemonDownloaderView() {
        loadRootGridWithController();
        initializeSubComponents();
        controller.setProgressView(progressGrid);
        controller.setAddressField(addressField);
    }

    private void loadRootGridWithController() {
        URL url = null;
        try {
            url = new File(FXMLpath).toURL();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        FXMLLoader loader = new FXMLLoader();
        if (url != null) {
            loader.setLocation(url);
        }
        try {
            rootGrid = loader.load();
            if (rootGrid != null) {
                controller = loader.getController();
            } else {
                throw new NullPointerException("Loading Panel from " + FXMLpath + " failed!");
            }
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
    }

    private void initializeSubComponents() {
        WebView browser = null;
        ProgressIndicator browserIndicator = null;
        Button goButton = null;
        for (Node i : rootGrid.getChildren()) {
            if (i.getId() != null) {
                switch (i.getId()) {
                    case "browser0":
                        browser = (WebView) i;
                        break;
                    case "browser_indicator":
                        browserIndicator = (ProgressIndicator) i;
                        break;
                    case "address_field":
                        addressField = (TextField) i;
                        break;
                    case "go_button":
                        goButton = (Button) i;
                        break;
                    case "exit":
                        ((Button) i).setOnAction(event -> {
                            Stage stage = (Stage) rootGrid.getScene().getWindow();
                            stage.close();
                        });
                        break;
                    case "progress_grid":
                        progressGrid = (GridPane)i;
                        break;
                }
            }
        }
        assert browser != null;
        assert browserIndicator != null;
        assert addressField != null;
        assert goButton != null;
        assert progressGrid != null;
        initBrowser(browser, browserIndicator, addressField,goButton);
    }

    private void initBrowser(WebView browser, ProgressIndicator browserIndicator,
                                    TextField addressField, Button goButton) {
        WebEngine webEngine = browser.getEngine();
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(browser);
        browserIndicator.setProgress(ProgressIndicator.INDETERMINATE_PROGRESS);
        addressField.setText("http://www.ex.ua/82091884");
        addressField.textProperty().addListener((observable, oldValue, newValue) -> {
            webEngine.load(addressField.getText());
        });
        webEngine.load(addressField.getText());
        webEngine.getLoadWorker().stateProperty()
                .addListener((obs, oldValue, newValue) -> {
                    if (newValue == State.SUCCEEDED) {
                        browserIndicator.setVisible(false);
                    } else {
                        browserIndicator.setVisible(true);
                    }
                });
        goButton.setOnAction(event -> webEngine.load(addressField.getText()));
    }
}
