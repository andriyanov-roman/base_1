package entities.file_tools;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by mit_OK! on 03.04.2015.
 */
public class ComFileTool {
    private String path;
    private String regExp;

    public ComFileTool(String path, String regExp) {
        this.path = path;
        this.regExp = regExp;
    }

    public ComFileTool() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRegExp() {
        return regExp;
    }

    public void setRegExp(String regExp) {
        this.regExp = regExp;
    }

    public Boolean writeToFile(String txt, Boolean AddToEnd) {
        // AddToEnd:::::: TRUE - дописывать в конец, FALSE - перезаписать всё
        try {
            FileWriter writer = new FileWriter(path, AddToEnd);
            writer.write(txt);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public ArrayList<String[]> readFromFile() {
        File file = new File(path);
        ArrayList<String[]> fileStrings = new ArrayList<>();
        try {
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);
            String line;
            while ((line = buffer.readLine()) != null) {
                String[] preEntity = line.split(regExp);
                fileStrings.add(preEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileStrings;
    }

}
