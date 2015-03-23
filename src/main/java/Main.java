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
        String path = "D://ololo//1.txt";
        ArrayList<Employee> employees = getEmployees(path, ":");

    }

    public static void writeToFile(String path) throws IOException {
        FileWriter writer = new FileWriter("src/test_write.txt", true);
        writer.write(getEmployees(path, ":").toString());
        writer.flush();
        writer.close();
    }

    public static ArrayList<String[]> readFromFile(String path,String regExp) throws IOException {
        File file = new File(path);
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        ArrayList<String[]> strings = new ArrayList<>();
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(regExp);
            strings.add(pool);
        }
        return strings;
    }

    public static ArrayList<Employee> getEmployees(String path, String regExp) throws IOException {
        ArrayList<String[]> strings = readFromFile(path, regExp);
        ArrayList<Employee> employees = new ArrayList<>();
        String line;
        for (int i = 0; i < strings.size(); i++) {
            Employee e = new Employee();
            e.setName(strings.get(i)[0]);
            e.setSecondName(strings.get(i)[1]);
            e.setSalary(Double.valueOf(strings.get(i)[2]));
            e.setAddress(strings.get(i)[3]);
            employees.add(e);
        }
        return employees;
    }

}
