package home_works.сompany.model_methods;

import home_works.сompany.entities.company.Company;
import home_works.сompany.entities.company.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 17.04.2015.
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
    public  static ArrayList <Company> getCompanies() throws IOException {
        Company c1 = CompanyParse("ruslan/src/java/files.txt/IBM.txt");
        Company c2 = CompanyParse("ruslan/src/java/files.txt/Sony.txt");
        Company c3 = CompanyParse("ruslan/src/java/files.txt/HP.txt");
        return new ArrayList <Company> (Arrays.asList(c1, c2, c3));
    }
    public  static Company CompanyParse (String path) throws IOException {
        Company company = new Company();
        company.setEmployees(new ArrayList<>());
        ArrayList<String[]> strings = readFromFile(path,":");
        company.setCompanyName( strings.get(0)[0]);
        for (int i = 1; i < strings.size(); i++) {
            Employee e = new Employee();
            e.setName(strings.get(i)[0]);
            e.setSecondName(strings.get(i)[1]);
            e.setSalary(Double.valueOf(strings.get(i)[2]));
            e.setAge(Integer.valueOf(strings.get(i)[3]));
            e.setGender(strings.get(i)[4]);
            company.getEmployees().add(e);
        }
        return company;
    }
}
