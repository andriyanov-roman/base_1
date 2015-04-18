package lesson_5;

/**
 * Created by user on 18.04.2015.
 */
public class ConsoleWriter {
    public void showLine (IReadText text){
        for (int i = 0; i < text.getStrings().size() ; i++) {
            System.out.println();

        }
    }
}
