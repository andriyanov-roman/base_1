package apps.FXview.overview;

import apps.FXview.helpers.CloseWindow;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static apps.FXview.helpers.IdURLFinder.getElementById;

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
    private OverviewHelper<?> helper;

    public void setMainPlaceHolder(VBox mainPlaceHolder) {
        this.mainPlaceHolder = mainPlaceHolder;
        initialize();
    }

    public void setHelper(OverviewHelper<?> helper) {
        this.helper = helper;
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
        okButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                addEntity();
                Stage stage = (Stage) mainPlaceHolder.getScene().getWindow();
                stage.close();
            }
        });
    }

    public void renderEntityOverview(){
        assert helper != null;
        icon.setText(helper.getIconChar());
        title.setText(helper.getTitle());
        subTitle.setText(helper.getSubTitle());
        center.setHgap(5);
        center.setVgap(5);
        for (int i = 0; i < helper.getAllFields().size(); i++) {
            FieldsContainer userField = helper.getAllFields().get(i);
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
                if (userField.isValidatorSet()){
                    fieldValue.textProperty().addListener((observable, oldValue, newValue) -> {
                        if (!userField.getValidator().validate(newValue)){
                            System.out.println(userField.getValidator().getErrDescription());
                        }
                    });
                }
                center.add(fieldValue,1,i);
            }
        }
        okButton.setDisable(helper.getForbidEditing());
    }
    public void addEntity(){
        for (FieldsContainer fc : helper.getAllFields()){
            if (!fc.isExcluded()){
                TextField newValue = (TextField) getElementById(fc.getId(),center);
                assert newValue != null;
                Class fieldType = helper.getParameterType(fc.getRealName());
                if (fc.getValidator() != null){
                    if (fc.getValidator().validate(newValue)){
                    helper.setNewRealValue(fc.getRealName(),convertTypes(newValue.getText(),fieldType));
                    } else System.out.println("NOT VALID :((( ");
                } else {
                    Object convertedValue = convertTypes(newValue.getText(), fieldType);
                    helper.setNewRealValue(fc.getRealName(),convertedValue);
                }
            }
        }
    }
    private Object convertTypes(String value, Class fieldType){
        switch (fieldType.getSimpleName()){
            case "int":
            case "Integer":
                return Integer.parseInt(value);
            case "double":
            case "Double":
                return Double.parseDouble(value);
            case "Boolean":
                return Boolean.parseBoolean(value);
            default:
                return value;
        }
    }
}
