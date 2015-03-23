import base_examples.objects.Human;
import home_work_2.Employee;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        LocalDate fromString = LocalDate.parse("2014-01-20");
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        Date date = new Date();
        System.out.println(fromString);
        System.out.println(date);

    }

    public static void writeToFile() throws IOException  {
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
            e.setAddress(pool[3]);
            employees.add(e);
        }
        return employees;
    }
}
