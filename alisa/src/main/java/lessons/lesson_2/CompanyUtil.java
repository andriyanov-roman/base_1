package lessons.lesson_2;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by user on 14.03.2015.
 */
public class CompanyUtil {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Employee> employees = new ArrayList<>();

    public ArrayList<Company> getCompanies() {
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        ArrayList<Company> companies = new ArrayList<>();
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

    public void start() {
        String companyName;
        System.out.println("Enter command key: " +
                "\n 0.Show all companies " +
                "\n 1. Show an employee with MaxSalary " +
                "\n 2.Sort a company  by salary " +
                "\n 3.Sort a company  by age" +
                "\n 4.Sort a company  by surname length \n");
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
                case "5":
                    createNewEmployee();
                    writeToFile(employees);
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
                    + c.getEmployees().get(j).getSurname() + " "
                    + c.getEmployees().get(j).getAge());
        }
    }

    public void sortBySurnameLength(Company c) {
        for (int i = 0; i < c.getEmployees().size(); i++) {
            for (int j = 0; j < c.getEmployees().size() - 1; j++) {
                if (c.getEmployees().get(j).getSurname() == c.getEmployees().get(j + 1).getSurname()) {
                    Employee temp = c.getEmployees().get(j);
                    c.getEmployees().set(j, c.getEmployees().get(j + 1));
                    c.getEmployees().set((j + 1), temp);
                }

            }
        }
        System.out.println(c.getCompanyName());
        for (int j = 0; j < c.getEmployees().size(); j++) {
            System.out.println(c.getEmployees().get(j).getName() + " "
                    + c.getEmployees().get(j).getSurname());
        }
    }
    private void createNewEmployee() {
        Employee employee = new Employee();
        System.out.println("Enter name");
        employee.setName(scanner.next());
        System.out.println("Enter surname");
        employee.setSurname(scanner.next());
        System.out.println("Enter salary");
        employee.setSurname(scanner.next());
        System.out.println("Enter age");
        employee.setSurname(scanner.next());
        System.out.println("Enter sex");
        employee.setSurname(scanner.next());
        System.out.println("Do you want to continue? Y/N");
        employees.add(employee);
        if ("Y".equals(scanner.next())) {
            createNewEmployee();
        }
    }

    public void writeToFile(ArrayList<Employee> employees) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("alisa/src/result/test_write.txt", true);
            writer.write(employees.toString());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*public static void readFromFile (String [] args) throws IOException {
        File file = new File("alisa/src/result/test_write.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Employee> employees = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) !=null){
            String [] pool = line.split(":");
            Employee e = new Employee();
            e.setName(pool[0]);
            e.setSurname(pool[1]);
            e.setSalary (Double.valueOf(pool[2]));
            e.setAge(Integer.valueOf(pool[3]));
            e.setSex(pool[4]);
            employees.add(e);
        }
        System.out.println(employees.toString());
    }
    */
}






