package views.console;

import controlers.CommonDataValidator;
import views.BaseView;

import java.util.Scanner;

/**
 * Created by user on 4/5/2015.
 */
public class ConsoleView extends BaseView {
    protected Scanner scanner;
    private CommonDataValidator controller;

    public ConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String chooseMenu() {
        System.out.println("Enter program you want to see next" + "\n" +
         "1. Company program" + "\n" +
         "2. Go back");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    new CompanyView(scanner).start();
                case "2": return "";
            }
        }
        return null;
    }

    public void start() {

    }
}
