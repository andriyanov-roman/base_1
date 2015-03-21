import base_examples.objects.Human;
import home_work_2.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\work\\test.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<String> strings = new ArrayList<>();
        String line;
        while((line = buffer.readLine()) != null) {
            String[] pool = line.split(" ");
            for(int i = 0; i < pool.length; i++) {
                strings.add(pool[i]);
            }
            System.out.println(line);
        }

    }
}
