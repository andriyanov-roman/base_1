package lesson_3;


import home_tasks_2.Employee;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\test.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
       /* ArrayList<String> words = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(" ");
            for (int i = 0; i < pool.length; i++) {
                words.add(pool[i]);
            }
        }
        System.out.println(words.toString());*/
        ArrayList<Employee> employees = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Employee e = new Employee();
            e.setName(pool[0]);
            e.setSecondName(pool[1]);
            e.setAge(Integer.valueOf(pool[2]));
            e.setGender(pool[3]);
            e.setSalary(Double.valueOf(pool[4]));
            employees.add(e);
        }
        System.out.println(employees.toString());
    }

}

