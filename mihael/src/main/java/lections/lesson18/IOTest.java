package lections.lesson18;

import java.io.*;

/**
 * Created by Programmer on 16.05.2015.
 */
public class IOTest {
    public static void main(String[] args){
        Writer outWriter=null;
        try {
           //Writer outWriter= new FileWriter("test.txt");
            outWriter= new FileWriter("test18.txt");
            InputStream io = new FileInputStream("test18.txt");
           // BufferedReader( new FileInputStream("test.txt"));
            int i;
            while(io.read()!=-1 ){
                i=io.read();
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(outWriter!=null){
                try{
                    outWriter.flush();
                    outWriter.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
