import home_task2.Company;
import home_task2.CompanyUtil;
import home_task2.Employee1;
import home_task4.Car;
import home_task4.Factory;
import home_task4.FactoryUtil;
import jdk.nashorn.internal.runtime.ECMAException;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


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
    public void testMaxSalary() throws Exception {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
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

    @Test
    public void testShowEmplyees() throws Exception {

        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            System.out.println("********************************");
            System.out.println("В компании " + companies.get(i).getCompanyName() + " работают сотрудники: ");
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                System.out.print(companies.get(i).getEmployees().get(j).getName() + " " + companies.get(i).getEmployees().get(j).getSecondName() + "(" + companies.get(i).getEmployees().get(j).getSalary() + ")");
                System.out.println();
            }
        }
    }

    @Test
    public void tesFile() throws Exception {
        File file = new File("src/Car.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        ArrayList<Car> cars = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] carsArray = line.split(":");
            Car car = new Car();
            car.setName(carsArray[0]);
            car.setOwnerName(carsArray[1]);
            car.setNumber(carsArray[2]);
            car.setColour(carsArray[3]);
            car.setFactoryName(carsArray[4]);
            car.setType(carsArray[5]);
            car.setPrice(Long.valueOf(carsArray[6]));
            car.setDate(Integer.valueOf(carsArray[7]));
            cars.add(car);
            System.out.print(car.getName() + ":" + car.getOwnerName() + ":" + car.getNumber() + ":"
                    + car.getColour() + ":" + car.getFactoryName() + ":" + car.getType() + ":" + car.getPrice() + ":" + car.getDate() + "\n");

        }

    }
}




