package entity;

import lessons.lesson_2.Company;
import lessons.lesson_2.CompanyUtil;
import lessons.lesson_2.Employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 23.03.2015.
 */

public class Methods{
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Company>companies = new ArrayList<>();
    public void start() throws IOException {
        System.out.println("Enter command key: " +
                "\n 0.Show MaxSalary \n ");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "0":
                    showMaxSalary();
                    break;
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("No such case");
            }
        }
    }



    private void showMaxSalary() {
      //  ArrayList<Company> companies = CompanyUtil.getCompanies();
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


}
