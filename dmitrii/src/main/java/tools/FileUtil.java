package tools;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by mit_OK! on 23.03.2015.
 */
public class FileUtil {
    public static ArrayList<String[]> ReadFromFile(String FilePath, String RegExp) {
        ArrayList<String[]> fileStrings = new ArrayList<>();
        File file = new File(FilePath);
        FileReader reader = null;
        try {
            reader = new FileReader(file);

            BufferedReader buffer = new BufferedReader(reader);
            String line;
            while ((line = buffer.readLine()) != null) {
                String[] preEntity = line.split(RegExp);
                fileStrings.add(preEntity);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileStrings;
    }

    public static void WriteToFile(String txt, String FileURL, Boolean AddToEnd) {
        // AddToEnd:::::: TRUE - дописывать в конец, FALSE - перезаписать всё
        try {
            FileWriter writer = new FileWriter(FileURL, AddToEnd);
            writer.write(txt);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
