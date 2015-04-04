package factory_project;

import entities.ComFileUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by mit_OK! on 03.04.2015.
 */
public class CarFileUtil extends ComFileUtil {
    public String readFileBuffer() throws IOException {
        File file = new File(super.getPath());
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        String fileStrings="";
        while( (line=buffer.readLine()) !=null) {
            fileStrings+=line+"\n";
        }
        return fileStrings;
    }

}
