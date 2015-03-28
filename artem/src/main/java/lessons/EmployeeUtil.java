package lessons;


import entity.Admin;
import entity.Employee;
import homework.Methods;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class EmployeeUtil {
    public static ArrayList<Employee> get() throws IOException {
        File f = new File("artem/src/main/java/additionalFiles");
        String[] position = f.list();

        ArrayList allPositions = new ArrayList<>();
        for (int i = 0; i <position.length; i++) {
            ArrayList<String[]> strings = Methods.readFromFile("artem/src/main/java/additionalFiles/" + position[i], ":");

        }
        return allPositions;
    }
}
