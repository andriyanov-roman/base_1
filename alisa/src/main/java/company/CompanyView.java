package company;

import entity.Employee;
import mvc.CommonView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by admin on 22.04.15.
 */
public class CompanyView implements CommonView {
   private Scanner scanner = new Scanner(System.in);
    private String companyName;
    private ArrayList<Employee> employees = new ArrayList<>();
    CompanyMethods model = new CompanyMethods();


    @Override
    public void showMenu() throws IOException {
                    System.out.println("Enter command key: " +
                    "\n 0.Show all companies " +
                    "\n 1. Show an employee with MaxSalary " +
                    "\n 2.Sort a company  by salary " +
                    "\n 3.Sort a company  by age" +
                    "\n 4.Sort a company  by surname length" +
                    "\n 5.Add a new employee to Lenovo" +
                    "\n 6. Add a new employee to IBM" +
                    "\n 7.Add a new employee to Luxoft \n");
           while (scanner.hasNext()) {
                switch (scanner.next()) {
                    case "0":
                       model.showCompanies();
                        break;
                    case "1":
                        model.getMaxSalary();
                        break;
                    case "2":
                        model.selectCompany();
                        model.sortBySalary(model.getCompByName(companyName));
                        break;
                    case "3":
                       companyName = model.selectCompany();
                        model.sortByAge(model.getCompByName(companyName));
                        break;
                    case "4":
                        companyName = model.selectCompany();
                        model.sortBySurnameLength(model.getCompByName(companyName));
                        break;
                    case "5":
                        model.createNewEmployee();
                        model.writeToFile("alisa/src/result/Lenovo.txt");
                        CompanyUtil.readFromFile("alisa/src/result/Lenovo.txt", ":");
                        System.out.println( employees.toString());
                        break;
                    case "6":
                        model.createNewEmployee();
                        model.writeToFile("alisa/src/result/IBM.txt");
                        CompanyUtil.readFromFile("alisa/src/result/IBM.txt", ":");
                        System.out.println(employees.toString());
                        break;
                    case "7":
                        model.createNewEmployee();
                        model.writeToFile("alisa/src/result/Luxoft.txt");
                        CompanyUtil.readFromFile("alisa/src/result/Luxoft.txt", ":");
                        System.out.println(employees.toString());
                        break;
                    case "Exit":
                        System.exit(0);
                    default:
                        System.out.println("No such case");
                }
            }
        }
    }

