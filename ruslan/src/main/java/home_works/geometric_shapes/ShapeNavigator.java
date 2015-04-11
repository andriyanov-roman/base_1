package home_works.geometric_shapes;

import java.util.Scanner;

/**
 * Created by user on 08.04.2015.
 */
public class ShapeNavigator {
    private Scanner scanner = new Scanner(System.in);

    public void start() throws Exception {
        scanner = new Scanner(System.in);
        System.out.println("Виберіть інформацію, яка Вас цікавить :" + "\n" +
                "1. " + "\n" +
                "2. " + "\n" +
                "3. " + "\n" +
                "4. " + "\n" +
                "5. Вийти");
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
                case "5":System.exit(0);
                    break;
            }
        }
    }
}