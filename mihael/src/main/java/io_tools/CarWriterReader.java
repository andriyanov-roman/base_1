package io_tools;

import entities.Car;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by Администратор on 01.04.2015.
 */
public class CarWriterReader extends CommonWriterReader {
    private ArrayList<Car> cars = new ArrayList<>();

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
    public void setCar(Car car) {
        this.cars.add(car);
    }

    @Override
    public  void readFile(String path) throws IOException {


        File file = new File(path);
        FileReader reader= new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        String regExp;
        while ((line=buffer.readLine())!=null){
            Car car = new Car();

            regExp = super.getDelimiter();
            //regExp = ":";
            //System.out.println(regExp);
            String [] strings = line.split(regExp);
            car.setName(strings[0]);
            car.setType(strings[1]);
            car.setOwnerName(strings[2]);
            car.setNumber(strings[3]);
            car.setColor(strings[4]);
            car.setFactoryName(strings[5]);
            car.setIsReady(Boolean.valueOf(strings[6]));
            car.setDescription(strings[7]);
            car.setPrice(Double.valueOf(strings[8]));
            car.setDate(strings[9]);
            car.setDescription(strings[7]);
            cars.add(car);
        }
    };
    @Override
    public void writeFile (String path) throws IOException{
        File file = new File(path);
        FileWriter writer = new FileWriter(file,super.getAppend());
        for(int i=0; i < cars.size();i++){
            writer.write((String)cars.get(i).toWrite());
            writer.write("\n");
        }
        writer.flush();
        writer.close();
    };
}