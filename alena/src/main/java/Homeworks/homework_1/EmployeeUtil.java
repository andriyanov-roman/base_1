package Homeworks.homework_1;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by MacBook on 16.03.15.
 */
public class EmployeeUtil {
    public static ArrayList<Employee> getEmployees() throws IOException {
        ArrayList<Employee> employees = new ArrayList<>();

        File file = new File("alena/src/main/java/identity/employees.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        employees = new ArrayList<>();
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


        } System.out.println(employees.toString());
        return employees;

    }
}
