package apps.company;

import javafx.fxml.FXML;

/**
 * Created by mit_OK! on 29.04.2015.
 */
public class CompanyAppFXMenuController {
    CompanyModel model = new CompanyModel();
    @FXML
    private void doSmthg (){
        System.out.println(model.getCompanies().get(0));
    }
}
