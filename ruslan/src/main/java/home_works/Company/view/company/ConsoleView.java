package home_works.company.view.company;

import home_works.company.CompanyNavigator;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by user on 08.04.2015.
 */
public class ConsoleView extends CompanyNavigator{
    protected Scanner scanner;


    public ConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String chooseMenu() throws IOException {
        System.out.println("Виберіть пункт, інформації, яка Вас цікавить " + "\n" +
                "1. Компанія" + "\n" +
                "2. Юзери" + "\n" +
                "3. Вийти з меню");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    new CompanyView(scanner).start();
                case "2":
                    new UserView(scanner).start();
                case "3": System.exit(0);
            }
        }
        return null;
    }

}
