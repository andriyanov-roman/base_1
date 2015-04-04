package io_tools;

import java.io.*;
import java.security.PrivateKey;
import java.util.ArrayList;

/**
 * Created by Администратор on 31.03.2015.
 */
public class CommonWriterReader {
    private String path;
    private String delimiter=":";
    private ArrayList arrayList;
    private Boolean append = true;

    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public Boolean getAppend() {
        return append;
    }

    public void setAppend(Boolean append) {
        this.append = append;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ArrayList getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public  void readFile(String path) throws IOException{
        ArrayList arrayList = new ArrayList();
        File file = new File(path);
        FileReader reader= new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        while ((line=buffer.readLine())!=null){
            arrayList.add(line);
        }
    };
    public void writeFile (String path) throws IOException{
        ArrayList arrayList = new ArrayList();
        File file = new File(path);
        FileWriter writer = new FileWriter(file,append);
        for(int i=0; i<arrayList.size();i++){
            writer.write((String)arrayList.get(i));
            writer.write("\n");
        }
        writer.flush();
        writer.close();
    };
}
