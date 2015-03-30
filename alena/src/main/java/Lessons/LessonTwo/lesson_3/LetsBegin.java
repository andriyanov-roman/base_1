package Lessons.LessonTwo.lesson_3;



import entity.EmployeeUtil;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by user on 23.03.2015.
 */
public class LetsBegin {
    /*public static void main(String[] args) throws IOException {
        File file = new File(path);
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Company> companies.txt = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Company c = new Company();
            c.setCompanyName(pool[0]);
           *//* c.setEmployees(pool[1]);*//*
            *//*e.setSalary(Double.valueOf(pool[2]));
            e.setSex(pool[3]);
            e.setAge(Integer.valueOf(pool[4]));*//*
            companies.txt.add(c);


        } System.out.println(companies.txt.toString());
        return companies.txt;

    }*/

    public static ArrayList<String[]> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        ArrayList<String[]> strings = new ArrayList<>();
        while ((line = buffer.readLine()) != null){
            String[] pool = line.split(":");
            strings.add(pool);
        }
        System.out.println(strings.get(0));
        return strings;
    }

    public static void main(String[] args) throws IOException {
       getProgrammersFromFile("alena/src/main/java/identity/employees.txt");

    }

    public static ArrayList<Programmer> getProgrammersFromFile(String path) throws IOException
    {

        File file = new File("alena/scr/main/java/identity/employees.txt");
        FileReader reader = new FileReader(path);
        BufferedReader buffer = new BufferedReader(reader);


        ArrayList<Programmer> programmers = new ArrayList<>();
        String line;

        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Programmer s = new Programmer();
            s.setName(pool[0]);
            s.setSecondName(pool[1]);
            s.setSalary(Double.valueOf(pool[2]));
            s.setSex(pool[3]);
            s.setAge(Integer.valueOf(pool[4]));
            //s.setLanguage(pool[5]);
            EmployeeUtil.getEmployees().add(s);
        }
        System.out.println(programmers.toString());
        return programmers;
    }
    /*programmers.get(0).getName() + " " + programmers.get(0).getLanguage() + " " + programmers.get(0).getSalary()*/

}
