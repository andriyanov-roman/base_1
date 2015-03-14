package lessons.lesson_2;

import homework.hw_1.Employee;

import java.util.Scanner;

/**
 * Created by user on 14.03.2015.
 */
public class CompanyUtil {
    public static Company [] getCompanies(){
        Company c1 = new Company();
        Employee[] employees = EmployeeUtil.getEmployees();
       // c1.companyName = "Lenovo";
      //  c1.employees = new Employee [] {employees [0], employees[1], employees[2]};

        Company c2 = new Company();
      //  c2.companyName = "IBM";
      //  c2.employees = new Employee [] {employees [3], employees[4], employees[5]};

        Company c3 = new Company();
       // c3.companyName = "Luxoft";
       // c3.employees = new Employee [] {employees [6], employees[7], employees[8]};
        return new Company [] {c1,c2,c3};

    }
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command key" + " " +
                        "0.Show all companies \t 1. Show employees salaries ranging \n "
        );
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "0":
                    showCompanies();
                    break;
                case "1":
                    showEmployeeMaxSalary();
               break;
           }
        }
    }
    public static void showCompanies (){
        Company [] companies = getCompanies();
        for (int i = 0; i < companies.length ; i++) {
          //  for (int j = 0; j < companies[i].employees.length; j++) {

            }
            //System.out.println(companies[i].companyName);
        }


        //}

    public static void showEmployeeMaxSalary(){
        Company [] companies = getCompanies();
        Company EmployeeMaxSalary = companies [0];
      //  Employee MaxSalary = companies[0].employees[0];
       // for (int i = 0; i < companies[i].employees.length; i++) {
           // for (int j = 0; j < companies[i].employees[i].length; j++) {

            }

        }



