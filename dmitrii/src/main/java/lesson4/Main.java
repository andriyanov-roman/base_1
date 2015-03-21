package lesson4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by user on 21.03.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\testDir\\test.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        while( (line=buffer.readLine()) !=null){
            System.out.println(line);
        }
    }
}
