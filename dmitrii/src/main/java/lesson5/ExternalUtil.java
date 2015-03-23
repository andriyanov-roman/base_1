package lesson5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by user on 23.03.2015.
 */
public class ExternalUtil {
    public static String ReadFromFile(String FileURL) throws IOException {
        File file = new File(FileURL);
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        String FileStrings="";
        while( (line=buffer.readLine()) !=null) {
            FileStrings = FileStrings + line+"\n";
        }
        return FileStrings;
    }
}
