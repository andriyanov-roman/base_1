package inputOutput.university;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by R-Tem on 01.04.2015.
 */
public class CommonReader {
    private String path;
    private String regExp;

    public CommonReader(String path, String regExp) {
        this.path = path;
        this.regExp = regExp;
    }
    public CommonReader(){}

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

    public ArrayList readFromFile() throws IOException {
        File file = new File(path);// создаем объект класса File; path это путь к зачитываемому файлу который
        // передается как аргумент при создании объекта класса CommonReaderTest
        FileReader reader = new FileReader(file);// создаем объект класса FileReader и зачитываем file
        BufferedReader buffer = new BufferedReader(reader);// создаем объект класса BufferedReader и обвалакиваем им reader
        String line;
        ArrayList<String[]> strings = new ArrayList<>();// создаем коллекцию маленьких массивчиков типа String
        while ((line = buffer.readLine()) != null){// пока в буфере есть строки для чтения
            String[] pool = line.split(regExp);// массив pool заполняется значениями разделенными regExp
            strings.add(pool);// добавляем в коллекцию полученный массив
        }
        return strings;
    }
}