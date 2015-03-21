package lesson4;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by user on 21.03.2015.
 */
public class WriteToFile {
    public static void main(String[] args) throws IOException{

        FileWriter writter = new FileWriter("dmitrii/Hi_test_write.txt", true); // TRUE - дописывать в конец, FALSE - перезаписать
        writter.write("ОЛОЛО!!");
        writter.flush();
        writter.close();
    }
}
