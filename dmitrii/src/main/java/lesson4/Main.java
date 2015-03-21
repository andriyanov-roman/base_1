package lesson4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by user on 21.03.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\testDir\\test.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);

        ArrayList<String> STR = new ArrayList<>();
        String line;
        while( (line=buffer.readLine()) !=null){
            String[] pool = line.split(" ");
            for (int i = 0; i < pool.length; i++) {
                STR.add(pool[i]);
            }
            System.out.println(line);
            for (int i = 0; i < 10; i++) {
                System.out.println(STR.get(i));
            }
        }
    }
}
