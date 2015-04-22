package view.consoleApp;

import java.util.Scanner;


public class CompanyView {
    protected Scanner scanner;

    public CompanyView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String menu(){
        String s = "\n '1' to Get all employees from all companies" +
                "\n '2' to  Get employee with max Salary" +
                "\n '3' to Sort employees" +
                "\n '4' to Add employees" +
//                "\n '5' to Fire employees" +
//                "\n '6' to Increase the salary for 15%" +
                "\n '7' to Add company" +
                "\n 'r' to return" +
                "\n 'e' to Exit program";
        System.out.println("This is Company Util. Select an action, please:" + s);
        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1": return "getEmp";
                case "2": return "getMaxSalary";
                case "3": return "sortUtil";
                case "4": return "addEmp";
                case "5": return "fireEmp";
                case "6": return "increaseSalary";
                case "7": return "addComp";
                case "r": return "return";
                case "e": System.exit(0);
                default:System.out.println("No such case! Try again:" + s);
            }
        }
        return null;
    }
}
