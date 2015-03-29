package homeWork1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Kirill on 14.03.2015.
 */
public class CompanyUtil {
    public static Company c1;
    public static Company c2;
    public static Company c3;
    public static Company c4;
    public static ArrayList<Company> getCompany() throws IOException{
        ArrayList<Company> companies = new ArrayList<>();
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();

        c1 = new Company();
        c2 = new Company();
        c3 = new Company();
        c4 = new Company();


        c1.setEmployees(new ArrayList<Employee>());
        c1.getEmployees().add(employees.get(0));
        c1.getEmployees().add(employees.get(1));
        companies.add(c1);

        c2.setEmployees(new ArrayList<Employee>());
        c2.getEmployees().add(employees.get(2));
        c2.getEmployees().add(employees.get(3));
        companies.add(c2);

        c3.setEmployees(new ArrayList<Employee>());
        c3.getEmployees().add(employees.get(4));
        c3.getEmployees().add(employees.get(5));
        companies.add(c3);
        c4.setEmployees(new ArrayList<Employee>());
        c4.getEmployees().add(employees.get(6));
        c4.getEmployees().add(employees.get(7));
        companies.add(c4);

        c1.setCompanyName("SEDNA");


        c2.setCompanyName("MARKET");


        c3.setCompanyName("BMD");


        c3.setCompanyName("Exim");

        return new ArrayList<>(Arrays.asList(c1, c2, c3, c4));

    }

    public static void addEmployeesToFile() throws IOException {

        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        getCompany();
        for (int i = 0; i < c1.getEmployees().size(); i++ ) {
            FileWriter writer = new FileWriter("kkozhuhovskiy[kirill]/src/SednaEmployees.txt", true);
            writer.write(c1.getEmployees().get(i).getName() + ":" + c1.getEmployees().get(i).getSecondName() + ":" + c1.getEmployees().get(i).getAge() +
                    ":" + c1.getEmployees().get(i).getSalary() + ":"+ c1.getEmployees().get(i).getGender() + ("\n"));
            writer.flush();
            writer.close();
            FileWriter writerAllEmp = new FileWriter("kkozhuhovskiy[kirill]/src/AllEmployees.txt", true);
            writerAllEmp.write(c1.getCompanyName() + " " + c1.getEmployees().get(i).getName() + ":" + c1.getEmployees().get(i).getSecondName() + ":" + c1.getEmployees().get(i).getAge() +
                    ":" + c1.getEmployees().get(i).getSalary() + ":"+ c1.getEmployees().get(i).getGender() + ("\n"));
            writerAllEmp.flush();
            writerAllEmp.close();

        }
        for (int i = 0; i < c2.getEmployees().size(); i++ ) {
            FileWriter writer = new FileWriter("kkozhuhovskiy[kirill]/src/MarketEmployees.txt", true);
            writer.write( c2.getEmployees().get(i).getName() + ":" + c2.getEmployees().get(i).getSecondName() + ":" + c2.getEmployees().get(i).getAge() +
                    ":" + c2.getEmployees().get(i).getSalary() + ":"+ c2.getEmployees().get(i).getGender() + ("\n"));
            writer.flush();
            writer.close();
            FileWriter writerAllEmp = new FileWriter("kkozhuhovskiy[kirill]/src/AllEmployees.txt", true);
            writerAllEmp.write(c2.getCompanyName() + " " + c2.getEmployees().get(i).getName() + ":" + c2.getEmployees().get(i).getSecondName() + ":" + c2.getEmployees().get(i).getAge() +
                    ":" + c2.getEmployees().get(i).getSalary() + ":"+ c2.getEmployees().get(i).getGender() + ("\n"));
            writerAllEmp.flush();
            writerAllEmp.close();

        }


        for (int i = 0; i < c3.getEmployees().size(); i++ ) {
            FileWriter writer = new FileWriter("kkozhuhovskiy[kirill]/src/BmdEmployees.txt", true);
            writer.write( c3.getEmployees().get(i).getName() + ":" + c3.getEmployees().get(i).getSecondName() + ":" + c3.getEmployees().get(i).getAge() +
                    ":" + c3.getEmployees().get(i).getSalary() + ":"+ c3.getEmployees().get(i).getGender() + ("\n"));
            writer.flush();
            writer.close();
            FileWriter writerAllEmp = new FileWriter("kkozhuhovskiy[kirill]/src/AllEmployees.txt", true);
            writerAllEmp.write(c3.getCompanyName() + " " + c3.getEmployees().get(i).getName() + ":" + c3.getEmployees().get(i).getSecondName() + ":" + c3.getEmployees().get(i).getAge() +
                    ":" + c3.getEmployees().get(i).getSalary() + ":"+ c3.getEmployees().get(i).getGender() + ("\n"));
            writerAllEmp.flush();
            writerAllEmp.close();

        }
        for (int i = 0; i < c4.getEmployees().size(); i++ ) {
            FileWriter writer = new FileWriter("kkozhuhovskiy[kirill]/src/EximEmployees.txt", true);
            writer.write( c4.getEmployees().get(i).getName() + ":" + c4.getEmployees().get(i).getSecondName() + ":" + c4.getEmployees().get(i).getAge() +
                    ":" + c4.getEmployees().get(i).getSalary() + ":"+ c4.getEmployees().get(i).getGender() + ("\n"));
            writer.flush();
            writer.close();
            FileWriter writerAllEmp = new FileWriter("kkozhuhovskiy[kirill]/src/AllEmployees.txt", true);
            writerAllEmp.write(c4.getCompanyName() + " " + c4.getEmployees().get(i).getName() + ":" + c4.getEmployees().get(i).getSecondName() + ":" + c4.getEmployees().get(i).getAge() +
                    ":" + c4.getEmployees().get(i).getSalary() + ":"+ c4.getEmployees().get(i).getGender() + ("\n"));
            writerAllEmp.flush();
            writerAllEmp.close();

        }
    }
}



