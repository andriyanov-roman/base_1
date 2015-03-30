package home_works;

import entity.Manager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by user on 30.03.2015.
 */
public class ReadFromTheFiles {
    public static ArrayList<Manager> getManager() throws IOException {
        File file = new File("ruslan/src/main/java/entity/Manager.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Manager> manager = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Manager managers = new Manager();
            managers.setName(pool[0]);
            managers.setSecondName(pool[1]);
            managers.setSalary(Double.valueOf(pool[2]));
            managers.setNameOfProject(pool[3]);
            manager.add(managers);
        }
        return manager;
    }
}
