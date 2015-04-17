package home_works.car_factory.view.car_factory;

import entity.ConsoleView;
import home_works.car_factory.model.car_factory.CarFactoryMethods;

import java.util.Scanner;

/**
 * Created by user on 08.04.2015.
 */
public class CarFactoryView extends ConsoleView {
    protected Scanner scanner;

    public CarFactoryView(Scanner scanner) {
        super(scanner);
    }

    public void start() throws Exception {
        scanner = new Scanner(System.in);
        System.out.println("Виберіть інформацію, яка Вас цікавить :" + "\n" +
                "1. Зробити замовлення на інший автомобіль" + "\n" +
                "2. Показати список автомобілів, які вже були продані" + "\n" +
                "3. Подивитись автомобілі, які були виготовлені, протягом заданого часу" + "\n" +
                "4. Вивести найдорожчий автомобіль, який виготовлявся" + "\n" +
                "5. Вивести автомобілі, колір яких співпадає" + "\n" +
                "6. Вийти");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    CarFactoryMethods.createNewOrderOfCar();
                    ;
                    break;
                case "2":
                    CarFactoryMethods.showCatalogOfAllCars();
                    break;
               /* case "3":
                    FactoryMethods.showCarsYearsOfProduction();
                    break;*/
                case "4":
                    CarFactoryMethods.theMostExpensiveCar();
                    break;
                case "5":
                    CarFactoryMethods.sameColorsCars();
                    break;
                case "6":
                    System.exit(0);
                    break;
            }
        }
    }

}
