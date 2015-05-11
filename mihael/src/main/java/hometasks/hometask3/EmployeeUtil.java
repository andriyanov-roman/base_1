package hometasks.hometask3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by user on 14.03.2015.
 */
public class EmployeeUtil {
    private static ArrayList<Employee> employees = new ArrayList<Employee>();
    static {
        try {
            employees =setupEmployees();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public EmployeeUtil() {
    }

    public static ArrayList<Employee> setupEmployees() throws IOException {
            {
                //File file = new File("mihael/src/main/java/hometasks/hometask3/Employees.txt");
                File file = new File("mihael/src/main/java/data/Employees/Employees.txt");
                FileReader reader = new FileReader(file);
                BufferedReader buffer = new BufferedReader(reader);

                ArrayList<Employee> words = new ArrayList<>();
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
                //System.out.println(words.toString());
            }


        return employees;
    }


    public static ArrayList<Employee> getEmployees() {
        return employees;
    }

    public static void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public static void removeEmployee(int i) {
        employees.remove(i);
    }

    public static void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}