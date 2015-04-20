package hometasks.hometask3;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by user on 21.03.2015.
 */
public class WriteToFile {
    public static void main (String[] args)throws IOException{
        FileWriter writer = new FileWriter("mihael/src/main/java/hometask3/test_write_dm.txt",true);
        writer.write("Ololo");
        writer.flush();
        writer.close();
        //FileOutputStream outputStream = new FileOutputStream("test_write.txt")
    }
}
