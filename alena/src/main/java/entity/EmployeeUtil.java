package entity;

import Lessons.LessonTwo.Methods;
import entity.Employee;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by MacBook on 28.03.15.
 */
public class EmployeeUtil {
    public static ArrayList<Employee> getEmployees () throws IOException {
        ArrayList<Employee> employees = new ArrayList<>();
        String dump = Methods.ReadFromFile("src\\main\\java\\identity\\employees.txt");
        String [] lines = dump.split("\n");
        for (int i = 0; i < lines.length; i++) {
            String [] person = lines[i].split(":");
            Employee e = new Employee();
            e.setName(person[0]);
            e.setSecondName(person[1]);
            e.setSalary(Double.valueOf(person[2]));
            e.setSex(person[3]);
            e.setAge(Integer.valueOf(person[4]));
            employees.add(e);
        }
        return employees;
    }
}
