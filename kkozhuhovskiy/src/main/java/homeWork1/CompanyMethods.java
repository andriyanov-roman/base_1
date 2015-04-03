package homeWork1;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Kirill on 03.04.2015.
 */
public class CompanyMethods {

    public static void findCompName() throws IOException {
        ArrayList<Company> companies = CompanyUtil.getCompany();
        for (int i = 0; i < companies.size(); i++) {
            System.out.println("Company name : " + companies.get(i).getCompanyName());
        }
    }

    public static void maxCompSalary() throws IOException {
        ArrayList<Company> companies = CompanyUtil.getCompany();
        for (int i = 0; i < 1; i++) {
            for (int s = companies.get(i).getEmployees().size() - 1; s >= 0; s--) {
                double temp = companies.get(i).getEmployees().get(s).getSalary();
                for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                    double salary = companies.get(i).getEmployees().get(j).getSalary();
                    if (temp < salary) {

                    }
                    System.out.println(companies.get(i).getEmployees().get(j).getSalary() + "Salary more than" + companies.get(i).getEmployees().get(s).getSalary());
                }


            }
        }
    }


    public static void sortAgeInComp() throws IOException {
        ArrayList<Company> companies = CompanyUtil.getCompany();
        for (int i = 1; i < 2; i++) {
            for (int s = companies.get(i).getEmployees().size() - 1; s >= 0; s--) {
                int temp = companies.get(i).getEmployees().get(s).getAge();
                for (int c = 0; c < companies.get(i).getEmployees().size(); c++) {
                    int age = companies.get(i).getEmployees().get(c).getAge();
                    if (temp < age) ;
                    System.out.println("Age" + companies.get(i).getEmployees().get(c).getAge() + " " + companies.get(i).getEmployees().get(s).getAge());
                }
            }
        }
    }

    static void secondNameLength() throws IOException {
        ArrayList<Company> companies = CompanyUtil.getCompany();

        for (int i = 2; i < 3; i++) {
            for (int c = 0; c < companies.get(i).getEmployees().size(); c++) {
                int tempSize = companies.get(i).getEmployees().get(c).getSecondName().length();


                System.out.println(companies.get(i).getEmployees().get(c).getSecondName() + "have second name length " + tempSize);
            }
        }
    }
}
