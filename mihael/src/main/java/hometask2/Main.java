package hometask2;

import java.util.Scanner;
/**
 * Created by user on 14.03.2015.
 */
public class Main {

    public static void main (String[] args){
        start();
    }

    public static void start(){
        Scanner scanner = new Scanner(System.in);
        boolean first = true;
        showMenu();
        while (scanner.hasNext()) {
            if (first) {first=false;}
            else {

                switch (scanner.next()) {
                    case "1":
                        CompanyUtil.showAllEmployees();
                        break;
                    case "2":
                        Employee[] sorted1 = CompanyUtil.sortBySalary(CompanyUtil.getCompanies()[0].getEmployees());
                        CompanyUtil.showEmployees(sorted1);
                        break;
                    case "3":
                        Employee[] sorted2 = CompanyUtil.sortByAge(CompanyUtil.getCompanies()[2].getEmployees());
                        CompanyUtil.showEmployees(sorted2);
                        break;

                    case "4":
                        Employee[] sorted3 = CompanyUtil.sortByLastNameLength(CompanyUtil.getCompanies()[2].getEmployees());
                        CompanyUtil.showEmployees(sorted3);
                        break;
                    case "5":
                        CompanyUtil.addEmployee();
                        break;
                }

            }
            showMenu();
        }

        //CompanyUtil.showSearchName("P");
        //CompanyUtil.showBiggestSallaries();
    }

    public static void showMenu(){
        System.out.println( "-------------------------\n" +
                "1. Show all employees" + "\n" +
                        "2. Show company 1 sorted by salary" +  "\n" +
                        "3. Show company 2 sorted by Age" + "\n" +
                        "4. Show company 3 sorted by Last Name Length" + "\n" +
                        "5. Add an Employee" +
                        ""         );

    }
}
