package Lessons.LessonTwo.lesson_3;



import Lessons.LessonTwo.Company;

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
        ArrayList<Company> companies = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Company c = new Company();
            c.setCompanyName(pool[0]);
           *//* c.setEmployees(pool[1]);*//*
            *//*e.setSalary(Double.valueOf(pool[2]));
            e.setSex(pool[3]);
            e.setAge(Integer.valueOf(pool[4]));*//*
            companies.add(c);


        } System.out.println(companies.toString());
        return companies;

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
        }return strings;
    }




}
