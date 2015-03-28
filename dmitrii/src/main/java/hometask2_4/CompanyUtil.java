package hometask2_4;

import entities.Company;
import entities.Employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 14.03.2015.
 */
class CompanyUtil {
    public static ArrayList<Company> getCompanies() throws IOException {
        //ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        Company c1 = CompanyParse("dmitrii\\src\\main\\resources\\companies\\Brabus.txt");
        Company c2 = CompanyParse("dmitrii\\src\\main\\resources\\companies\\Volvo.txt");
        Company c3 = CompanyParse("dmitrii\\src\\main\\resources\\companies\\ZAZ.txt");
        return new ArrayList<Company> (Arrays.asList(c1, c2, c3));
    }
    public static Company CompanyParse (String url) throws IOException {
        Company com = new Company();
        com.setEmployees(new ArrayList<>());
        String [] pool = FileUtil.ReadFromFile(url).split("\n");
        com.setCompanyName(pool[0]);
        com.setFilePath(url);
        for (int i = 1; i < pool.length; i++) {
            String [] lines = pool[i].split(":");
                Employee e = new Employee();
                e.setName(lines[0]);
                e.setSurname(lines[1]);
                e.setSalary(Double.valueOf(lines[2]));
            if (lines[3].equals("true")) {e.setGender(true);}
            else e.setGender(false);
                e.setAge(Integer.valueOf(lines[4]));
                com.getEmployees().add(e);
        }
        return com;
    }
}
