package home_works.car_factory.model.car_factory;

import home_works.car_factory.datafile.txt.cars_factory.CarsReaderWriter;
import home_works.car_factory.entities.car_factory.Car;
import home_works.car_factory.view.car_factory.CarFactoryView;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 02.04.2015.
 */
public class CarFactoryMethods {

    static ArrayList<Car> cars;
    private static Scanner scanner = new Scanner(System.in);
    private CarsReaderWriter carsReaderWriter = new CarsReaderWriter();
   /* public void writeNewCars(Car car) {
        carsReaderWriter.setPath("ruslan\\src\\main\\java\\car_factory\\datafile.txt.cars_factory\\newOrderCars.txt");
        carsReaderWriter.writeCarsToFile(car);
        System.out.println("Wrote to file");
    }*/


    public static void sameColorsCars() throws IOException {
        ArrayList<Car> cars = CarsReaderWriter.getCars();

        for (int i = 0; i < cars.size(); i++) {
            for (int j = 0; j < cars.size() - 1; j++) {
                if (cars.get(i).getColorOfCar().equals(cars.get(i).getColorOfCar())) {
                    System.out.println(cars.get(i).getBrand() + cars.get(i).getModel() + cars.get(i).getColorOfCar());
                } else {
                    break;
                }
            }
        }
    }

    public static void theMostExpensiveCar() throws IOException {
        cars = CarsReaderWriter.getCars();
        cars.get(0).getPriceOfCar();
        Car temp = cars.get(0);
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getPriceOfCar() > temp.getPriceOfCar()) {
                temp = cars.get(i);
            }
        }
        System.out.println(" Найдорожчий автомобіль :" + temp.getBrand() + " " + temp.getModel() + " - ціна : " + temp.getPriceOfCar() + " $ ");
    }

    public static void showCatalogOfAllCars() throws IOException {
        cars = CarsReaderWriter.getCars();
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).getBrand() + " " +
                    cars.get(i).getModel() + "\n" +
                    cars.get(i).getBodyType() + "\n" +
                    cars.get(i).getConcernName() + "\n" +
                    cars.get(i).getYearOfProduction() + "\n");
        }
        System.out.println(" Загальна кількість автомобілів  : " + cars.size());
    }

    public static void createNewOrderOfCar() throws IOException {
        // Car car = new Car();

        //cars = new ArrayList<>();
        Car car = new Car();

        // scanner = new Scanner(System.in);
        System.out.println("Ф.І.О. замовника");
        car.setNameOfOwner(scanner.nextLine());
        System.out.println("Виберіть марку автомобіля");
        car.setBrand(scanner.nextLine());
        System.out.println("Виберіть модель автомобіля");
        car.setModel(scanner.nextLine());
        System.out.println("Виберіть фабрику(концерн) автовиробника");
        car.setConcernName(scanner.nextLine());
        System.out.println("Опис автомобіля ");
        car.setDescriptionOfCar(scanner.nextLine());
        System.out.println("Введіть тип кузова автомобіля :");
        car.setBodyType(scanner.nextLine());
        System.out.println("Колір автомобіль");
        car.setColorOfCar(scanner.nextLine());
        System.out.println("Серійний номер авто");
        car.setSerialNumberOfCar(scanner.nextLong());
        System.out.println("Ціна автомобіля");
        car.setPriceOfCar(scanner.nextLong());
        System.out.println("Введіть рік випуску автомобіля");
        car.setYearOfProduction(scanner.nextInt());
        cars.add(car);
    }

    public void writeNewCars(Car car) {
        carsReaderWriter.setPath("ruslan\\src\\Cars.txt");
        carsReaderWriter.writeCarsToFile(car);
        System.out.println("Wrote to file");
    }


}










