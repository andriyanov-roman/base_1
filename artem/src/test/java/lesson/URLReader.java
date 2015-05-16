package lesson;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
/**
 * Created by Programmer on 16.05.2015.
 */
public class URLReader {
    public static void main(String[] args) throws IOException{
        try {
            URL url = new URL("http://www.ex.ua/load/135835503");
            InputStream is = url.openStream();
            FileOutputStream outputStream = new FileOutputStream(new File("C:\\Users\\Programmer\\IdeaProjects\\base_1\\artem\\src\\main\\resourses\\test\\test.mp3"));
            byte[] buffer = new byte[2048];
            int length;
//            BufferedReader reader = new BufferedReader((new InputStreamReader((url.openStream()))));
//            String line;
            while ((length = is.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            outputStream.close();
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
}
