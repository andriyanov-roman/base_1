package home_works.geometric_shapes.view_shapes;

import entity.ConsoleView;
import home_works.geometric_shapes.model.ShapeMethods;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by user on 16.04.2015.
 */
public class ShapesView extends ConsoleView {
    protected Scanner scanner;

    public ShapesView(Scanner scanner) {
        super(scanner);
    }

    public void start() throws IOException {
        scanner = new Scanner(System.in);
        System.out.println("Виберіть інформацію, яка Вас цікавить :" + "\n" +
                "1. Максимальний переметр, серед всіх фігур" + "\n" +
                "2. Максимальну площу, серед всіх фігур" + "\n" +
                "3. " + "\n" +
                "4. " + "\n" +
                "5. Вийти");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    ShapeMethods.maxPerimeter();
                    break;
                case "2":
                    ShapeMethods.maxSquare();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    System.exit(0);
                    break;
            }
        }
    }

}

