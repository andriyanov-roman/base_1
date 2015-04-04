package homeWork1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kirill on 03.04.2015.
 */
public class EmployeeMethods {
    static Scanner scanner = new Scanner(System.in);
    public static void addUserInComp() throws IOException {
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        ArrayList<Company> companies = CompanyUtil.getCompany();
        Employee newEmployee = new Employee();

        try {
            System.out.println("Введите имя нового сотрудника");
            newEmployee.setName(scanner.nextLine());
            System.out.println("Введите фамилию нового сотрудника");
            newEmployee.setSecondName(scanner.nextLine());
            System.out.println("Введите зарпалату нового сотрудника");
            newEmployee.setSalary(scanner.nextDouble());
            System.out.println("Введите пол нового сотрудника");
            newEmployee.setGender(scanner.nextLine());
            System.out.println("Введите возраст нового сотрудника");
            newEmployee.setAge(scanner.nextInt());
            employees.add(newEmployee);
        } catch (Exception e) {
        }


    }

    public static void CreateNewUserEmployeeToSedna() throws IOException {
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        ArrayList<Company> companies = CompanyUtil.getCompany();
        Employee employee = new Employee();
        try {
            System.out.println("Введите имя");
            employee.setName(scanner.nextLine());
            System.out.println("sname");
            employee.setSecondName(scanner.nextLine());
            System.out.println("age");
            employee.setAge(scanner.nextInt());
            System.out.println("male");
            employee.setGender(scanner.nextLine());
            System.out.println("salary");
            employee.setSalary(scanner.nextDouble());
            employees.add(employee);
            FileWriter writer = new FileWriter("kkozhuhovskiy\\src\\main\\java\\SednaEmployees.txt", true);
            writer.write(employee.getName() + ":" + employee.getSecondName() + ":" + employee.getGender() +
                    ":" + employee.getAge() + ":" + employee.getSalary() + "\n");
            writer.flush();
            writer.close();

            FileWriter writerAllEmp = new FileWriter("kkozhuhovskiy\\src\\main\\java\\AllEmployees.txt", true);
            writerAllEmp.write(employee.getName() + ":" + employee.getSecondName() + ":" + employee.getGender() +
                    ":" + employee.getAge() + ":" + employee.getSalary() + "\n");
            writerAllEmp.flush();
            writerAllEmp.close();

        } catch (Exception e) {
        }
    }


    public static void CreateNewUserEmployeeToMarket() throws IOException {
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        ArrayList<Company> companies = CompanyUtil.getCompany();
        Employee employee = new Employee();
        try {
            System.out.println("Введите имя сотрудника");
            employee.setName(scanner.nextLine());
            System.out.println("Введите фамилию");
            employee.setSecondName(scanner.nextLine());
            System.out.println("Введите возраст сотрудника ");
            employee.setAge(scanner.nextInt());
            System.out.println("Ввидите пол сотрудника");
            employee.setGender(scanner.nextLine());
            System.out.println("Введите зарплату сотрудника");
            employee.setSalary(scanner.nextDouble());
            employees.add(employee);
            FileWriter writer = new FileWriter("kkozhuhovskiy\\src\\main\\java\\MarketEmployees.txt", true);
            writer.write(employee.getName() + ":" + employee.getSecondName() + ":" + employee.getGender() +
                    ":" + employee.getAge() + ":" + employee.getSalary() + "\n");
            writer.flush();
            writer.close();

            FileWriter writerAllEmp = new FileWriter("kkozhuhovskiy\\src\\main\\java\\AllEmployees.txt", true);
            writerAllEmp.write(employee.getName() + ":" + employee.getSecondName() + ":" + employee.getGender() +
                    ":" + employee.getAge() + ":" + employee.getSalary() + "\n");
            writerAllEmp.flush();
            writerAllEmp.close();

        } catch (Exception e) {
        }
        System.out.println("Press 1 = Info add user");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    System.out.print(employee.getName() + " " + employee.getSecondName() + ". Gender: " + employee.getGender() + ". Age: " +
                            employee.getAge() + ". Salary: " + employee.getSalary());
                case "2":
                    System.out.println("в работе, доделать класс выводящий сотрудников");
            }
        }
    }
}
