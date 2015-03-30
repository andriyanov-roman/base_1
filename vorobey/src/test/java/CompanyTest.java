import home_task2.Company;
import home_task2.CompanyUtil;
import home_task4.Car;
import home_task4.Factory;
import home_task4.FactoryUtil;
import jdk.nashorn.internal.runtime.ECMAException;
import org.junit.Test;

import java.util.ArrayList;


public class CompanyTest {

    @Test
    public void doSomething() throws Exception {

        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            double maxSalary = 0;
            String maxName = "", maxSecondName = "";
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                for (int k = 0; k < companies.get(i).getEmployees().get(j).getSalary(); k++) {
                    if (companies.get(i).getEmployees().get(j).getSalary() > maxSalary) {
                        maxSalary = companies.get(i).getEmployees().get(j).getSalary();
                        maxName = companies.get(i).getEmployees().get(j).getName();
                        maxSecondName = companies.get(i).getEmployees().get(j).getSecondName();
                    }

                }

            }
            System.out.println("В компании " + companies.get(i).getCompanyName() + " сотрудник с максимальной ЗП: " + maxName + ",а именно :" + maxSalary);

        }


    }

    @Test
    public void testMaxSalary() throws Exception{
        ArrayList<Company> companies =CompanyUtil.getCompanies();
        double maxSalary = 0;
        String maxName = "";
        String maxSecondName = "";
        String maxNameCompany = "";

        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                for (int k = 0; k < companies.get(i).getEmployees().get(j).getSalary(); k++) {
                    if (companies.get(i).getEmployees().get(j).getSalary() > maxSalary) {
                        maxSalary = companies.get(i).getEmployees().get(j).getSalary();
                        maxName = companies.get(i).getEmployees().get(j).getName();
                        maxSecondName = companies.get(i).getEmployees().get(j).getSecondName();
                        maxNameCompany = companies.get(i).getCompanyName();

                    }
                }
            }


        }
        System.out.println("Из всех компаний,сотрудник с максимальной ЗП :" + maxName + ",а именно :" + maxSalary + ", работает в компании " + maxNameCompany);


    }

}



