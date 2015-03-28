package Homeworks.homework_1;

import Lessons.LessonTwo.Methods;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by MacBook on 28.03.15.
 */
public class EmployeeUtil {
    public static ArrayList<Employee> getEmployees () throws IOException {
        ArrayList<Employee> empl = new ArrayList<>();
        String dump = Methods.ReadFromFile("alena/scr/main/java/identity/employees.txt");
        String [] lines = dump.split("\n");
        for (int i = 0; i < lines.length; i++) {
            String [] person = lines[i].split(":");
            Employee e = new Employee();
            e.setName(person[0]);
            e.setSecondName(person[1]);
            e.setSalary(Double.valueOf(person[2]));
            e.setSex(person[3]);
            e.setAge(Integer.valueOf(person[4]));
            empl.add(e);
        }
        return empl;
    }
}
