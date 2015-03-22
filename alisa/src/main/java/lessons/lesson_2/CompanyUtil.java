package lessons.lesson_2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 14.03.2015.
 */
public class CompanyUtil {

    public static ArrayList<Company> getCompanies() {
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        ArrayList<Company> companies = new ArrayList <>();
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

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command key: " +
                "\n 0.Show all companies " +
                "\n 1. Show employee with MaxSalary " +
                "\n 2.Sort first company  by salary " +
                "\n 3.Sort second company  by age" +
                "\n 4.Sort third company  by surname length \n");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "0":
                    showCompanies();
                    break;
                case "1":
                    getMaxSalary();
                    break;
                case "2":
                 // SortBySalary(c1);
                    break;
                case "3":
                  //  SortByAge(c2);
                    break;
               case "4":
                 // SortBySurnameLength(c3);
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("No such case");
            }
        }
    }

    public static void showCompanies() {
        ArrayList <Company> companies = getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            System.out.println(companies.get(i).getCompanyName());
        }
    }

    public static void getMaxSalary() {
        ArrayList <Company> companies = getCompanies();
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

    public static void SortBySalary(Company c1 ) {
        ArrayList <Company> companies = getCompanies();
        for (int i = 0; i < c1.getEmployees().size(); i++) {
            for (int j = 0; j < c1.getEmployees().size() - 1; j++) {
                if (c1.getEmployees().get(j).getSalary() < c1.getEmployees().get(j + 1).getSalary()) {
                    Employee temp = c1.getEmployees().get(j);
                    c1.getEmployees().set(j, c1.getEmployees().get(j + 1));
                    c1.getEmployees().set((j + 1), temp);
                }

            }
        }
        System.out.println(c1.getCompanyName());
        for (int j = 0; j < c1.getEmployees().size(); j++) {
            System.out.println(c1.getEmployees().get(j).getName() + " "
                    + c1.getEmployees().get(j).getSurname() + " "
                    + c1.getEmployees().get(j).getSalary());
        }
    }
    public static void SortByAge(Company c) {
        ArrayList <Company> companies = getCompanies();
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
    public static void SortBySurnameLength(Company c) {
        ArrayList <Company> companies = getCompanies();
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
}





