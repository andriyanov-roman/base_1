package app;

import com.sun.java_cup.internal.runtime.Scanner;
import company.CompanyView;
import mvc.CommonView;

import java.io.IOException;


/**
 * Created by user on 22.04.2015.
 */
public class AppView implements CommonView {
    private java.util.Scanner scanner = new java.util.Scanner(System.in);
    @Override
    public void showMenu() throws IOException {
            System.out.println ("Application Menu:" +
                    "\n 1. Company Application" + "\n 2. Factory Application"
                    + "\n 3. shapes Application" + "\n 4. University Application");
           while (scanner.hasNext()) {
                switch (scanner.next()) {
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

