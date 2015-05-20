import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Downloader {
    public void loader(String strUrl) throws IOException {
        try {
            FileOutputStream outputStream = null;
            ArrayList<String> urls = new ArrayList<>(loadUrls(strUrl));
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

    public static Set<String> loadUrls(String urlString) {
        Set<String> urls = new HashSet<>();
        try {
            URL url = new URL(urlString);
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

