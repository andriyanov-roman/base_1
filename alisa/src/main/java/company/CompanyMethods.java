package company;

import company.CompanyUtil;
import entity.Company;
import entity.Employee;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by admin on 02.04.15.
 */
public class CompanyMethods {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Company> companies = new ArrayList<>();



    public void showCompanies()throws IOException  {
    ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            System.out.println(companies.get(i).getCompanyName());
        }
    }

    public void getMaxSalary() throws IOException {
       ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            Employee temp = companies.get(i).getEmployees().get(0);
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                double salary = companies.get(i).getEmployees().get(j).getSalary();
                if (temp.getSalary() < salary) {
                    temp = companies.get(i).getEmployees().get(j);
                }
            }
            System.out.println(companies.get(i).getCompanyName() + " " + temp.getName() + " " + temp.getSalary());
        }
    }

    public String selectCompany() {
        System.out.println("Enter company name");
        return scanner.next();
    }

    public Company getCompByName(String name) throws IOException {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        Company company = companies.stream().filter(c -> c.getCompanyName().equals(name)).findAny().get();
//        for (int i = 0; i < getCompanies().size(); i++) {
//            if (name.equals(companies.get(i).getCompanyName())) {
//                return companies.get(i);
//            }
//        }
        return companies.stream().filter(c -> c.getCompanyName().equals(name)).findAny().get();
    }


    public static void sortBySalary(Company company) {
        for (int i = 0; i < company.getEmployees().size(); i++) {
            for (int j = 0; j < company.getEmployees().size() - 1; j++) {
                if (company.getEmployees().get(j).getSalary() < company.getEmployees().get(j + 1).getSalary()) {
                    Employee temp = company.getEmployees().get(j);
                    company.getEmployees().set(j, company.getEmployees().get(j + 1));
                    company.getEmployees().set((j + 1), temp);
                }

            }
        }
        System.out.println(company.getCompanyName());
        for (int j = 0; j < company.getEmployees().size(); j++) {
            System.out.println(company.getEmployees().get(j).getName() + " "
                    + company.getEmployees().get(j).getSurname() + " "
                    + company.getEmployees().get(j).getSalary());
        }
    }

    public void sortByAge(Company company) {
        for (int i = 0; i < company.getEmployees().size(); i++) {
            for (int j = 0; j < company.getEmployees().size() - 1; j++) {
                if (company.getEmployees().get(j).getAge() < company.getEmployees().get(j + 1).getAge()) {
                    Employee temp = company.getEmployees().get(j);
                    company.getEmployees().set(j, company.getEmployees().get(j + 1));
                    company.getEmployees().set((j + 1), temp);
                }

            }
        }
        System.out.println(company.getCompanyName());
        for (int j = 0; j < company.getEmployees().size(); j++) {
            System.out.println(company.getEmployees().get(j).getName() + " "
                    + company.getEmployees().get(j).getSurname() + " "
                    + company.getEmployees().get(j).getAge());
        }
    }

    public void sortBySurnameLength(Company company) {
        for (int i = 0; i < company.getEmployees().size(); i++) {
            for (int j = 0; j < company.getEmployees().size() - 1; j++) {
                if (company.getEmployees().get(j).getSurname().equals(company.getEmployees().get(j + 1).getSurname())) {
                    Employee temp = company.getEmployees().get(j);
                    company.getEmployees().set(j, company.getEmployees().get(j + 1));
                    company.getEmployees().set((j + 1), temp);
                }

            }
        }
        System.out.println(company.getCompanyName());
        for (int j = 0; j < company.getEmployees().size(); j++) {
            System.out.println(company.getEmployees().get(j).getName() + " "
                    + company.getEmployees().get(j).getSurname());
        }
    }

    public void createNewEmployee() {
        Employee employee = new Employee();
        System.out.println("Enter name");
        employee.setName(scanner.next());
        System.out.println("Enter surname");
        employee.setSurname(scanner.next());
        System.out.println("Enter salary");
        double salary = Double.valueOf(scanner.next());
        employee.setSalary(salary);
        System.out.println("Enter age");
        int age = Integer.valueOf(scanner.next());
        employee.setAge(age);
        System.out.println("Enter sex");
        employee.setSex(scanner.next());
        System.out.println("Do you want to continue? Y/N");
        employees.add(employee);
        if ("Y".equals(scanner.next())) {
            createNewEmployee();
        }
    }

    public void writeToFile(String path) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(path, true);
            writer.write(employees.toString());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
