package garbage;

import io_tools.CommonWriterReader;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Администратор on 28.04.2015.
 */
public class FilesReadRun {
    public static void main(String[] args) throws IOException {
        CommonWriterReader readFileNames = new ReadFileList();
        ArrayList<String[]> filesNames = new ArrayList<>();
        System.out.println(readFileNames.getPath());
        System.out.println(readFileNames.getDelimiter());
        filesNames =  readFileNames.read();


        for(int i =0;i<filesNames.size();i++){
            for(int j=0; j<filesNames.get(i).length; j++)
            System.out.println(filesNames.get(i)[j]);
        }
    }
}