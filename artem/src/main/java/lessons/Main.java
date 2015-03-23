package lessons;

import entity.Employee;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by user on 21.03.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Employee> employees =  homework.EmployeeUtil.getEmployees();
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
        saveFile();
    }
    public static void saveFile()throws IOException{
        FileWriter writer = new FileWriter("artem/src/main/java/entity/test",true);
        writer.write("Ololol");
        writer.flush();
        writer.close();
    }
}
