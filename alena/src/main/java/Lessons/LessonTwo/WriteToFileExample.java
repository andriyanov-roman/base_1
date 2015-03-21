package Lessons.LessonTwo;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by user on 21.03.2015.
 */
public class WriteToFileExample {
    public static void main(String[] args) throws IOException{
        FileWriter writer = new FileWriter("alena/src/main/java/identity/test_write");
        writer.write("Ohoho");
        writer.flush();
        writer.close();

    }
}
