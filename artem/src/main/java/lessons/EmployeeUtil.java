package lessons.lesson3;


import entity.Employee;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeeUtil {
    public static ArrayList<Employee> getEmployees() throws IOException {
        File file = new File("D:\\base_1\\artem\\employees.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Employee> employees = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Employee e = new Employee();
            e.setName(pool[0]);
            e.setSecondName(pool[1]);
            e.setSalary(Double.valueOf(pool[2]));
            e.setSex(pool[3]);
            e.setAge(Integer.valueOf(pool[4]));
            employees.add(e);
        }
        return employees;
    }
}
