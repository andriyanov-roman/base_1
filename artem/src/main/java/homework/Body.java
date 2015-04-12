package homework;

import entity.company.Employee;
import modules.company.CompanyUtil;

import java.io.*;
import java.util.*;


public class Body {
    public static Scanner scanner = new Scanner(System.in);
    public static void start() throws IOException {
        CompanyUtil.getCompanies("artem/src/main/java/files/companies");
        View.welcome();
        switch (Body.scanner.next()){
            case "1": modules.company.Body.start(); break;
            case "2": modules.carFactory.Body.start(); break;
            case "3": modules.figures.Body.start(); break;
            case "4": modules.university.Body.start(); break;
            default: System.out.println("Unfortunately we have no such case");
        }
    }
    public static ArrayList<String[]> readFromFile (String path, String regExp) throws IOException {
        File file = new File(path);
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        ArrayList<String[]> strings = new ArrayList<>();
        while ((line = buffer.readLine()) != null){
            String[] pool = line.split(regExp);
            strings.add(pool);
        }
        return strings;
    }
    public static void writeToFile (String path, ArrayList<Employee> employees) throws IOException{
        FileWriter writer = new FileWriter(path, true);
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < employees.size(); i++) {
            buffer.append(String.valueOf("\n" + employees.get(i).getName()+":"+employees.get(i).getSecondName()+":"+employees.get(i).getSalary()+":"+employees.get(i).getSex()+":"+employees.get(i).getAge()));
        }
        writer.write(String.valueOf(buffer));
        writer.flush();
        writer.close();
    }
}