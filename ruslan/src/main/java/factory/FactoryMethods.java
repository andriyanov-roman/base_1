package factory;

import entity.CarsReaderWriter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 02.04.2015.
 */
public class FactoryMethods {
    static Scanner scanner;
    static ArrayList<Car> cars;

    public static void start() throws Exception {
        scanner = new Scanner(System.in);
        System.out.println("Виберіть інформацію, яка Вас цікавить :");
        System.out.println("1. Зробити замовлення на ынший автомобіль");
        System.out.println("2. Показати список автомобілів, які вже були продані");
        System.out.println("3. Подивитись автомобілі, які були виготовлені, протягом заданого часу");
        System.out.println("4. Вивести найдорожчий автомобіль, який виготовлявся");
        System.out.println("5. Вивести автомобілі, колір яких співпадає");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    createNewOrderOfCar();
                    break;
                case "2":
                    showCatalogOfAllCars();
                    break;
               /* case "3":
                    showCarsYearsOfProduction();
                    break;*/
                case "4":
                    theMostExpensiveCar();
                    break;
                case "5":
                    sameColorsCars();
                    break;
            }
        }
    }

    private static void sameColorsCars() throws Exception {
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

    private static void theMostExpensiveCar() throws Exception {
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

    private static void showCatalogOfAllCars() throws Exception {
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

    private static void createNewOrderOfCar() throws Exception {
        /*cars = new ArrayList<>();
        Car car = new Car();
        try {
            scanner = new Scanner(System.in);
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
            FileWriter writer = new FileWriter("ruslan\\src\\main\\java\\factory\\newOrderForTheCar.txt", true);
            writer.write(car.getNameOfOwner() + ":" + car.getBrand() + ":" + car.getModel() + ":" + car.getBodyType() + ":" + car.getColorOfCar()
                    + ":" + car.getSerialNumberOfCar() + ":" + car.getConcernName() + ":" + car.getPriceOfCar() + ":" +
                    car.getYearOfProduction() + ":" + car.getDescriptionOfCar() + "\n");
            writer.flush();
            writer.close();
        } catch (Exception e) {
        }
        scanner = new Scanner(System.in);
        System.out.println("1. Добавити новий автомобіл");
        System.out.println("2. Головне меню");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    createNewOrderOfCar();
                    break;
                case "2":
                    start();
                    break;
            }
        }*/


    }
}