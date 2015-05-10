package factory;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Администратор on 30.03.2015.
 */
public class CommonWriterReader {
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

   /* public void writerToFile(String txt, String path, Boolean AddToEnd) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(path, true);
            writer.write(txt);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/

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

    public Object getEntity(String name) throws IOException{
        return null;
    }


    public ArrayList<String[]> readFromFile(String path, String regExp) throws IOException{
        File file = new File(path);
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<String[]> strings = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(regExp);
            strings.add(pool);
        }
        return strings;
    }

}
