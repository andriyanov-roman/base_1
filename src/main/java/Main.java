import entity.Admin;
import entity.Employee;
import entity.Manager;
import entity.Programmer;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Employee> employees = new ArrayList<>();
        //Employee employee = employees.stream().filter(e -> (e.getSalary() > 500)).findAny().get();
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }

    public static void getMaxSalary() {
        ArrayList entyties = new ArrayList();
        Manager managerMax;
        for (int i = 0; i < entyties.size() ; i++) {
            if(entyties.get(i) instanceof Manager) {

            }
        }

    }

    private static Admin getMaxSalaryAdmin(ArrayList<Admin> admins) {
        return null;
    }


    private static Manager getMaxSalaryManager(ArrayList<Manager> managers) {
        Manager max = managers.get(0);
        for (int i = 0; i < managers.size(); i++) {
            if(max.getSalary() < managers.get(i).getSalary()) {
                max = managers.get(i);
            }
        }
        return max;
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
