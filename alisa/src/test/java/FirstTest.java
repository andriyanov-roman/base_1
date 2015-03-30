import entity.Admin;
import lessons.lesson_2.Company;
import lessons.lesson_2.Employee;
import lessons.lesson_2.EmployeeUtil;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Администратор on 06.03.2015.
 */
public class FirstTest {
    String companyName;
    ArrayList<Employee> employees = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Test
    public void doSomething() throws Exception {
        ArrayList<Employee> employees = new ArrayList<>();
        String companyName = "Lenovo";
        // createNewEmployee();
        writeToFile(getCompByName(companyName), "src/result/IBM.txt");
        readFromFile("src/result/IBM", ":");
        System.out.println(employees.toString());

    }


    public void writeToFile(Company company, String path) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(path, true);
            writer.write(company.getCompanyName() + ":" + "\n");
            writer.write(company.getEmployees().toString() + "\n");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Company getCompByName(String name) {
        ArrayList<Company> companies = getCompanies();
        return companies.stream().filter(c -> c.getCompanyName().equals(name)).findAny().get();
    }

    public ArrayList<Company> getCompanies() {
        ArrayList<Company> companies = new ArrayList<>();
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        Company c1 = new Company();
        c1.setCompanyName("Lenovo");
        c1.setEmployees(new ArrayList<>());
        c1.getEmployees().add(employees.get(0));
        c1.getEmployees().add(employees.get(1));
        c1.getEmployees().add(employees.get(2));
        companies.add(c1);

        Company c2 = new Company();
        c2.setCompanyName("IBM");
        c2.setEmployees(new ArrayList<>());
        c2.getEmployees().add(employees.get(3));
        c2.getEmployees().add(employees.get(4));
        c2.getEmployees().add(employees.get(5));
        companies.add(c2);


        Company c3 = new Company();
        c3.setCompanyName("Luxoft");
        c3.setEmployees(new ArrayList<>());
        c3.getEmployees().add(employees.get(6));
        c3.getEmployees().add(employees.get(7));
        c3.getEmployees().add(employees.get(8));
        companies.add(c3);
        return new ArrayList<>(Arrays.asList(c1, c2, c3));
    }

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

    public ArrayList<Employee> getEmployees(String path, String regExp) throws IOException {
        ArrayList<String[]> strings = readFromFile(path, regExp);

        String line;
        for (int i = 0; i < strings.size(); i++) {
            Company c = new Company();
            c.setCompanyName(strings.get(i)[0]);
            Employee e = new Employee();
            e.setName(strings.get(i)[1]);
            e.setSurname(strings.get(i)[2]);
            e.setSalary(Double.valueOf(strings.get(i)[3]));
            e.setAge(Integer.valueOf(strings.get(i)[4]));
            e.setSex(strings.get(i)[5]);
            employees.add(e);
        }

        return employees;
    }

}

