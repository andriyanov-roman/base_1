package home_works.car_factory.model.car_factory;

import home_works.car_factory.datafile.txt.cars_factory.CarsReaderWriter;
import home_works.car_factory.entities.car_factory.Car;

import java.util.ArrayList;

/**
 * Created by user on 02.04.2015.
 */
public class CarFactoryMethods {

    static ArrayList<Car> cars;
    private CarsReaderWriter carsReaderWriter = new CarsReaderWriter();
    public void writeNewCars(Car car) {
        carsReaderWriter.setPath("ruslan\\src\\main\\java\\car_factory\\datafile.txt.cars_factory\\newOrderCars.txt");
        carsReaderWriter.writeCarsToFile(car);
        System.out.println("Wrote to file");
    }



    public static void sameColorsCars() throws Exception {
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

    public static void theMostExpensiveCar() throws Exception {
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

    public static void showCatalogOfAllCars() throws Exception {
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

    public static void createNewOrderOfCar() throws Exception {
        /*cars = new ArrayList<>();
        Car car_factory = new Car();
        try {
            scanner = new Scanner(System.in);
            System.out.println("Ф.І.О. замовника");
            car_factory.setNameOfOwner(scanner.nextLine());
            System.out.println("Виберіть марку автомобіля");
            car_factory.setBrand(scanner.nextLine());
            System.out.println("Виберіть модель автомобіля");
            car_factory.setModel(scanner.nextLine());
            System.out.println("Виберіть фабрику(концерн) автовиробника");
            car_factory.setConcernName(scanner.nextLine());
            System.out.println("Опис автомобіля ");
            car_factory.setDescriptionOfCar(scanner.nextLine());
            System.out.println("Введіть тип кузова автомобіля :");
            car_factory.setBodyType(scanner.nextLine());
            System.out.println("Колір автомобіль");
            car_factory.setColorOfCar(scanner.nextLine());
            System.out.println("Серійний номер авто");
            car_factory.setSerialNumberOfCar(scanner.nextLong());
            System.out.println("Ціна автомобіля");
            car_factory.setPriceOfCar(scanner.nextLong());
            System.out.println("Введіть рік випуску автомобіля");
            car_factory.setYearOfProduction(scanner.nextInt());
            cars.add(car_factory);
            FileWriter writer = new FileWriter("ruslan\\src\\main\\java\\car_factory\\newOrderForTheCar.txt", true);
            writer.write(car_factory.getNameOfOwner() + ":" + car_factory.getBrand() + ":" + car_factory.getModel() + ":" + car_factory.getBodyType() + ":" + car_factory.getColorOfCar()
                    + ":" + car_factory.getSerialNumberOfCar() + ":" + car_factory.getConcernName() + ":" + car_factory.getPriceOfCar() + ":" +
                    car_factory.getYearOfProduction() + ":" + car_factory.getDescriptionOfCar() + "\n");
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
                    startProgram();
                    break;
            }
        }*/


    }
}