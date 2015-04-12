package modules.carFactory;

import entity.carFactory.Car;
import Body;

import java.util.Date;

/**
 * Created by R-Tem on 29.03.2015.
 */
public class CarFactory {
    public static void createAuto(){
        System.out.println(" Fill the fields, please!");
        Body.scanner.useDelimiter("\n");
        System.out.print("Owner name: ");
        String owner = Body.scanner.next();
        System.out.print("Car Model: ");
        String carModel = Body.scanner.next();
        System.out.print("Type: ");
        String type = Body.scanner.next();
        System.out.print("Color: ");
        String color = Body.scanner.next();
        System.out.print("Number: ");
        String number = Body.scanner.next();

        String carFactory = "BMW";
        boolean done = true;
        String description = "Coooool one!";
        Double price = 30000.0;
        Date data = new Date();
        Car c = new Car(carModel,type,owner,number,color,carFactory,done,description,price,data.toString());

        System.out.println();
    }
}
