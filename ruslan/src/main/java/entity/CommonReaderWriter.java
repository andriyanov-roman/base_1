package entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by user on 06.04.2015.
 */
public abstract class CommonReaderWriter {
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    public void writerToFile() {
    }

    public Object getEntity(String name) throws IOException {
        return null;
    }

    public ArrayList<String> readFromFile(String path) throws IOException {
        File file = new File(path);
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<String> strings = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            strings.add(line);
        }
        return strings;
    }

    public ArrayList<String[]> readFromFile(String path, String regExp) throws IOException {
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
