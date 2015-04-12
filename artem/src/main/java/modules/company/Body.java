package modules.company;

import entity.company.Employee;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by R-Tem on 06.04.2015.
 */
public class Body {
    private static void menu() {
        System.out.println(
                "\n1. Get all employees from all companies" +
                        "\n2. Get employee with max Salary" +
                        "\n3. Sort employees" +
                        "\n4. Add employees" +
//                "\n5. Fire employees" +
//                "\n6. Increase the salary for 15%" +
                        "\n7. Add company" +
                        "\n0. Exit program"   );
    }
    public static void start() throws IOException{
        do {
            menu();
            switch (homework.Body.scanner.next()){
                case "1":
                    for (int i = 0; i < CompanyUtil.companies.length; i++) {
                        ArrayList<Employee> employees = EmployeeUtil.getEmployees(("artem/src/main/java/files/companies/" + CompanyUtil.companies[i]), ":");
                        EmployeeUtil.showEmployees(CompanyUtil.companies[i], employees);
                    }
                    break;
                case "2": CompanyUtil.getMaxSalary(); break;
                case "3": CompanyUtil.sortBy(); break;
                case "4":
                    boolean b = true;
                    do {
                        System.out.println(" Select company:");
                        for(int i = 1; i <= CompanyUtil.companies.length; i++) System.out.println(" " + (i) + " - " + CompanyUtil.companies[i - 1]);
                        System.out.println(" a - Add company\n c - Come back");
                        String s = homework.Body.scanner.next();
                        int i = 0;
                        try {i = Integer.parseInt(s);}
                        catch (Exception e) {
                            if (s.equals("c")){ start(); }
                            if (s.equals("a")){ EmployeeUtil.addEmployee(s); start();}
                            System.out.println("Wrong input! The input must be an positive Integer number. Try again.");
                        }
                        if (i > 0 && i <= CompanyUtil.companies.length){
                            EmployeeUtil.addEmployee(CompanyUtil.companies[i-1]);
                            b = false;
                        }
                        if(i < 0 || i > CompanyUtil.companies.length) System.out.println("No such case\nSelect an option!");
                    } while (b);
                case "7":
                    System.out.print(" Enter company name: ");
                    String s = homework.Body.scanner.next();
                    ArrayList<Employee> employees = new ArrayList<>();
                    CompanyUtil.addCompany(s, employees);
                case "0": System.exit(0); break;
                default: System.out.println("No such case");
            }
} while (true);
    }
}
