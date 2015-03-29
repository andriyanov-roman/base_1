package CarFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Methods  {
    static Scanner scanner;
    public static void start() throws IOException {
        scanner=new Scanner(System.in);
        System.out.println("Выберите действие!");
        System.out.println("1. Сделать заказ на автомобиль");
        System.out.println("2. Просмотреть список автомобилей");
        System.out.println("3. Просмотреть список произведенных авто за интервал времени");
        System.out.println("4. Вывести самый дорогой автомобиль");
        System.out.println("5. Вывести список авто одного цвета");

        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1":
                    createNewOrder();
                    break;
                case "2":
                    showCatalogCars();
                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
            }
        }
    }
   /* public static void writeToFile(String path) throws IOException {
        FileWriter writer = new FileWriter(path, true);
        writer.write(CarsUtil.getCars().toString());
        writer.flush();
        writer.close();

    } */

    public static void createNewOrder() {
        ArrayList<Car> cars = new ArrayList<>();
        Car car = new Car();
        try {
            scanner = new Scanner(System.in);
            System.out.println("Введите имя владельца автомобиля");
            car.setNameOfOwner(scanner.nextLine());
            System.out.println("Введите марку автомобиля");
            car.setBrand(scanner.nextLine());
            System.out.println("Введите описание автомобиля");
            car.setDescription(scanner.nextLine());
            System.out.println("Введите фабрику(концерн)на которой может производиться автомобиль");
            car.setConcern(scanner.nextLine());
            System.out.println("Введите модель автомобиля");
            car.setModel(scanner.nextLine());
            System.out.println("Введите тип автомобиля(купе,седан,кабриолет,пикап,универсал,хэтчбек)");
            car.setType(scanner.nextLine());
            System.out.println("Введите цвет автомобиля");
            car.setColor(scanner.nextLine());
            System.out.println("Введите номер автомобиля");
            car.setNumber(scanner.nextLong());
            System.out.println("Введите цену автомобиля");
            car.setPrice(scanner.nextLong());
            System.out.println("Введите год выпуска автомобиля");
            car.setYear(scanner.nextInt());
            cars.add(car);
            FileWriter writer = new FileWriter("C:\\Users\\Игорь\\IdeaProjects\\base_1\\base_1\\matveu\\src\\main\\java\\CarFactory\\CatalogCars.txt", true);
            writer.write(car.getNameOfOwner()+":"+car.getBrand()+":"+car.getModel()+":"+car.getType()+":"+car.getColor()
            +":"+car.getNumber()+":"+car.getConcern()+":"+car.getPrice()+":"+car.getYear()+":"+car.getDescription()+"\n");
            writer.flush();
            writer.close();
        }catch (Exception e){ }
    }
    public static void showCatalogCars() throws IOException {
        ReadingFromCatalogCars.getCars();
    }

}
