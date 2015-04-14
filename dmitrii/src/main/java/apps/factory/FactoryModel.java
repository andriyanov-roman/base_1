package apps.factory;

import entities.factory.Car;
import entities.file_tools.CarFileTool;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mit_OK! on 03.04.2015.
 */
public class FactoryModel {
    public static CarFileTool fileTool = initFileUtil();

    public static CarFileTool initFileUtil() {
        CarFileTool tool = new CarFileTool();
        tool.setPath("dmitrii\\src\\main\\resources\\car_factory\\Cars.txt");
        tool.setRegExp(Car.getRegExp());
        return tool;
    }

    public static ArrayList<Car> loadCars() {
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<String[]> temp;
        temp = fileTool.readFromFile();
        for (int i = 0; i < temp.size(); i++) {
            cars.add(initCar(temp.get(i)));
        }
        return cars;
    }

    public static Car initCar(String[] carArr) {
        Car car = new Car();
        car.setModel(carArr[0]);
        car.setType(carArr[1]);
        car.setCarOwner(carArr[2]);
        car.setRegNumber(carArr[3]);
        car.setColor(carArr[4]);
        car.setFactoryName(carArr[5]);
        car.setOrderStatus(Boolean.valueOf(carArr[6]));
        car.setDescription(carArr[7]);
        car.setPrice(Double.valueOf(carArr[8]));
        Date date = new Date(Long.valueOf(carArr[9]));
        car.setDate(date);
        return car;
    }

    public static void writeToFile(String txt) {
        initNewReader().writeToFile(txt, false);
    }

    public static String loadBuffer() {
        try {
            return initNewReader().readFileBuffer();
        } catch (IOException e) {
            return e.toString();
        }
    }

    public static CarFileTool initNewReader() {
        CarFileTool util = new CarFileTool();
        util.setPath("dmitrii\\src\\main\\resources\\car_factory\\buffer.txt");
        return util;
    }
}
