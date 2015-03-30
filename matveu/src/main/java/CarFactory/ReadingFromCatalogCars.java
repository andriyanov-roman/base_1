package CarFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadingFromCatalogCars {
    public static ArrayList<Car> getCars() throws IOException {
        File file = new File("E:\\base_1\\matveu\\src\\main\\java\\CarFactory\\CatalogCars.txt");
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
            car.setType(pool[3]);
            car.setColor(pool[4]);
            car.setNumber(Long.valueOf(pool[5]));
            car.setConcern(pool[6]);
            car.setPrice(Long.valueOf(pool[7]));
            car.setYear(Integer.valueOf(pool[8]));
            car.setDescription(pool[9]);
            cars.add(car);
            //System.out.print(car+" "+"\n");
        }
        return cars;
    }
}
