package ua;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public interface IReadText {

    public ArrayList<String> getStrings() throws IOException;

    public default ArrayList<String> readFromFile(String path) throws IOException {
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

    public default ArrayList<String[]> readFromFile(String path, String regExp) throws IOException{
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
