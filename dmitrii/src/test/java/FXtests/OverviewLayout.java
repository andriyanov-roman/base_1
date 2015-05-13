package FXtests;

import apps.FXview.helpers.CloseWindow;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;

/**
 * Created by mit_OK! on 12.05.2015.
 */
public class OverviewLayout extends VBox{
    private GridPane oTop = new GridPane();
    private GridPane oCenter = new GridPane();
    private GridPane oBottom = new GridPane();
    private Label oIcon = new Label("D");
    private Label oTitle = new Label("Title");
    private Label oSubTitle = new Label("SubTitle");
    private Button okButton = new Button("OK");
    private Button cancelButton = new Button("Cancel");


    public OverviewLayout() {
        initialize();
        this.getChildren().addAll(oTop, oCenter, oBottom);
    }
    public OverviewLayout(String title, String subTitle) {
        initialize();
        oTitle.setText(title);
        oSubTitle.setText(subTitle);
        this.getChildren().addAll(oTop, oCenter, oBottom);
    }

    private void initialize(){
        this.getStylesheets().add("daemon-style.css");
        this.getStyleClass().add("black-bg");
        this.setMinSize(290, 225);
        loadTopPane();
        oCenter.setId("o_center");
        loadBottomPane();
    }

     private void loadTopPane () {
         oTop.setId("o_top");
         ColumnConstraints column0 = new ColumnConstraints();
         column0.setPercentWidth(30);
         ColumnConstraints column1 = new ColumnConstraints();
         column1.setPercentWidth(70);
         oTop.getColumnConstraints().addAll(column0, column1);
         RowConstraints row0 = new RowConstraints();
         row0.setPercentHeight(50);
         RowConstraints row1 = new RowConstraints();
         row1.setPercentHeight(50);
         oTop.getRowConstraints().addAll(row0,row1);
         initTopSmallComponents();
         oTop.add(oIcon, 0, 0, 1, 2);
         GridPane.setMargin(oIcon, new Insets(5));
         GridPane.setValignment(oTitle, VPos.BOTTOM);
         GridPane.setValignment(oSubTitle, VPos.TOP);
         oTop.add(oTitle,1,0);
         oTop.add(oSubTitle,1,1);
         oTop.setGridLinesVisible(true);


         //oTop.setVgap(20);
         //oTop.setHgap(10);
         oTop.setPadding(new Insets(10, 10, 10, 10));
    }
    private void initTopSmallComponents (){
        oTitle.setId("o_title");
        oSubTitle.setId("o_subTitle");
        oIcon.setId("o_icon");
        oIcon.getStyleClass().add("fa");
        oIcon.setStyle("-fx-background-color: derive(white, 0%)");
        oIcon.setAlignment(Pos.CENTER);
        oIcon.setMinSize(80, 80);
        oIcon.setPrefSize(80, 80);
    }
    private void loadBottomPane (){
        oBottom.setId("o_bottom");
        oBottom.setVgap(10);
        oBottom.setHgap(10);
        ColumnConstraints column0 = new ColumnConstraints();
        column0.setPercentWidth(30);
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(35);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(35);
        oBottom.getColumnConstraints().addAll(column0, column1, column2);
        initBottomSmallComponents();
        oBottom.add(okButton, 1, 0);
        oBottom.add(cancelButton, 2, 0);
    }


    private void initBottomSmallComponents (){
        okButton.setId("o_OK");
        okButton.getStyleClass().add("ok-btn");
        okButton.setAlignment(Pos.CENTER);
        cancelButton.setId("o_Cancel");
        cancelButton.getStyleClass().add("cancel-btn");
        cancelButton.setOnAction(new CloseWindow(cancelButton));
        cancelButton.setAlignment(Pos.CENTER);
    }
    public void setIcon (String iconSymbol){
        oIcon.setText(iconSymbol);
    }
    public void setTitle (String title){
        oTitle.setText(title);
    }
    public void setSubTitle (String subTitle){
        oSubTitle.setText(subTitle);
    }
    public void setOkButtonText (String txt){
        okButton.setText(txt);
    }
    public void setOkButtonAction (EventHandler<ActionEvent> event){
        okButton.setOnAction(event);
    }
    public void setCancelButtonText (String txt){
        cancelButton.setText(txt);
    }
    public void setCancelButtonAction (EventHandler<ActionEvent> event){
        cancelButton.setOnAction(event);
    }
    public GridPane getContentBody (){
        return oCenter;
    }

}
