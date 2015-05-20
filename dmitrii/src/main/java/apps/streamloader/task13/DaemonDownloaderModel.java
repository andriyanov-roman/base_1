package apps.streamloader.task13;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Observable;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mit_OK! on 17.05.2015.
 */
public class DaemonDownloaderModel extends Observable implements Runnable{
    private File currentFile;
    private ArrayList<String> urls;
    private int folderCount =0;

    public File getCurrentFile() {
        return currentFile;
    }

    public void startDownloading(String exUAurl) {
        urls = new ArrayList<>(loadUrls(exUAurl));
        download();
    }
    private Set<String> loadUrls(String exUAurl) {
        Set<String> urls = new HashSet<>();
        try {
            URL url = new URL(exUAurl);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            Pattern pattern = Pattern.compile("href='([^']+)");
            byte counter = 0;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    if (matcher.group(1).contains("/get/")) {
                       if (counter<4)urls.add("http://www.ex.ua" + matcher.group(1));
                        counter++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return urls;
    }


    public void download() {
        folderCount++;
        try {
            FileOutputStream outputStream;
            for (int i = 0; i < urls.size(); i++) {
                URL url = new URL(urls.get(i));
                InputStream is = url.openStream();
                File folder = new File("dmitrii/src/main/resources/ex.ua/download_"+folderCount);
                folder.mkdirs();
                currentFile = new File(folder.getPath()+"/"+i + ".mp3");
                setChanged();
                notifyObservers();
                //System.out.println(currentFile.length());
                outputStream = new FileOutputStream(currentFile);
                //System.out.println(currentFile.length());
                byte[] buffer = new byte[2048];
                int length;
                while ((length = is.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, length);
                    setChanged();
                    notifyObservers();
                }
                System.out.println(currentFile.length());
                //System.out.println("======");

                outputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        download();
    }
}
