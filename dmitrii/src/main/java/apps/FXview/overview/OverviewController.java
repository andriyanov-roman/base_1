package apps.FXview.overview;

import apps.FXview.helpers.CloseWindow;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import static apps.FXview.helpers.IdFinder.getElementById;

public class OverviewController {
    private VBox mainPlaceHolder;
    private GridPane top;
    private GridPane center;
    private GridPane bottom;
    private Label icon;
    private Label title;
    private Label subTitle;
    private Button cancelButton;
    private Button okButton;

    public void setMainPlaceHolder(VBox mainPlaceHolder) {
        this.mainPlaceHolder = mainPlaceHolder;
        initialize();
    }

    private void initialize() {
        top = (GridPane) getElementById("o_top", mainPlaceHolder);
        center = (GridPane) getElementById("o_center", mainPlaceHolder);
        bottom = (GridPane) getElementById("o_bottom", mainPlaceHolder);
        icon = (Label) getElementById("o_icon",top);
        title = (Label) getElementById("o_title",top);
        subTitle = (Label) getElementById("o_subTitle",top);
        cancelButton = (Button) getElementById("o_Cancel",bottom);
        cancelButton.setOnAction(new CloseWindow(cancelButton));
        okButton = (Button) getElementById("o_OK",bottom);
    }

    public void renderEntity (OverviewHelper<?> helper){
        icon.setText(helper.getIconChar());
        title.setText(helper.getTitle());
        subTitle.setText(helper.getSubTitle());
        center.setHgap(5);
        center.setVgap(5);
        for (int i = 0; i < helper.getFields().size(); i++) {
            FieldsContainer userField = helper.getFields().get(i);
            if (!userField.isExcluded()){
                Label fieldName = new Label(userField.getDisplayName().toUpperCase());
                fieldName.setPadding(new Insets(5, 5, 5, 15));
                fieldName.getStyleClass().add("label-caption");
                center.add(fieldName, 0, i);
                // ===============================================================
                TextField fieldValue = new TextField(userField.getDisplayValue());
                fieldValue.setId(userField.getId());//!!!!!!!!!!!!!
                fieldValue.setPadding(new Insets(5,5,5,5));
                fieldValue.setDisable(helper.getForbidEditing());
                center.add(fieldValue,1,i);
            }
        }
        okButton.setDisable(helper.getForbidEditing());
    }
}
