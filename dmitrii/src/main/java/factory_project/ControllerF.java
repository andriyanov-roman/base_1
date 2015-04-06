package factory_project;

import entities.factory.Car;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mit_OK! on 03.04.2015.
 */
public class ControllerF {
    public static void run() {
        ViewF.welcome();
        ArrayList<Car> cars;
        while (ViewF.hasNext()) {
            switch (ViewF.next()) {
                case "1":
                    createCar();
                    break;
                case "2":
                    cars = ModelF.loadCars();
                    ViewF.showCars(cars);
                    break;
                case "3":
                    showPerformance(ViewF.periodDialog());
                    break;
                case "4":
                    findExpensiveCar();
                    break;
                case "5":
                    findSameColors();
                    break;
                case "SAVE":
                    ModelF.writeToFile(ViewF.getBuffer());
                    break;
                case "LOAD":
                    String txt = ModelF.loadBuffer();
                    ViewF.toPrintLN(txt);
                    break;
                case "exit":
                case "Exit":
                case "e":
                case "E":
                    System.exit(0);
                default:
                    ViewF.toPrintLN("No such case");
            }
            ViewF.welcome();
        }
    }

    private static void createCar() {
        Car car = ModelF.initCar(ViewF.showDialogCar());
        if (ModelF.fileTool.writeToFile(car.toString(), true)){
            ViewF.toPrintLN("Car was created SUCCESSFULLY");
        } else ViewF.toPrintLN("Error! Doesn't create.");
    }
    private static void showPerformance(Date[] d) {
        ArrayList<Car> cars  = ModelF.loadCars();
        ArrayList<Car> someCars = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getDate().after(d[0]) && cars.get(i).getDate().before(d[1])){
                someCars.add(cars.get(i));
            }
        }
        String tableName = ViewF.formatDate(d[0].getTime()+"")+"-"+ViewF.formatDate(d[1].getTime() + "");
        ViewF.showCars(someCars,"Period: "+tableName+". Total cars: "+someCars.size());
    }

    private static void findExpensiveCar() {
        ArrayList<Car> cars  = ModelF.loadCars();
        Car expCar = cars.get(0);
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getPrice()>expCar.getPrice()){
                expCar = cars.get(i);
            }
        }
        ViewF.toPrintLN("Most expensive car is: " + expCar.getModel() + " " + expCar.getPrice() +
                "$ Owner: " + expCar.getCarOwner());
    }

    private static void findSameColors() {
        ArrayList<Car> cars  = ModelF.loadCars();
        ArrayList<ArrayList<Car>> colors = new ArrayList<>();
        for (int i = 0; i <cars.size(); i++) {
           colors = compareColor(cars.get(i),colors);
        }
        for (int k = 0; k < colors.size(); k++) {
            ViewF.toPrint("Color: \'"+colors.get(k).get(0).getColor()+"\' has: ");
            for (int i = 0; i < colors.get(k).size(); i++) {
                ViewF.toPrint(colors.get(k).get(i).getModel()+"; ");
            }
            ViewF.toPrintLN("");
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


