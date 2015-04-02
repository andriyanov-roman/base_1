package lessons.lesson_2;


import entity.Admin;
import entity.Manager;
import entity.Programmer;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by user on 14.03.2015.
 */
public class CompanyUtil {
    private String companyName;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Admin> admins = new ArrayList<>();
    private ArrayList<Manager> managers = new ArrayList<>();
    private ArrayList<Company> companies = new ArrayList<>();
    private ArrayList<Programmer> programmers = new ArrayList<>();

    public ArrayList<Company> getCompanies() {
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

    public void start() throws IOException {

        System.out.println("Enter command key: " +
                "\n 0.Show all companies " +
                "\n 1. Show an employee with MaxSalary " +
                "\n 2.Sort a company  by salary " +
                "\n 3.Sort a company  by age" +
                "\n 4.Sort a company  by surname length" +
                "\n 5.Add a new employee to Lenovo" +
                "\n 6. Add a new employee to IBM" +
                "\n 7.Add a new employee to Luxoft \n");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "0":
                    showCompanies();
                    break;
                case "1":
                    getMaxSalary();
                    break;
                case "2":
                    companyName = checkInput();
                    sortBySalary(getCompByName(companyName));
                    break;
                case "3":
                    companyName = checkInput();
                    sortByAge(getCompByName(companyName));
                    break;
                case "4":
                    companyName = checkInput();
                    sortBySurnameLength(getCompByName(companyName));
                    break;
                case "5":
                    createNewEmployee();
                    writeToFile( "alisa/src/result/Lenovo.txt");
                    readFromFile("alisa/src/result/Lenovo.txt", ":");
                    System.out.println(employees.toString());
                    break;
                case "6":
                    createNewEmployee();
                    writeToFile( "alisa/src/result/IBM.txt");
                    readFromFile("alisa/src/result/IBM.txt", ":");
                    System.out.println(employees.toString());
                    break;
                case "7":
                    createNewEmployee();
                    writeToFile("alisa/src/result/Luxoft.txt");
                    readFromFile("alisa/src/result/Luxoft.txt", ":");
                    System.out.println(employees.toString());
                    break;
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("No such case");
            }
        }
    }


    public void showCompanies() {
        ArrayList<Company> companies = getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            System.out.println(companies.get(i).getCompanyName());
        }
    }

    public void getMaxSalary() {
        ArrayList<Company> companies = getCompanies();
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

    public String checkInput() {
        System.out.println("Enter company name");
        return scanner.next();
    }

    public Company getCompByName(String name) {
        ArrayList<Company> companies = getCompanies();
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

    private void createNewEmployee() {
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

   /* public ArrayList<Employee> getEmployees(String path, String regExp) throws IOException {
        ArrayList<String[]> strings = readFromFile(path, regExp);
        ArrayList<Employee> employees = new ArrayList<>();
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
    }*/
}





