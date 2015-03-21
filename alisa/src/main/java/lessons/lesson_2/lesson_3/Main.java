package lessons.lesson_2.lesson_3;

import lessons.lesson_2.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by user on 21.03.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\Alisa\\Employee.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Employee> employees = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) !=null){
            String [] pool = line.split(":");
            Employee e = new Employee();
            e.setName(pool[0]);
            e.setSurname(pool[1]);
            e.setSalary (Double.valueOf(pool[2]));
            e.setAge(Integer.valueOf(pool[3]));
            e.setSex(pool[4]);
            employees.add(e);
            }
            System.out.println(employees.toString());
        }
    }


