package Cars;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kirill on 02.04.2015.
 */
public class Methods {
    static Scanner scanner;
    static ArrayList<Cars> cars;

    public static void start() throws IOException {
        scanner = new Scanner(System.in);
        System.out.println("***Сделайте выбор ***" + "\n");

        System.out.println("Хотите заказать автомобиль? Нажмите 1");

        System.out.println("Каталог заказов - нажмите 2");

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    newOrder();
                    break;
                case "2":
                    LoadFromCatalog.getCars();
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


    public static void carYear() throws IOException {


    }

    public static void newOrder() throws IOException {
        cars = new ArrayList<>();
        Cars car = new Cars();
        try {
            scanner = new Scanner(System.in);
            System.out.println("Введите желаемые характеристики машины");
            System.out.println( " Для начала вводим бренд : ");
            car.setBrand(scanner.nextLine());
            System.out.println("Желаемая модель / тип ? ");
            car.setModel(scanner.nextLine());
            System.out.println("Введите имя будущего хозяина ");
            car.setOwnerMachine(scanner.nextLine());
            System.out.println("Введите желаемый номер машины");
            car.setCarNumber(scanner.nextInt());
            System.out.println(" Каким будет цвет Вашей машины? " + "White, Black, Gold");
            car.setCarColor(scanner.nextLine());
            cars.add(car);
            FileWriter writer = new FileWriter("kkozhuhovskiy\\src\\main\\java\\Cars\\CarsOrder.txt", true);
            writer.write(car.getBrand() + ":" + car.getModel() + ":" + car.getOwnerMachine() +
                    ":" + car.getCarNumber() + ":" + car.getCarColor()  + "\n");
            writer.flush();
            writer.close();
        } catch (Exception e) {
        }
        scanner = new Scanner(System.in);

        System.out.println("0. Вернуться в главное меню");
        while (scanner.hasNext()) {

            switch (scanner.next()){
                case "1":
                    Methods.start();
            }
        }
        }



    }

