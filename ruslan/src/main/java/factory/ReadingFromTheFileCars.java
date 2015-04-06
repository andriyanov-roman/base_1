package factory;

import entity.CommonReaderWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by user on 02.04.2015.
 */
public class ReadingFromTheFileCars extends CommonReaderWriter{
    public static ArrayList <Car> getCars () throws IOException {
    File file = new File("ruslan\\src\\main\\java\\factory\\Cars.txt");
    FileReader reader = new FileReader(file);
    BufferedReader buffer = new BufferedReader(reader);
    ArrayList<Car> cars = new ArrayList<>();
    String line;
    while ((line = buffer.readLine()) != null) {
        String[] pool = line.split(":");
        Car car = new Car();
        car.setNameOfOwner(pool[0]);
        car.setBrand(pool[1]);
        car.setModel(pool[2]);
        car.setBodyType(pool[3]);
        car.setColorOfCar(pool[4]);
        car.setSerialNumberOfCar(Long.valueOf(pool[5]));
        car.setConcernName(pool[6]);
        car.setPriceOfCar(Long.valueOf(pool[7]));
        car.setYearOfProduction(Integer.valueOf(pool[8]));
        car.setDescriptionOfCar(pool[9]);
        cars.add(car);

    }
    return cars;
}
}
