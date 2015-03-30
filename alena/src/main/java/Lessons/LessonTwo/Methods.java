package Lessons.LessonTwo;

import entity.Company;
import entity.CompanyUtil;
import entity.Employee;
import Homeworks.homework_1.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by MacBook on 26.03.15.
 */
public class Methods {

    public static String ReadFromFile(String FileURL) throws IOException {
        File file = new File(FileURL);
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        String FileStrings = "";
        while ((line = buffer.readLine()) != null) {
            FileStrings = FileStrings + line + "\n";
        }
        System.out.println(FileStrings);
        return FileStrings;
    }

    public static void WriteToFile(String txt, String FileURL, Boolean AddToEnd) throws IOException {
        FileWriter writer = new FileWriter(FileURL, AddToEnd);
        writer.write(txt);
        writer.flush();
        writer.close();
    }

    public static void addNewEmployee(Scanner sc) throws IOException {
        Employee employee = new Employee();
        System.out.println("Введите Имя сотрудника: ");
        employee.setName(sc.next());
        System.out.println("Введите Фамилию сотрудника: ");
        employee.setSecondName(sc.next());
        System.out.println("Введите пол сотрудника: ");
        employee.setSex(sc.next());
        System.out.println("Введите возраст сотрудника: ");
        employee.setAge(sc.nextInt());
        System.out.println("Введите ЗП сотрудника: ");
        employee.setSalary(sc.nextInt());
        writeToFile(employee);
        System.out.println("Will you continue? Yes/No");
        if ("Yes".equals(sc.next())) {
            addNewEmployee(sc);
        } else {
            Main.letsBegin();
        }

    }

    private static void writeToFile(Employee employee) throws IOException {
        FileWriter writer = new FileWriter("alena/src/main/java/identity/employees.txt", true);
        writer.write(employee.getName() + ":" +
                employee.getSecondName() + ":" +
                employee.getSex() + ":" + employee.getAge() + ":" + employee.getSalary() + "\n");
        writer.flush();
        writer.close();
    }

    public static void findMaxSalary() throws IOException {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        double temp = companies.get(0).getEmployees().get(0).getSalary();
        String namey = companies.get(0).getEmployees().get(0).getName();
        for (int i = 0; i < companies.size(); i++) {
            if (companies.get(i).getEmployees().get(i).getSalary() > companies.get(0).getEmployees().get(0).getSalary()) {
                temp = companies.get(i).getEmployees().get(i).getSalary();
                namey = companies.get(i).getEmployees().get(i).getName();
            }
            System.out.println(companies.get(i).getEmployees().get(i).getName());

            break;


        }

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
                    + company.getEmployees().get(j).getSecondName() + " "
                    + company.getEmployees().get(j).getSalary());
        }
    }

    public void sortByAge(Company c) {
        for (int i = 0; i < c.getEmployees().size(); i++) {
            for (int j = 0; j < c.getEmployees().size() - 1; j++) {
                if (c.getEmployees().get(j).getAge() < c.getEmployees().get(j + 1).getAge()) {
                    Employee temp = c.getEmployees().get(j);
                    c.getEmployees().set(j, c.getEmployees().get(j + 1));
                    c.getEmployees().set((j + 1), temp);
                }

            }
        }
        System.out.println(c.getCompanyName());
        for (int j = 0; j < c.getEmployees().size(); j++) {
            System.out.println(c.getEmployees().get(j).getName() + " "
                    + c.getEmployees().get(j).getSecondName() + " "
                    + c.getEmployees().get(j).getAge());
        }
    }

    public void sortBySurnameLength(Company c) {
        for (int i = 0; i < c.getEmployees().size(); i++) {
            for (int j = 0; j < c.getEmployees().size() - 1; j++) {
                if (c.getEmployees().get(j).getSecondName().equals(c.getEmployees().get(j + 1).getSecondName())) {
                    Employee temp = c.getEmployees().get(j);
                    c.getEmployees().set(j, c.getEmployees().get(j + 1));
                    c.getEmployees().set((j + 1), temp);
                }

            }
        }
        System.out.println(c.getCompanyName());
        for (int j = 0; j < c.getEmployees().size(); j++) {
            System.out.println(c.getEmployees().get(j).getName() + " "
                    + c.getEmployees().get(j).getSecondName());
        }
    }


    public void writeToFileEmployee(ArrayList<Employee> employees) {
        FileWriter writer_employees = null;
        try {
            writer_employees = new FileWriter("alena/src/main/java/identity.employees.txt", true);
            writer_employees.write(employees.toString());
            writer_employees.flush();
            writer_employees.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
