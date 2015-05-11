package apps.Employees;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CompanyUtil {
    public static Company c1;
    public static Company c2;
    public static Company c3;
    public static ArrayList<Company> getCompanies () throws IOException {
        ArrayList<Company> companies = new ArrayList<>();
        ArrayList<Employee> employees=EmployeesUtil.getEmployees();
        c1=new Company();
        c1.setEmployees(new ArrayList<>());
        c1.getEmployees().add(employees.get(0));
        c1.getEmployees().add(employees.get(1));
        c1.getEmployees().add(employees.get(8));
        c1.getEmployees().add(employees.get(2));
        companies.add(c1);
        c2=new Company();
        c2.setEmployees(new ArrayList<>());
        c2.getEmployees().add(employees.get(3));
        c2.getEmployees().add(employees.get(10));
        c2.getEmployees().add(employees.get(4));
        companies.add(c2);
        c3=new Company();
        c3.setEmployees(new ArrayList<>());
        c3.getEmployees().add(employees.get(5));
        c3.getEmployees().add(employees.get(6));
        c3.getEmployees().add(employees.get(9));
        c3.getEmployees().add(employees.get(7));
        companies.add(c3);
        c1.setCompanyName("Luxsoft");
        c2.setCompanyName("Microsoft");
        c3.setCompanyName("Sony");
        return new ArrayList<>(Arrays.asList(c1,c2,c3));
    }

    public static void addEmployeesToFile() throws IOException {
        ArrayList<Employee> employees=EmployeesUtil.getEmployees();
        getCompanies();
        for (int i = 0; i < c1.getEmployees().size(); i++) {
            FileWriter writer = new FileWriter("matveu/src/EmployeesLuxsoft.txt", true);
            writer.write(c1.getEmployees().get(i).getName() + ":" + c1.getEmployees().get(i).getSecondName() + ":" + c1.getEmployees().get(i).getSex() +
                    ":" + c1.getEmployees().get(i).getAge() + ":" + c1.getEmployees().get(i).getSalary() + "\n");
            writer.flush();
            writer.close();
            FileWriter writerAll = new FileWriter("matveu/src/EmployeesAll.txt", true);
            writerAll.write(c1.getEmployees().get(i).getName() + ":" + c1.getEmployees().get(i).getSecondName() + ":" + c1.getEmployees().get(i).getSex() +
                    ":" + c1.getEmployees().get(i).getAge() + ":" + c1.getEmployees().get(i).getSalary() + "\n");
            writerAll.flush();
            writerAll.close();
        }
        for (int i = 0; i < c2.getEmployees().size(); i++) {
            FileWriter writer = new FileWriter("matveu/src/EmployeesMicrosoft.txt", true);
            writer.write(c2.getEmployees().get(i).getName() + ":" + c2.getEmployees().get(i).getSecondName() + ":" + c2.getEmployees().get(i).getSex() +
                    ":" + c2.getEmployees().get(i).getAge() + ":" + c2.getEmployees().get(i).getSalary() + "\n");
            writer.flush();
            writer.close();
            FileWriter writerAll = new FileWriter("matveu/src/EmployeesAll.txt", true);
            writerAll.write(c2.getEmployees().get(i).getName() + ":" + c2.getEmployees().get(i).getSecondName() + ":" + c2.getEmployees().get(i).getSex() +
                    ":" + c2.getEmployees().get(i).getAge() + ":" + c2.getEmployees().get(i).getSalary() + "\n");
            writerAll.flush();
            writerAll.close();
        }
        for (int i = 0; i < c3.getEmployees().size(); i++) {
            FileWriter writer = new FileWriter("matveu/src/EmployeesSony.txt", true);
            writer.write(c3.getEmployees().get(i).getName() + ":" + c3.getEmployees().get(i).getSecondName() + ":" + c3.getEmployees().get(i).getSex() +
                    ":" + c3.getEmployees().get(i).getAge() + ":" + c3.getEmployees().get(i).getSalary() + "\n");
            writer.flush();
            writer.close();
            FileWriter writerAll = new FileWriter("matveu/src/EmployeesAll.txt", true);
            writerAll.write(c3.getEmployees().get(i).getName() + ":" + c3.getEmployees().get(i).getSecondName() + ":" + c3.getEmployees().get(i).getSex() +
                    ":" + c3.getEmployees().get(i).getAge() + ":" + c3.getEmployees().get(i).getSalary() + "\n");
            writerAll.flush();
            writerAll.close();
        }
    }
}
