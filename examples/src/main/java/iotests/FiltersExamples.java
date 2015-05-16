package iotests;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by User on 16.05.2015.
 */
public class FiltersExamples {
    public static void main(String[] args) throws IOException {
        try {
            URL url = new URL("http://www.ex.ua/load/135835503");
            InputStream is  = url.openStream();
            FileOutputStream outputStream = new FileOutputStream(new File("test1.mp3"));
            byte[] buffer = new byte[2048];
            int length;
            while((length = is.read(buffer)) > 0) {
                outputStream.write(buffer,0, length);
            }
            outputStream.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
