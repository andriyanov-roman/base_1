package Path;

import java.io.File;
import java.nio.file.Paths;
import java.nio.file.Path;

/**
 * Created by User on 18.05.2015.
 */
public class PathTestExample {
    public static void main(String[] args) {
        Path testFilePath = Paths.get("java/identity/Fist");
        File f = new File("");
        testFilePath.toUri();
    }
}
