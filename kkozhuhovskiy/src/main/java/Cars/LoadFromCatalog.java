package Cars;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Kirill on 03.04.2015.
 */
public class LoadFromCatalog {
    public static ArrayList<Cars> getCars() throws IOException{
        File file = new File ("kkozhuhovskiy\\src\\main\\java\\Cars\\CarsOrder.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Cars> cars = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            /* впихун */
            String[] pool = line.split(":");
            Cars car = new Cars();
            car.setBrand(pool[0]);
            car.setModel(pool[1]);
            car.setOwnerMachine(pool[2]);
            car.setCarNumber(Integer.valueOf(pool[3]));
            car.setCarColor(pool[4]);
            cars.add(car);

        }
return cars;

    }
}
