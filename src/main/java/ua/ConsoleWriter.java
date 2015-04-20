package ua;

import java.io.IOException;

/**
 * Created by Администратор on 18.04.2015.
 */
public class ConsoleWriter {

    public void showLine(IReadText text) throws IOException {
        for (int i = 0; i < text.getStrings().size(); i++) {
            System.out.println();
        }
    }
}
