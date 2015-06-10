package lessons.pair;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Programmer on 18.05.2015.
 */
public class PathTestExample {
    public static void main(String[] args) {
        Path testFilePath = Paths.get("resourse/test.txt");
        File f = new File("sample.txt");
        f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return false;
            }
        });
        testFilePath.toUri();
    }
}
