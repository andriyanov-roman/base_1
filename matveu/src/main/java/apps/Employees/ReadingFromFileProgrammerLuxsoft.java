package apps.Employees;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadingFromFileProgrammerLuxsoft {
    public static ArrayList<Programmer> getProgrammer() throws IOException {
        File file = new File("matveu/src/ProgrammerLuxsoft.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Programmer> programmers = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Programmer programmer = new Programmer();
            programmer.setName(pool[0]);
            programmer.setSecondName(pool[1]);
            programmer.setSex(pool[2]);
            programmer.setAge(Integer.valueOf(pool[3]));
            programmer.setSalary(Double.valueOf(pool[4]));
            programmer.setProgrammingLanguage(pool[5]);
            programmers.add(programmer);
            System.out.print(programmer+" "+"\n");
        }
        return programmers;
    }
}
