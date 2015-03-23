package homework;


import entity.Employee;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) throws IOException {
        EmployeeUtil.getEmployees();
        CompanyUtil.getCompanies();
        do {
            System.out.println("\n Hello! Select an option:\n 1 - Work with employee\n 2 - Work with Companies\n 3 - Exit");
            switch (Methods.scanner.next()){
                case "1": String r = ""; do {
                    System.out.println(" sh - Show all employees\n a - Add employee\n d - Delete employee\n s - Save employees\n r - rise above");
                    switch (Methods.scanner.next()) {
                        case "sh": EmployeeUtil.showEmployees(); break;
                        case "a": EmployeeUtil.addEmployee(); break;
                        case "d": EmployeeUtil.deleteEmployee(); break;
                        case "s": EmployeeUtil.saveEmployeeFile(); break;
                        case "r": r = "r";
                        default: System.out.println("No such case!");
                    }
                } while (r!="r");
                    break;
                case "2": String s =""; do{
                    System.out.println(" sh - Show all company\n g - Get max salary\n s - sort companies\n a - Add company\n d - Delete company\n S - Save company\n r - rise above");
                    switch (Methods.scanner.next()){
                        case "sh": CompanyUtil.showCompanies(); break;
                        case "g": CompanyUtil.getMaxSalary(); break;
                        case "s": CompanyUtil.sortBy(); break;
                        /*case "a":
                            break;
                        case "d":
                            break;*/
                        case "S": CompanyUtil.saveCompaniesToFile();
                            break;
                        case "r": s = "r";
                        default: System.out.println("No such case!");
                    }
                } while (s!="r");
                    break;
                case "3": System.exit(0); break;
                default: System.out.println("No such case");
            }
        } while (true);
    }
}
