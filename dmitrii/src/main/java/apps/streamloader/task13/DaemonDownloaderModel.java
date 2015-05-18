package apps.streamloader.task13;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mit_OK! on 17.05.2015.
 */
public class DaemonDownloaderModel {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream outputStream;
            ArrayList<String> urls = new ArrayList<>(loadUrls());
            for (int i = 0; i < urls.size(); i++) {
                URL url = new URL(urls.get(i));
                InputStream is = url.openStream();
                outputStream = new FileOutputStream(new File(i + ".mp3"));
                byte[] buffer = new byte[2048];
                int length;
                while ((length = is.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, length);
                }
                outputStream.close();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public static Set<String> loadUrls() {
        Set<String> urls = new HashSet<>();
        try {
            URL url = new URL("http://www.ex.ua/82091884");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            Pattern pattern = Pattern.compile("href='([^']+)");
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    if (matcher.group(1).contains("/get/")) {
                        urls.add("http://www.ex.ua" + matcher.group(1));
                    }
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return urls;
    }
}
