package HomeTask5;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by user on 23.03.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("src/test_write.txt",true);
        writer.write(getEmployees().toString());
        writer.flush();
        writer.close();

    }
    public static ArrayList<Employee> getEmployees() throws IOException {
        File file = new File("D:\\work\\test.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Employee> employees = new ArrayList<>();
        String line;
        while((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Employee e = new Employee();
            e.setName(pool[0]);
            e.setSecondName(pool[1]);
            e.setSalary(Double.valueOf(pool[2]));
            employees.add(e);
        }
        return employees;
    }
}
