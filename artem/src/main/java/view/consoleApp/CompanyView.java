package view.consoleApp;

import validate.CompanyDataValidator;
import view.BaseView;

import java.util.Scanner;


public class CompanyView extends BaseView {
    protected Scanner scanner;
    private CompanyDataValidator validator;

    public CompanyView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String menu(){
        System.out.println("This is Company Util. Select an action, please:" +
                "\n '1' to Get all employees from all companies" +
                "\n '2' to  Get employee with max Salary" +
                "\n '3' to Sort employees" +
                "\n '4' to Add employees" +
//                "\n '5' to Fire employees" +
//                "\n '6' to Increase the salary for 15%" +
                "\n '7' to Add company" +
                "\n 'r' to return" +
                "\n 'e' to Exit program"   );
        return null;
    }
}
