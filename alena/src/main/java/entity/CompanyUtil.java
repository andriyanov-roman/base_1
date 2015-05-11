package entity;


import java.io.*;
import java.util.ArrayList;

public class CompanyUtil {
    public static ArrayList<Company> getCompanies() throws IOException {
        File file = new File("alena/src/main/java/identity/companies.txt.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Company> companies = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Company c = new Company();
            c.setCompanyName(pool[0]);
            for (int i = 1; i < pool.length; i++) {
                String [] lines = pool[i].split(":");
                Employee e = new Employee();
                e.setName(lines[0]);
                e.setSecondName(lines[1]);
                e.setSalary(Double.valueOf(lines[2]));
                e.setSex(lines[3]);
                e.setAge(Integer.valueOf(lines[4]));
                c.getEmployees().add(e);
            }

            companies.add(c);


        } System.out.println(companies.toString());
        return companies;

        /*Company c1 = new Company();
        ArrayList<Employee> Employees = EmployeeUtil.getEmployees();
        c1.setEmployees (new ArrayList<>());
        c1.getEmployees().add(Employees.get(0));
        c1.getEmployees().add(Employees.get(1));
        c1.getEmployees().add(Employees.get(2));
        c1.setCompanyName("Fist.txt");

        Company c2 = new Company();
        c2.setEmployees(new ArrayList<>());
        c2.getEmployees().add(Employees.get(3));
        c2.getEmployees().add(Employees.get(4));
        c2.getEmployees().add(Employees.get(5));
        c2.setCompanyName("Beast.txt");

        Company c3 = new Company();
        c3.setEmployees(new ArrayList<>());
        c3.getEmployees().add(Employees.get(6));
        c3.getEmployees().add(Employees.get(7));
        c3.getEmployees().add(Employees.get(8));
        c3.setCompanyName("Finest.txt");*/
        /*return new ArrayList<Company>(Arrays.asList(c1, c2, c3));*/
    }


}

