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
                    makeAnOrder();
                    break;
                case "1":
                    showAllOrders();
                    break;
                case "2":
                    showTheMostExpensiveCar();
                    break;
                case "3":
                    showTheSameColorCar();
                    break;
                case "4":
                    showMonthOfProduction();
                    break;
                case "Exit":
                    System.exit(0);
            }
        }
    }


    private void showMonthOfProduction() {

    }

    private void showTheSameColorCar() {

    }

    private void showTheMostExpensiveCar() {

    }

    private void showAllOrders() {

    }

    private void makeAnOrder() {

    }
}
