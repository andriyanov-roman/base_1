package homeTasks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadingFromFileSony {
        public static ArrayList<Employee> getEmployees() throws IOException {
                File file = new File("matveu/src/EmployeesSony.txt");
                FileReader reader = new FileReader(file);
                BufferedReader buffer = new BufferedReader(reader);
                ArrayList<Employee> employees = new ArrayList<>();
                String line;
                while ((line = buffer.readLine()) != null) {
                    String[] pool = line.split(":");
                    Employee e = new Employee();
                    e.setName(pool[0]);
                    e.setSecondName(pool[1]);
                    e.setSex(pool[2]);
                    e.setAge(Integer.valueOf(pool[3]));
                    e.setSalary(Double.valueOf(pool[4]));
                    employees.add(e);
                    System.out.print(e+" "+"\n");
                }
            return employees;
        }

    }




