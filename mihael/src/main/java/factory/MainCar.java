package factory;

import io_tools.IOTools;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

/**
 * Created by user on 30.03.2015.
 */
public class MainCar {
    public static void  main (String [] args) throws IOException, ParseException {
        startFactory();
        CarUtils.buidldCar();
        //CarUtils.showTestCar();
        //CarUtils.showLoadedCars();
    }

    private static void startFactory() throws IOException, ParseException {
        showMenu();
        menu();
    }
    private static void showMenu() {
        System.out.println("1. Build a car");
        System.out.println("2. Load and show builded cars from file");
        System.out.println("3. Show the number of builded car for month");
        System.out.println("4. Show the most expencive car");
        System.out.println("5. Show the cars with the same color");
    }
    private static void menu() throws IOException, ParseException {

        Boolean cont = true;
        Scanner scanner = IOTools.scanner;
        while(cont){
            String input = scanner.next();
            switch (input){

                case "1":
                    CarUtils.buidldCar();
                    break;
                case "2":
                    CarUtils.showCars(CarUtils.loadCars());
                    break;
                case "3":
                    CarUtils.showCars(CarUtils.choiceCarsByTimeInterval(CarUtils.loadCars()));
                    break;
                case "4":
                    CarUtils.showCar(CarUtils.getTheMostExpensiveCar(CarUtils.loadCars()));
                    break;
                case "5":
                    CarUtils.showCars(CarUtils.theSameColorCars(CarUtils.loadCars()));

                    break;
                default:

                    break;
            }
            showMenu();
        }

    }


}
