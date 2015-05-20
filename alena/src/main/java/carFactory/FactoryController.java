package carFactory;

import entity.Car;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lbondarenko on 08.05.2015.
 */
public class FactoryController {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Car> cars = new ArrayList<>();


    public void letsBegin() throws IOException {
        System.out.println("Выберите действие: " +
                "\n 0. Совершить заказ" +
                "\n 1. Просмотреть все заказы " +
                "\n 2. Показать самую дорогую машину" +
                "\n 3. Показать машины одного цвета" +
                "\n 4. Показать машины за январь");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "0":
                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "Exit":
                    System.exit(0);
            }
        }
    }
}
