package tools;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by mit_OK! on 23.03.2015.
 */
public class FileUtil {
    public static ArrayList<String[]> ReadFromFile(String FilePath, String RegExp) throws IOException {
        File file = new File(FilePath);
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        ArrayList<String[]> fileStrings = new ArrayList<>();
        while( (line=buffer.readLine()) !=null) {
            String [] preEntity = line.split(RegExp);
            fileStrings.add(preEntity);
        }
        return fileStrings;
    }
    public static void WriteToFile (String txt, String FileURL, Boolean AddToEnd) throws IOException {
        // AddToEnd:::::: TRUE - дописывать в конец, FALSE - перезаписать всё
        FileWriter writer = new FileWriter(FileURL, AddToEnd);
        writer.write(txt);
        writer.flush();
        writer.close();
    }
}
