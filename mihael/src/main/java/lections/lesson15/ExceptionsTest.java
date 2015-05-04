package lections.lesson15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by user on 04.05.2015.
 */
public class ExceptionsTest {
    public static  void main(String args[]) {

    }
    public void readFromFile() throws FileNotFoundException{
        File f = new File("\\test");
        FileReader reader = new FileReader(f);
    }
}
