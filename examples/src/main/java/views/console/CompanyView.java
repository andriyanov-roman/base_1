package views.console;

import java.util.Scanner;

/**
 * Created by user on 4/5/2015.
 */
public class CompanyView extends ConsoleView {


    public CompanyView(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void start() {
        System.out.println("Choose from above " + "\n" +
                "1: Add new employee" + "\n" +
                "2: Close the program for Company"  );
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    addNewEmployee();
                case "2":
                    return;
            }
        }
    }

    private void addNewEmployee() {
        System.out.println("Enter Employee name");

    }
}
