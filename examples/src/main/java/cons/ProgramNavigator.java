package cons;

import cons.views.console.ConsoleView;

import java.util.Scanner;


public class ProgramNavigator {
    private Scanner scanner = new Scanner(System.in);

    public void startProgram() {
        System.out.println("What programs you want to see?" + "\n"
                + "1. Console Programs" + "\n" +
                "2. Swing Program" + "\n" +
                "3. Exit");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    ConsoleView view = new ConsoleView(scanner);
                    if ("".equals(view.chooseMenu())) startProgram();
                    break;
                case "2":
                case "3": System.exit(0);
            }
        }
    }
}
