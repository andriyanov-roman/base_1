package modules.figures;

/**
 * Created by R-Tem on 06.04.2015.
 */
public class Body {
    private static void menu() {
        System.out.println("");
    }
    public static void start(){
        do {
            menu();
            switch (Body.scanner.next()){
                case "1":
                    break;
            }
        } while (true);
    }
}
