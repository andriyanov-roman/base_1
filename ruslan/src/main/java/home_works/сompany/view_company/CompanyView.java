package home_works.сompany.view_company;

import entity.ConsoleView;
import home_works.сompany.entities.company.Company;
import home_works.сompany.entities.company.Employee;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 08.04.2015.
 */


public class CompanyView extends ConsoleView {
    protected Scanner scanner;
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Company> companies = new ArrayList<>();

    public CompanyView(Scanner scanner) {
        super(scanner);
    }

    public void start() {
        System.out.println("Виберіть пункт " + "\n" +
                "1: Добавити нового співробітника" + "\n" +
                "2: Повернутись до попереднього меню " + "\n" +
                "3.  Інформація про співробітників." + "\n" +
                "4.  Інформація про заробітню платню робітників. Максимальна зарплата." + "\n" +
                "5.  Інформація про робітників, тезки. Показати їх." + "\n" +
                "6.  Відсортуватти робітників компанії №1, по  зарплаті." + "\n" +
                "7.  Відсортуватти робітників компанії №2, по віку." + "\n" +
                "8.  Відсортуватти робітників компанії №3, по довжині прізвища." + "\n" +
                "9.  Добавить робітника." + "\n" +
                "10.  Ввести нового робітника або вивести в консоль того якогоо добавили." + "\n" +
                "11.  Підняти зарплату всім чоловікам та звільнити всіх жінок." + "\n" +
                "12. Повернутись у попереднэ меню");

        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":

                    break;
                case "2":
                    start();
                    return;
                case "3":

                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                case "9":
                    break;
                case "10":
                    break;
                case "11":
                    break;
                case "12":
                    break;
                case "13":
                    break;
                case "14":
                    return;
            }
        }
    }

    private void showInfoByEmployees() throws IOException{

    }



    private void createNewEmployee() throws IOException{
        Employee employee = new Employee();
        System.out.println("Enter name");
        employee.setName(scanner.next());
        System.out.println("Enter surname");
        employee.setSecondName(scanner.next());
        System.out.println("Enter salary");
        double salary = Double.valueOf(scanner.next());
        employee.setSalary(salary);
        System.out.println("Enter age");
        int age = Integer.valueOf(scanner.next());
        employee.setAge(age);
        System.out.println("Enter sex");
        employee.setGender(scanner.next());
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



