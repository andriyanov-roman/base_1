package factory;

import entities.factory.Car;
import io_tools.CarWriterReader;
import org.junit.Test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CarUtilsTest {
     public static Scanner scanner = new Scanner(System.in);
    Car testCar = new Car();

    public  void buidldCar() {
        order();
        testCar.toString();
    }


    @Test
    public  void writeTestCar() throws IOException {
        Car car = new Car();


        String name = "Camry";
        String type = "Sedan";
        String ownerName = "Poul Smith";
        String number = "9999";
        String color = "Black";
        String factoryName = "Toyota";
        String isReady = "true";
        String description = "This is the Toyota Camry car";
        String price = "2000";
        String date = "21/03/2015";


        car.setName(name);
        car.setType(type);
        car.setOwnerName(ownerName);
        car.setNumber(number);
        car.setColor(color);
        car.setFactoryName(factoryName);
        car.setIsReady(Boolean.valueOf(isReady));
        car.setDescription(description);
        car.setPrice(Double.valueOf(price));
        car.setDate(date);

        System.out.println(car.toWrite());
        CarWriterReader cwr = new CarWriterReader();
        //cwr.setPath("mihael/src/main/java/factory/test_cars.txt");
        cwr.setCar(car);
        cwr.writeFile("src/main/java/factory/test_cars.txt");

    }
    @Test
    public void randomDate(){
        for(int i =0; i<30;i++) {
            int randMonth = (int) (Math.random() * 12 + 1);
            int randYear = (int) (Math.random() * 2 + 2014);
            int randDay = (int) (Math.random() * 28 + 1);

            Calendar myCal = Calendar.getInstance();
            myCal.set(Calendar.YEAR, randYear);
            myCal.set(Calendar.MONTH, randMonth);
            myCal.set(Calendar.DAY_OF_MONTH, randDay);
            Date theDate = myCal.getTime();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String date = sdf.format(theDate);
            System.out.println(date);
        }
    }
    @Test
    public  void order() {
        //При запуске метода консоль зависает на команде     String name = scanner.nextLine();  и не принимает ничего в консоли.
        // не получается ввести символы, нажать Enter.

        //Scanner scanner = IOTools.scanner;

        Boolean cont = true;
        Car car = new Car();

        System.out.println("Input Name");
        String name = scanner.nextLine();
        System.out.println("Input type");
        car.setName(name);


        System.out.println("Input type");
        String type = scanner.nextLine();
        car.setType(type);

        System.out.println("Input ownerName");
        String ownerName = scanner.nextLine();
        car.setOwnerName(ownerName);

        System.out.println("Input number");
        String number = scanner.nextLine();
        car.setNumber(number);

        System.out.println("Input color");
        String color = scanner.nextLine();
        car.setColor(color);

        System.out.println("Input factoryName");
        String factoryName = scanner.nextLine();
        car.setFactoryName(factoryName);

        System.out.println("Input isReady");
        String isReady = scanner.nextLine();
        car.setIsReady(Boolean.valueOf(isReady));

        System.out.println("Input description");
        String description = scanner.nextLine();
        car.setDescription(description);

        System.out.println("Input price");
        String price = scanner.nextLine();
        car.setPrice(Double.valueOf(price));

        System.out.println("Input date");
        String date = scanner.nextLine();
        car.setDate(date);
        Car testCar = car;
        testCar.toString();
    }
}
