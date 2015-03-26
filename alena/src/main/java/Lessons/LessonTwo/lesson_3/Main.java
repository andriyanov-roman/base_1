package Lessons.LessonTwo.lesson_3;

import Homeworks.homework_1.Employee;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static Lessons.LessonTwo.Methods.ReadFromFile;
import static Lessons.LessonTwo.Methods.WriteToFile;

/**
 * Created by user on 21.03.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
   ReadFromFile("alena/src/main/java/identity/Beast");
   ReadFromFile("alena/src/main/java/identity/Finest");
   WriteToFile("/t Alonaaaaaa","alena/src/main/java/identity/Finest", true );


    }

    public static void addEmployee(String[] args) throws IOException {
        File file = new File("D:\\work\\test.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<String> words = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(" ");
            for (int i = 0; i < pool.length; i++) {
                words.add(pool[i]);
            }

        }
        System.out.println(words.toString());

    }
}
