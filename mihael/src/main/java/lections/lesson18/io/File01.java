package lections.lesson18.io;

import java.io.*;
import java.net.URL;

/**
 * Created by Администратор on 18.05.2015.
 */
public class File01 {
    public static void main (String[] args)throws IOException{
        File path = new File ("mihael/src/main/java/lections/lesson18/io/hello.txt");
        System.out.println("We got a file "+path);
        System.out.println("Does it exist? "+ path.exists());
        System.out.println("isDirectory " + path.isDirectory());

        /*
        String contentsToWrite = "Hello world";
        OutputStream outStream = new FileOutputStream(path);
        outStream.write(contentsToWrite.getBytes());
        outStream.close();
        */

        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        String firstLine = reader.readLine();
        reader.close();
        System.out.println("Read a line: "+ firstLine);
        */

        URL url = new URL("http://www.prevedko.org.ua");
        InputStream stream = url.openStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String line = reader.readLine();
        while (line!=null){
            System.out.println(line);
            line = reader.readLine();
        }
        System.out.println("Done reading!");
    }
}
