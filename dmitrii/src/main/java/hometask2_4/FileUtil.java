package hometask2_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

/**
 * Created by mit_OK! on 23.03.2015.
 */
public class FileUtil {
    public static String ReadFromFile(String FileURL) throws IOException {
        String FileString;
        File file = new File(FileURL);
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        FileString = buffer.readLine();
        return FileString;
    }
    public static void WriteToFile (String txt, String FileURL, Boolean AddToEnd) throws IOException {
        // AddToEnd:::::: TRUE - дописывать в конец, FALSE - перезаписать всё
        FileWriter writer = new FileWriter(FileURL, AddToEnd);
        writer.write(txt);
        writer.flush();
        writer.close();
    }
}
