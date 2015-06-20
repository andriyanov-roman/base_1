package apps.os_grabber;

import java.io.File;

/**
 * Created by mit_OK! on 18.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        FileFinder fileFinder = new FileFinder();
        fileFinder.findFiles((new File("C:\\Users\\Dr\\Desktop\\VA-BANK")));
        fileFinder.writeXMLfile("osFiles");
    }
}
