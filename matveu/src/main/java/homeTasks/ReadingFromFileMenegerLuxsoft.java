package homeTasks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadingFromFileMenegerLuxsoft {
    public static ArrayList<Manager> getMenegers() throws IOException {
        File file = new File("matveu/src/MenegerLuxsoft.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Manager> manegers = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Manager maneger = new Manager();
            maneger.setName(pool[0]);
            maneger.setSecondName(pool[1]);
            maneger.setSex(pool[2]);
            maneger.setAge(Integer.valueOf(pool[3]));
            maneger.setSalary(Double.valueOf(pool[4]));
            maneger.setNameOfProject(pool[5]);
            manegers.add(maneger);
            System.out.print(maneger+" "+"\n");
        }
        return manegers;
    }
}
