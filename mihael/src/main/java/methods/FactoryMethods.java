package methods;

import io_tools.CarWriterReader;
import io_tools.CommonWriterReader;

import java.io.IOException;

/**
 * Created by user on 28.03.2015.
 */
public class FactoryMethods {
    public static void main (String [] args) throws IOException {
        startFactory();
    }
    public static void startFactory(){
        CommonWriterReader writer = new CarWriterReader();
        writer.setPath("mihael/src/main/java/carFactory/cars.txt");
    }

    //строит машины по требованию заказчика(возможные требования - имя заказчика, желаемый цвет, желаемый тип, желаемый номер).
    //как только машина построена, её параметры автоматически сохраняются в файл. В файле хранятся характеристики построенной машины.
    public static void orderCar(String ownerName,String color){

    }
}
