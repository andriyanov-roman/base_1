package lections.lection19;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by Programmer on 18.05.2015.
 */
public class Lection19 {
    public static void main(String [] args ){
        Path testFilePath = Paths.get("");
        testFilePath.toUri();
        File f = new File("");
        f.listFiles();
        f.isDirectory();
        f.isHidden();
        f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return false;
            }
        });
        /*
        try( Stream<String> stream = Files.lines(Paths.get("test.txt"),
                Charset.defaultCharset()){stream.forEach(System.out::println);}catch (){}

        try {
            Stream<String> stream = Files.lines(Paths.get("test.txt"),
                    Charset.defaultCharset())){
                stream.forEach(System.out::println);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }
}
