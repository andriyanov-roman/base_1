package homework.carFactory;

import entity.carFactory.Car;
import homework.company.Methods;

import java.util.Date;

/**
 * Created by R-Tem on 29.03.2015.
 */
public class CarFactory {
    public static void createAuto(){
        System.out.println(" Fill the fields, please!");
        Methods.scanner.useDelimiter("\n");
        System.out.print("Owner name: ");
        String owner = Methods.scanner.next();
        System.out.print("Car Model: ");
        String carModel = Methods.scanner.next();
        System.out.print("Type: ");
        String type = Methods.scanner.next();
        System.out.print("Color: ");
        String color = Methods.scanner.next();
        System.out.print("Number: ");
        String number = Methods.scanner.next();

        String carFactory = "BMW";
        boolean done = true;
        String description = "Coooool one!";
        Double price = 30000.0;
        Date data = new Date();
        Car c = new Car(carModel,type,owner,number,color,carFactory,done,description,price,data.toString());

        System.out.println();
    }
}
