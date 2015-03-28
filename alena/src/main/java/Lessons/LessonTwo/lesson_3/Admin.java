package Lessons.LessonTwo.lesson_3;

import Homeworks.homework_1.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by user on 23.03.2015.
 */
public class Admin extends Employee{
    private String platform;


    public Admin() {

    }


    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }


    public static ArrayList<String[]> getAdmins(String path) throws IOException {
        File file = new File("alena\\src\\main\\java\\identity\\admins.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        ArrayList<String[]> strings = new ArrayList<>();
        while ((line = buffer.readLine()) != null){
            String[] pool = line.split(":");
            strings.add(pool);
        }
        System.out.println(strings);
        return strings;
    }


}
