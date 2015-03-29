package homeWork1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kirill on 24.03.2015.
 */
public class Methods {

    static Scanner scanner = new Scanner(System.in);

    public static void findCompName() throws IOException {
        ArrayList<Company> companies = CompanyUtil.getCompany();
        for (int i = 0; i < companies.size(); i++) {
            System.out.println("Company name : " + companies.get(i).getCompanyName());
        }
    }

    public static void maxCompSalary() throws IOException {
        ArrayList<Company> companies = CompanyUtil.getCompany();
        for (int i = 0; i < 1; i++) {
            for (int s = companies.get(i).getEmployees().size() - 1; s >= 0; s--) {
                double temp = companies.get(i).getEmployees().get(s).getSalary();
                for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                    double salary = companies.get(i).getEmployees().get(j).getSalary();
                    if (temp < salary) {

                    }
                    System.out.println(companies.get(i).getEmployees().get(j).getSalary() + "Salary more than" + companies.get(i).getEmployees().get(s).getSalary());
                }


            }
        }
    }


    public static void sortAgeInComp() throws IOException {
        ArrayList<Company> companies = CompanyUtil.getCompany();
        for (int i = 1; i < 2; i++) {
            for (int s = companies.get(i).getEmployees().size() - 1; s >= 0; s--) {
                int temp = companies.get(i).getEmployees().get(s).getAge();
                for (int c = 0; c < companies.get(i).getEmployees().size(); c++) {
                    int age = companies.get(i).getEmployees().get(c).getAge();
                    if (temp < age) ;
                    System.out.println("Age" + companies.get(i).getEmployees().get(c).getAge() + " " + companies.get(i).getEmployees().get(s).getAge());
                }
            }
        }
    }

    static void secondNameLength() throws IOException {
        ArrayList<Company> companies = CompanyUtil.getCompany();

        for (int i = 2; i < 3; i++) {
            for (int c = 0; c < companies.get(i).getEmployees().size(); c++) {
                int tempSize = companies.get(i).getEmployees().get(c).getSecondName().length();


                System.out.println(companies.get(i).getEmployees().get(c).getSecondName() + "have second name length " + tempSize);
            }
        }
    }

    public static void findEmployeeUserSalary() {

        ArrayList<Employee> workers = EmployeeUtil.getEmployees();
        for (int i = 0; i < workers.size(); i++) {
            double temp = workers.get(i).getSalary();
            if (workers.get(i).getSalary() > temp) ;
            System.out.println(workers.get(i).getName() + workers.get(i).getSecondName() + "Have salary : " + workers.get(i).getSalary() + " more salary than " + temp);
        }

    }

    public static void showIdUsers() {
        User[] users = UserUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getName() + "have id" + users[i].getId());
        }
    }

    public static void findMatches() {
        User[] users = UserUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].getLogin().equals(users[i].getName()))
                System.out.println("User " + users[i] + " have matched login with name");
            for (int c = 0; c < users.length; c++) {
                if (users[c].getLogin().equals(users[c].getSecondName()))
                    System.out.println("User" + users[c] + " have matched login with second name");
            }
        }

    }

    public static void showUsers() {
        User[] users = UserUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.print(users[i].getName() + " " + users[i].getSecondName());
        }
        System.out.println();
    }

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
            FileWriter writer = new FileWriter("kkozhuhovskiy[kirill]/src/SednaEmployees.txt", true);
            writer.write(employee.getName() + ":" + employee.getSecondName() + ":" + employee.getGender() +
                    ":" + employee.getAge() + ":" + employee.getSalary() + "\n");
            writer.flush();
            writer.close();

            FileWriter writerAllEmp = new FileWriter("kkozhuhovskiy[kirill]/src/AllEmployees.txt", true);
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
            FileWriter writer = new FileWriter("kkozhuhovskiy[kirill]/src/MarketEmployees.txt", true);
            writer.write(employee.getName() + ":" + employee.getSecondName() + ":" + employee.getGender() +
                    ":" + employee.getAge() + ":" + employee.getSalary() + "\n");
            writer.flush();
            writer.close();

            FileWriter writerAllEmp = new FileWriter("kkozhuhovskiy[kirill]/src/AllEmployees.txt", true);
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
