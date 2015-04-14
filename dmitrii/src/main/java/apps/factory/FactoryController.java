package apps.factory;

import entities.factory.Car;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mit_OK! on 03.04.2015.
 */
public class FactoryController {
    public static void run() {
        FactoryView.welcome();
        ArrayList<Car> cars;
        while (FactoryView.hasNext()) {
            switch (FactoryView.next()) {
                case "1":
                    createCar();
                    break;
                case "2":
                    cars = FactoryModel.loadCars();
                    FactoryView.showCars(cars);
                    break;
                case "3":
                    showPerformance(FactoryView.periodDialog());
                    break;
                case "4":
                    findExpensiveCar();
                    break;
                case "5":
                    findSameColors();
                    break;
                case "SAVE":
                    FactoryModel.writeToFile(FactoryView.getBuffer());
                    break;
                case "LOAD":
                    String txt = FactoryModel.loadBuffer();
                    FactoryView.toPrintLN(txt);
                    break;
                case "exit":
                case "Exit":
                case "e":
                case "E":
                    return;
                default:
                    FactoryView.toPrintLN("No such case");
            }
            FactoryView.welcome();
        }
    }

    private static void createCar() {
        Car car = FactoryModel.initCar(FactoryView.showDialogCar());
        if (FactoryModel.fileTool.writeToFile(car.toString(), true)){
            FactoryView.toPrintLN("Car was created SUCCESSFULLY");
        } else FactoryView.toPrintLN("Error! Doesn't create.");
    }
    private static void showPerformance(Date[] d) {
        ArrayList<Car> cars  = FactoryModel.loadCars();
        ArrayList<Car> someCars = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getDate().after(d[0]) && cars.get(i).getDate().before(d[1])){
                someCars.add(cars.get(i));
            }
        }
        String tableName = FactoryView.formatDate(d[0].getTime() + "")+"-"+ FactoryView.formatDate(d[1].getTime() + "");
        FactoryView.showCars(someCars, "Period: " + tableName + ". Total cars: " + someCars.size());
    }

    private static void findExpensiveCar() {
        ArrayList<Car> cars  = FactoryModel.loadCars();
        Car expCar = cars.get(0);
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getPrice()>expCar.getPrice()){
                expCar = cars.get(i);
            }
        }
        FactoryView.toPrintLN("Most expensive car is: " + expCar.getModel() + " " + expCar.getPrice() +
                "$ Owner: " + expCar.getCarOwner());
    }

    private static void findSameColors() {
        ArrayList<Car> cars  = FactoryModel.loadCars();
        ArrayList<ArrayList<Car>> colors = new ArrayList<>();
        for (int i = 0; i <cars.size(); i++) {
           colors = compareColor(cars.get(i),colors);
        }
        for (int k = 0; k < colors.size(); k++) {
            FactoryView.toPrint("Color: \'" + colors.get(k).get(0).getColor() + "\' has: ");
            for (int i = 0; i < colors.get(k).size(); i++) {
                FactoryView.toPrint(colors.get(k).get(i).getModel() + "; ");
            }
            FactoryView.toPrintLN("");
        }
    }
    private static ArrayList<ArrayList<Car>> compareColor(Car c, ArrayList<ArrayList<Car>> colors){
        ArrayList<Car> temp = new ArrayList<>();
        for (int j = 0; j < colors.size(); j++) {
            if (colors.get(j).get(0).getColor().equals(c.getColor())){
                colors.get(j).add(c);
                return colors;
            }
        }
        temp.add(c);
        colors.add(temp);
        return colors;
    }
}


