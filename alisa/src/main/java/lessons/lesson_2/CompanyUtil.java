package lessons.lesson_2;


import java.util.Scanner;

/**
 * Created by user on 14.03.2015.
 */
public class CompanyUtil {
    public static Company[] getCompanies() {
       Employee[] employees = EmployeeUtil.getEmployees();
       Company c1 = new Company();
       c1.setCompanyName("Lenovo");c1.setEmployees(new Employee[]{employees[0], employees[1], employees[2]});

       Company c2 = new Company();
       c2.setCompanyName("IBM");
        c2.setEmployees(new Employee[]{employees[3], employees[4], employees[5]});

       Company c3 = new Company();
       c3.setCompanyName("Luxoft");
        c3.setEmployees(new Employee[]{employees[6], employees[7], employees[8]});
      return new Company[]{c1, c2, c3};
   }

   public static void start() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter command key" + " " +
                        "0.Show all companies \t 1. Show employee with MaxSalary \n "
      );
        while (scanner.hasNext()) {
           switch (scanner.next()) {
                case "0":
                   showCompanies();
                    break;
                case "1":
                    getMaxSalary();
                    break;
               case "Exit":
                   System.exit(0);
               default:
                   System.out.println("No such case");
            }
        }
    }

   public static void showCompanies() {
        Company[] companies = getCompanies();
        for (int i = 0; i < companies.length; i++) {
           System.out.println(companies[i].getCompanyName());
       }
    }
    public static void getMaxSalary() {
       Company[] companies = getCompanies();
       for (int i = 0; i < companies.length; i++) {
            Employee temp = companies[i].getEmployees()[0];
            for (int j = 0; j < companies[i].getEmployees().length; j++) {
               double salary = companies[i].getEmployees()[j].getSalary();
                if (temp.getSalary() < salary) {
                    temp = companies[i].getEmployees()[j];
                }
            }
            System.out.println(companies[i].getCompanyName() + " " + temp.getSalary());
       }
    }
}




