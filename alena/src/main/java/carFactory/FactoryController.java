package carFactory;

import entity.Car;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lbondarenko on 08.05.2015.
 */
public class FactoryController {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Car> cars = new ArrayList<>();


    public static void letsBegin (){
        System.out.println ("Выберите действие: " +
        "\n 0. Совершить заказ" +
                "\n 1. Просмотреть все заказы " +
        "\n 2. Показать самую дорогую машину" +
        "\n 3. Показать машины одного цвета" );

    }
}
