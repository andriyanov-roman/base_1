package company;

import mvc.views.CommonView;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by admin on 22.04.15.
 */
public class CompanyView extends CommonView {
    private String companyName;
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
            while (getScanner().hasNext()) {
                switch (getScanner().next()) {
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
                       /* companyName = checkInput();
                        sortByAge(getCompByName(companyName));
                        break;
                    case "4":
                        companyName = checkInput();
                        sortBySurnameLength(getCompByName(companyName));
                        break;
                    case "5":
                        createNewEmployee();
                        writeToFile( "alisa/src/result/Lenovo.txt");
                        CompanyUtil.readFromFile("alisa/src/result/Lenovo.txt", ":");
                        System.out.println(employees.toString());
                        break;
                    case "6":
                        createNewEmployee();
                        writeToFile( "alisa/src/result/IBM.txt");
                        CompanyUtil.readFromFile("alisa/src/result/IBM.txt", ":");
                        System.out.println(employees.toString());
                        break;
                    case "7":
                        createNewEmployee();
                        writeToFile("alisa/src/result/Luxoft.txt");
                        CompanyUtil.readFromFile("alisa/src/result/Luxoft.txt", ":");
                        System.out.println(employees.toString());
                        break;
                    case "Exit":
                        System.exit(0);
                    default:
                        System.out.println("No such case");*/
                }
            }
        }
    }

