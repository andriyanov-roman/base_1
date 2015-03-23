package entity;

import entity.Employee;
import hometask2_4.FileUtil;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Dmitriy Lisunov on 14.03.2015.
 */
class EmployeeUtil {
    public static ArrayList<Employee> getEmployees () throws IOException {
        ArrayList<Employee> empl = new ArrayList<>();
        String dump = FileUtil.ReadFromFile("dmitrii\\src\\main\\resources\\Employees_List.txt");
        String [] lines = dump.split("\n");
        for (int i = 0; i < lines.length; i++) {
            String [] person = lines[i].split(":");
            Employee e = new Employee();
            e.setName(person[0]);
            e.setSurname(person[1]);
            e.setSalary(Double.valueOf(person[2]));
            e.setGender(Boolean.valueOf(person[3]));
            e.setAge(Integer.valueOf(person[4]));
            empl.add(e);
        }
        return empl;
    }
}
