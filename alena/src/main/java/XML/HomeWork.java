package XML;

import java.io.File;
import java.util.HashSet;

/**
 * Created by Programmer on 15.06.2015.
 */
public class HomeWork {
    HashSet<File> directories = new HashSet<>();
    File f = new File("D:\\");

    public void readFileSystem() {
        File[] files = new File("D:\\").listFiles();
    }


}
