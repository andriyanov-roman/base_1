package lessons.lesson_2;


import java.io.*;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by user on 14.03.2015.
 */
public class CompanyUtil {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Company> companies = new ArrayList<>();

    public ArrayList<Company> getCompanies() {
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        //ArrayList<Company> companies = new ArrayList<>();
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
        String companyName;
        System.out.println("Enter command key: " +
                "\n 0.Show all companies " +
                "\n 1. Show an employee with MaxSalary " +
                "\n 2.Sort a company  by salary " +
                "\n 3.Sort a company  by age" +
                "\n 4.Sort a company  by surname length" +
                "\n 5.Add a new employee" +
                "\n 6. Add a new company" +
                "\n 7.Show all employees");
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
                    writeToFileEmployee(employees);
                    System.out.println(employees.toString());
                    break;
                case "6":
                    createNewCompany();
                    writeToFileCompany(companies);
                    System.out.println(companies.toString());
                    break;
                case "7":
                    readFromFile();
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
                if (c.getEmployees().get(j).getSurname().equals(c.getEmployees().get(j + 1).getSurname())) {
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

    private void createNewCompany() {
        Company company = new Company();
        System.out.println("Enter company name");
        company.setCompanyName(scanner.next());
        System.out.println("Do you want to continue? Y/N");
        companies.add(company);
        if ("Y".equals(scanner.next())) {
            createNewCompany();
        }
    }

    public void writeToFileEmployee(ArrayList<Employee> employees) {
        FileWriter writer_employees = null;
        try {
            writer_employees = new FileWriter("alisa/src/result/employees.txt", true);
            writer_employees.write(employees.toString());
            writer_employees.flush();
            writer_employees.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeToFileCompany(ArrayList<Company> companies) {
        FileWriter writer_companies = null;
        try {
            writer_companies = new FileWriter("alisa/src/result/companies.txt", true);
            writer_companies.write(companies.toString());
            writer_companies.flush();
            writer_companies.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void readFromFile() throws IOException {
        File employee = new File("alisa/src/result/employees.txt");
        File company = new File("alisa/src/result/companies.txt");
        FileReader reader_e = new FileReader(employee);
        FileReader reader_c = new FileReader(company);
        BufferedReader buffer_e = new BufferedReader(reader_e);
        BufferedReader buffer_c = new BufferedReader(reader_c);
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Company> companies = new ArrayList<>();
        String line;
        while ((line = buffer_e.readLine()) != null) {
            String[] pool = line.split(":");
            Employee e = new Employee();
            e.setName(pool[0]);
            e.setSurname(pool[1]);
            e.setSalary(Double.valueOf(pool[2]));
            e.setAge(Integer.valueOf(pool[3]));
            e.setSex(pool[4]);
            employees.add(e);
        }
        while ((line = buffer_c.readLine()) != null) {
            String[] pool = line.split(":");
            Company c = new Company();
            c.setCompanyName(pool[0]);
          /* Employee e1 = new Employee;
            e1.setName = pool[0];
            e1.setSurname = pool[1];*/


            companies.add(c);
        }
        System.out.println(employees.toString());
        System.out.println(companies.toString());
    }

}






