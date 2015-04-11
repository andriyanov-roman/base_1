package home_works.company;


import home_works.company.view.company.ConsoleView;

import java.io.IOException;
import java.util.Scanner;

public class CompanyNavigator {
    private Scanner scanner = new Scanner(System.in);

    public void startProgram() throws IOException {
        System.out.println("Вивести консольну програму?" + "\n"
                + "1. Так" + "\n" +
                "2. Ні, вийти");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    ConsoleView view = new ConsoleView(scanner);
                    if ("".equals(view.chooseMenu())) startProgram();
                    break;
                case "2":
                    System.exit(0);
            }
        }
    }
}
