package apps.FXview;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by mit_OK! on 27.04.2015.
 */
public class CompanyFXView extends CommonFXView {
    public CompanyFXView(Double width, Double height) {
        super(width, height);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(super.getScene());
       /* Button btn = new Button("Save to File");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.TOP_RIGHT);
        hbBtn.getChildren().add(btn);
        getGrid().add(hbBtn, 2, 6);*/
        primaryStage.show();
    }
}
