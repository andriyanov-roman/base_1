package Lessons.LessonTwo;


import Homeworks.homework_1.Employee;


import java.io.*;
import java.util.ArrayList;

public class CompanyUtil {
    public static ArrayList<Company> getCompanies() throws IOException {
        return null;
//        File file = new File("alena/src/main/java/identity/companies.txt");
//        FileReader reader = new FileReader(file);
//        BufferedReader buffer = new BufferedReader(reader);
//        ArrayList<Company> companies = new ArrayList<>();
//        String line;
//        while ((line = buffer.readLine()) != null) {
//            String[] pool = line.split(":");
//            Company c = new Company();
//            c.setCompanyName(pool[0]);
//            for (int i = 1; i < pool.length; i++) {
//                String [] lines = pool[i].split(":");
//                Employee e = new Employee();
//                e.setName(lines[0]);
//                e.setSecondName(lines[1]);
//                e.setSalary(Double.valueOf(lines[2]));
//                e.setSex(lines[3]);
//                e.setAge(Integer.valueOf(lines[4]));
//                c.getEmployees().add(e);
//            }
//
//            companies.add(c);
//
//
//        } System.out.println(companies.toString());
//        return companies;

        /*Company c1 = new Company();
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        c1.setEmployees (new ArrayList<>());
        c1.getEmployees().add(employees.get(0));
        c1.getEmployees().add(employees.get(1));
        c1.getEmployees().add(employees.get(2));
        c1.setCompanyName("Fist");

        Company c2 = new Company();
        c2.setEmployees(new ArrayList<>());
        c2.getEmployees().add(employees.get(3));
        c2.getEmployees().add(employees.get(4));
        c2.getEmployees().add(employees.get(5));
        c2.setCompanyName("Beast");

        Company c3 = new Company();
        c3.setEmployees(new ArrayList<>());
        c3.getEmployees().add(employees.get(6));
        c3.getEmployees().add(employees.get(7));
        c3.getEmployees().add(employees.get(8));
        c3.setCompanyName("Finest");*/
        /*return new ArrayList<Company>(Arrays.asList(c1, c2, c3));*/
    }

    public static void findMaxSalary() throws IOException {
        ArrayList<Company> companies = getCompanies();
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

 /*   public void createNewEmployee (){
        Employee employee = new Employee();
        System.out.println("Write name -");
        employee.setName(scanner.next());
        System.out.println("Write secondName -");
        employee.setSecondName(scanner.next());
        System.out.println("Write salary -");
        employee.setSalary(scanner.next());
        System.out.println("Write age -");
        employee.setAge(scanner.next());
        System.out.println("Write age -");
        employee.setSex(scanner.next());
        System.out.println("Write sex -");
        employee.setSex(scanner.next());
        employees.add(employee);
        if ("Y".equals(scanner.next())) {
            createNewEmployee();
        }
    }*/

    /*private void createNewCompany() {
        Company company = new Company();
        System.out.println("Enter company name");
        company.setCompanyName(scanner.next());
        System.out.println("Do you want to continue? Y/N");
        companies.add(company);
        if ("Y".equals(scanner.next())) {
            createNewCompany();
        }
    }*/

    public void writeToFileEmployee (ArrayList<Employee> employees){
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

