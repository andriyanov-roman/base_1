package app;

import company.CompanyView;
import mvc.CommonView;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by user on 22.04.2015.
 */
public class AppView implements CommonView {
    @Override
    public void showMenu() throws IOException {
            System.out.println ("Application Menu:" +
                    "\n 1. Company Application" + "\n 2. Factory Application"
                    + "\n 3. shapes Application" + "\n 4. University Application");
           /* while (Scanner.hasNext()) {
                switch (Scanner.next()) {
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
            }*/
        }
    }

