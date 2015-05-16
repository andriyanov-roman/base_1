package lections.lesson18;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Programmer on 16.05.2015.
 */
public class lesson18 {
    public static void main(String[] args){
        try(Writer outWriter = new FileWriter("test18.txt")){
            int counter =0;
            for(int i=0;i<100000000L;i++){
                if(counter<=10000){
                    counter++;
                    outWriter.write("test18");
                    outWriter.flush();
                }
                outWriter.write("test18");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
