package apps.company;

import entities.CommonApp;
import entities.mvc.CommonView;

import java.util.Scanner;

/**
 * Created by mit_OK! on 10.04.2015.
 */
public class CompanyApp extends CommonApp {
    @Override
    public void run() {
        model = new CompanyModel();
        view = new CompanyView();
        new CompanyController((CompanyView)view, (CompanyModel)model);
    }

    @Override
    public String generateReport() {
        CompanyView viewForReport = new CompanyView(){
            @Override
            public void alert(String txt) {
               buffer += (txt + "\n");
            }

            @Override
            public void alertInline(String txt) {
                buffer += txt;
            }
        };
        //viewForReport.displayWorkersTableAllCompanies(new CompanyModel().getCompanies());
        viewForReport.displayWorkersFULL(new CompanyModel().getCompanies());
        return CommonView.getBuffer();
     }
}
