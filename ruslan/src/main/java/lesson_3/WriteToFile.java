package lesson_3;



import home_tasks_2.*;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("test_write.txt", true);
        writer.write("ololo");
        writer.flush();
        writer.close();
    }
}
