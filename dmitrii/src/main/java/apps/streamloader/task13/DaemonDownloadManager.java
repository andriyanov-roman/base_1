package apps.streamloader.task13;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by mit_OK! on 17.05.2015.
 */
public class DaemonDownloadManager {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.ex.ua/get/135650923");
        //FileOutputStream outputStream = new FileOutputStream((File)url.getContent());
        URLConnection connection = url.openConnection();
        File f = new File("Users.json");

        System.out.println(connection.getHeaderFields());
    }
}
