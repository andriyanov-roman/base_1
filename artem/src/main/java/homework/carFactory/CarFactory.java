package homework.carFactory;

import entity.carFactory.Car;
import homework.CommonMethods;

import java.util.Date;

/**
 * Created by R-Tem on 29.03.2015.
 */
public class CarFactory {
    public static void createAuto(){
        System.out.println(" Fill the fields, please!");
        CommonMethods.scanner.useDelimiter("\n");
        System.out.print("Owner name: ");
        String owner = CommonMethods.scanner.next();
        System.out.print("Car Model: ");
        String carModel = CommonMethods.scanner.next();
        System.out.print("Type: ");
        String type = CommonMethods.scanner.next();
        System.out.print("Color: ");
        String color = CommonMethods.scanner.next();
        System.out.print("Number: ");
        String number = CommonMethods.scanner.next();

        String carFactory = "BMW";
        boolean done = true;
        String description = "Coooool one!";
        Double price = 30000.0;
        Date data = new Date();
        Car c = new Car(carModel,type,owner,number,color,carFactory,done,description,price,data.toString());

        System.out.println();
    }
}
