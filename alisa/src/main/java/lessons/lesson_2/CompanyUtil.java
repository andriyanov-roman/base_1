package lessons.lesson_2;


import entity.Admin;
import entity.Manager;
import entity.Programmer;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by user on 14.03.2015.
 */
public class CompanyUtil {


    public static ArrayList<String[]> readFromFile(String path, String regExp) throws IOException {
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
    public  ArrayList<Company> getCompanies() throws IOException {
        Company c1 = CompanyParse("alisa/src/result/Lenovo.txt");
        Company c2 = CompanyParse("alisa/src/result/IBM.txt");
        Company c3 = CompanyParse("alisa/src/result/Luxoft.txt");
        return new ArrayList<Company> (Arrays.asList(c1, c2, c3));
    }
    public  Company CompanyParse (String path) throws IOException {
        Company company = new Company();
        company.setEmployees(new ArrayList<>());
        ArrayList<String[]> strings = readFromFile(path,":");
        company.setCompanyName( strings.get(0)[0]);
           for (int i = 1; i < strings.size(); i++) {
               Employee e = new Employee();
               e.setName(strings.get(i)[1]);
               e.setSurname(strings.get(i)[2]);
               e.setSalary(Double.valueOf(strings.get(i)[3]));
               e.setAge(Integer.valueOf(strings.get(i)[4]));
               e.setSex(strings.get(i)[5]);
               company.getEmployees().add(e);
           }
        return company;
    }



}





