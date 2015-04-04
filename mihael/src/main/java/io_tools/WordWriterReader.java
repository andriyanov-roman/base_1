package io_tools;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Администратор on 31.03.2015.
 */
public class WordWriterReader extends CommonWriterReader{
    ArrayList<String> arrayList = super.getArrayList();
    @Override
    public void writeFile(String path) throws IOException {
        //ArrayList<String> arrayList = new ArrayList();
        File file = new File(path);
        FileReader reader= new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        while ((line=buffer.readLine())!=null){
            arrayList.add(line);
        }
    };
    @Override
    public  void readFile (String path) throws IOException{
        Boolean append = true;
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