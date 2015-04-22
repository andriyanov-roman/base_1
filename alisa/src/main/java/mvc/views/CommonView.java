package mvc.views;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by admin on 22.04.15.
 */
public class CommonView {
    private Scanner scanner = new Scanner(System.in);

    public void start() throws IOException {
        System.out.println ("Application Menu:" +
        "\n 1. Company Application" + "\n 2. Factory Application"
                + "\n 3. Shapes Application" + "\n 4. University Application");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":

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
