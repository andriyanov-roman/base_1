import Cars.Cars;
import homeWork1.Company;
import homeWork1.CompanyUtil;
import homeWork1.Employee;
import homeWork1.EmployeeUtil;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class FirstTest {
    static Scanner scanner;
    static ArrayList<Cars> cars;

    @Test
    public void testCompanyC1() throws IOException {
        Company c1 = new Company();
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        c1.setEmployees(new ArrayList<Employee>());
        c1.getEmployees().add(employees.get(0));
        c1.getEmployees().add(employees.get(1));
        FileWriter writer = new FileWriter("src/SednaEmployees.txt", true);
        for (int i = 0; i < c1.getEmployees().size(); i++) {
            writer.write(c1.getEmployees().get(i).toString());
        }

        writer.flush();
        writer.close();

    }


    public void testHomeTest() throws IOException {
        ArrayList<Company> companies = CompanyUtil.getCompany();

        for (int i = 2; i < 3; i++) {
            for (int c = 0; c < companies.get(i).getEmployees().size(); c++) {
                int tempSize = companies.get(i).getEmployees().get(c).getSecondName().length();


                System.out.println(companies.get(i).getEmployees().get(c).getSecondName() + " have second name length " + tempSize);
            }


        }
    }

    @Test
    public void testHomeTesSecond() throws IOException {

        ArrayList<Company> companies = CompanyUtil.getCompany();
        for (int i = 0; i < 1; i++) {
            for (int s = companies.get(i).getEmployees().size() - 1; s >= 0; s--) {
                double temp = companies.get(i).getEmployees().get(s).getSalary();
                for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                    double salary = companies.get(i).getEmployees().get(j).getSalary();
                    if (temp < salary) {

                    }
                    System.out.println(companies.get(i).getEmployees().get(j).getSalary() + " Salary more than " + companies.get(i).getEmployees().get(s).getSalary());
                }


            }


        }
    }

    @Test
    public void testWriteToFile() throws IOException {


        cars = new ArrayList<>();
        Cars car = new Cars();
        try {
            scanner = new Scanner(System.in);
            System.out.println("Введите желаемые характеристики машины");
            System.out.println(" Для начала вводим бренд : ");
            car.setBrand(scanner.nextLine());
            System.out.println("Желаемая модель? ");
            car.setModel(scanner.nextLine());
            System.out.println("Введите имя будущего хозяина ");
            car.setOwnerMachine(scanner.nextLine());
            System.out.println("Введите желаемый номер машины");
            car.setCarNumber(scanner.nextInt());
            System.out.println(" Каким будет цвет Вашей машины?");
            car.setCarColor(scanner.nextLine());
            cars.add(car);
            FileWriter writer = new FileWriter("src/main/java/Cars/CarsOrder.txt", true);
            writer.write(car.getBrand() + ":" + car.getModel() + ":" + car.getOwnerMachine() +
                    ":" + car.getCarNumber() + ":" + car.getCarColor() + "\n" + "Next order" + "\n");
            writer.flush();
            writer.close();
        } catch (Exception e) {
        }
    }
}
