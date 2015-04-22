package factory;

import entity.Car;
import mvc.validators.FactoryValidator;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by admin on 06.04.15.
 */
public class FactoryMethods {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Car> cars = new ArrayList<>();
    private FactoryValidator validator = new FactoryValidator();

    public void start() throws IOException {
        System.out.println("Enter command key: " +
                "\n 0.Make an order "+
        "\n 1.Check orders \n");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "0":
                    createNewCar();
                    writeToFile("alisa/src/result/Cars.txt");
                    break;
                case "1":
                    readFromFile();
                    break;
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("No such case");
            }
        }
    }

    private void createNewCar() {
        Car car = new Car();
        System.out.println("Enter your name");
        car.setCarOwner(scanner.next());
        System.out.println("Enter model");
        car.setModel(scanner.next());
        System.out.println("Enter type");
        car.setType(scanner.next());
        System.out.println("Enter number");
        int regNumber = Integer.valueOf(scanner.next());
        car.setRegNumber(regNumber);
        System.out.println("Enter colour");
        if(validator.checkColor(scanner.next())) {
            car.setColour(scanner.next());
        } else {
            createNewCar();
        }
        System.out.println("Do you want to continue? Y/N");
        cars.add(car);
        if ("Y".equals(scanner.next())) {
            createNewCar();
        }
    }
    public void writeToFile(String path) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(path, true);
            writer.write(cars.toString());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public  ArrayList<Car> readFromFile() throws IOException{
        File file = new File ("alisa/src/result/Cars.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Car car = new Car();
            car.setCarOwner(pool[0]);
            car.setModel(pool[1]);
            car.setType(pool[2]);
            car.setRegNumber(Integer.valueOf(pool[3]));
            car.setColour(pool[4]);
            cars.add(car);

        }
        return cars;

    }

}
