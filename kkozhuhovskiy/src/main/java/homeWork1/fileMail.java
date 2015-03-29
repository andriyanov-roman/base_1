package homeWork1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Kirill on 29.03.2015.
 */
public class fileMail { public static void main(String[] args) throws IOException {

    File file = new File("C:\\_file.txt");
    FileReader reader = new FileReader(file);
    BufferedReader buffer = new BufferedReader(reader);
        /*ArrayList<String> words = new ArrayList<>();*/
    ArrayList<Employee> employees = new ArrayList<>();

    String line;
    while ((line = buffer.readLine()) != null) {
        String[] pool = line.split(":");
               /* words.add(pool[i]);*/
        Employee e = new Employee();
        e.setName(pool[0]);
        e.setSecondName(pool[1]);
        e.setSalary(Integer.valueOf(pool[2]));
        e.setGender(pool[4]);
        e.setAge(Integer.valueOf(pool[3]));
        employees.add(e);
    }
    System.out.println(employees);
}
}
