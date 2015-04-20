package ua;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Администратор on 18.04.2015.
 */
public class ReadStringBYCountImpl implements IReadText {

    @Override
    public ArrayList<String> getStrings() throws IOException {
        String path = "";
        ArrayList<String> strings = IReadText.super.readFromFile(path);
        return null;
    }
}
