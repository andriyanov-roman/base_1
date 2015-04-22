package app;

import company.CompanyMethods;
import company.CompanyView;
import mvc.views.CommonView;

import java.io.IOException;

/**
 * Created by user on 22.04.2015.
 */
public class AppView extends CommonView {
    @Override
    public void showMenu() throws IOException {
            System.out.println ("Application Menu:" +
                    "\n 1. Company Application" + "\n 2. Factory Application"
                    + "\n 3. Shapes Application" + "\n 4. University Application");
            while (getScanner().hasNext()) {
                switch (getScanner().next()) {
                    case "1":
                        new CompanyView().showMenu();
                        break;
                    case "2":

                        break;
                    case "3":

                        break;
                    case "4":

                        break;
                    case "Exit":
                        System.exit(0);
                    default:
                        System.out.println("No such case");
                }
            }
        }
    }

