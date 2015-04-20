package factory;

import entities.factory.Car;
import entities.factory.Color;
import io_tools.CarWriterReader;
import io_tools.IOTools;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by user on 30.03.2015.
 */

public class CarUtils {
    public static void showCars(ArrayList<Car> cars)  {
        for(int i =0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
    }
    public static void showCar(Car car)  {
            System.out.println(car);
    }

    public static ArrayList<Car>  theSameColorCars(ArrayList<Car> cars) throws IOException {
        ArrayList<Color> colors = ColorUtils.loadColorsFromFile();
        System.out.println("Input the number of color");
        for(int i=0; i<colors.size();i++){
            System.out.println(i +". " + colors.get(i).getColorName());
        }
        Scanner scanner = IOTools.scanner;
        Integer num = Integer.parseInt(scanner.next());
        Color color = colors.get(num);

        for(int i =0; i< cars.size();i++){
            if (color.getColorName().equals(cars.get(0).getColor())){
                System.out.println(cars.get(0));
            }
        }
        return cars;
    }
    public static Car getTheMostExpensiveCar(ArrayList<Car> cars){
        Car car = cars.get(0);
        for(int i =0;i<cars.size();i++){
            if(car.getPrice()<cars.get(i).getPrice()){
                car= cars.get(i);
            }
        }

        return car;
    }
    public static ArrayList<Car> choiceCarsByTimeInterval (ArrayList<Car> cars) throws ParseException {
        Scanner scanner = IOTools.scanner;
        System.out.println("Select Time Interval");
        System.out.println("1. year");
        System.out.println("2. half of year");
        System.out.println("3. 3 month");
        System.out.println("4. monh");
        System.out.println("5. till now");
        Date nowDate = new Date();

        Long fromTime = 0L;
        Long toTime = nowDate.getTime();


        String choice = scanner.next();
        switch (choice){
            case "1":
                fromTime = nowDate.getTime() - 1000*60*60*24*365;
                break;
            case "2":
                fromTime = nowDate.getTime() - 1000*60*60*24*365/2;
                break;
            case "3":
                fromTime = nowDate.getTime() - 1000*60*60*24*31*3;
                break;
            case "4":
                fromTime = nowDate.getTime() - 1000*60*60*24*31;
                break;
            case "5":
                break;
        }
        return  getCarsByTimeInterval(fromTime, toTime, cars);


    }
    public static ArrayList<Car> getCarsByTimeInterval (Long fromTime, Long toTime ,ArrayList<Car> cars) throws ParseException {
        ArrayList<Car> resultCars = new ArrayList<>();
        for(int i=0; i <cars.size();i++){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Calendar cal = Calendar.getInstance();
            Date date =  sdf.parse(cars.get(i).getDate());

            if(date.getTime()>fromTime && date.getTime()<toTime){
                resultCars.add(cars.get(i));
            }
        }

        return resultCars;
    }

    public static ArrayList<Car> loadCars() throws IOException{
        ArrayList<Car> cars = new ArrayList<>();
        String path = "mihael/src/main/java/factory/test_cars.txt";
        CarWriterReader cwr = new CarWriterReader();
        cwr.readFile(path);
        cars = cwr.getCars();
        return cars;
    }


    public static void buidldCar() throws IOException {
        Car car = new Car();
        car = orderCar();
        car.setName("Corolla");
        car.setFactoryName("Toyota");
        car.setDescription("Car description");
        car.setPrice(
            Double.valueOf(
                String.valueOf(
                    (car.getOwnerName().length()*20 + car.getColor().length()*10 + car.getType().length()*30)*100
                )
            )
        );
        car.setDate(randomDate());
        if (checkFields(car)) car.setIsReady(true);
        if(car.getIsReady()){
            CarWriterReader cwr = new CarWriterReader();
            //cwr.setPath("mihael/src/main/java/factory/test_cars.txt");
            cwr.setCar(car);
            cwr.writeFile("mihael/src/main/java/factory/test_cars.txt");
        }
    }
    public static String randomDate(){
        int randMonth = (int) (Math.random() * 12 + 1);
        int randYear = (int) (Math.random() * 2 + 2014);
        int randDay = (int) (Math.random() * 28 + 1);

        Calendar myCal = Calendar.getInstance();
        myCal.set(Calendar.YEAR, randYear);
        myCal.set(Calendar.MONTH, randMonth);
        myCal.set(Calendar.DAY_OF_MONTH, randDay);

        Date theDate = myCal.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date = sdf.format(theDate);
        return date;
    }
    public static  Boolean checkFields(Car car) {
        if(
            (car.getColor() != null) &&
            (car.getType() != null) &&
            (car.getName() != null) &&
            (car.getDate() != null) &&
            (car.getDescription() != null) &&
            (car.getFactoryName() != null) &&
            (car.getNumber() != null) &&
            (car.getOwnerName() != null) &&
            (car.getPrice()  != null)
        ){
            return true;
        }else {
            System.out.println("Can't build a car. Fill out all fields, please");
            return false;
        }
    }
    public static Car orderCar() throws IOException {
        Scanner scanner = IOTools.scanner;
        Boolean cont = true;
        Car car = new Car();

        //System.out.println("Input Name");
        //String name = scanner.nextLine();
        //car.setName(name);

        // !!!Если мы вводим, например при первом запросе  слова через пробелы это значение не присваевается данной
        // !!!стринговой переменной а разбивается на "слова" через пробел и присваивается следующим переменным

        System.out.println("Input type");
        String type = scanner.next();
        car.setType(type);

        System.out.println("Input ownerName");
        String ownerName = scanner.next();
        car.setOwnerName(ownerName);

        System.out.println("Input number");
        String number = scanner.next();
        car.setNumber(number);

        ArrayList<Color> colors = ColorUtils.loadColorsFromFile();
        System.out.println("Input the number of the color");
        for(int i=0; i< colors.size();i++){
            System.out.println(i + " " + colors.get(i).getColorName() );
        }
        String colorNum = scanner.next();
        Integer num = Integer.parseInt(colorNum);
        car.setColor(colors.get(num).getColorName());

        //System.out.println("Input factoryName");
        //String factoryName = scanner.nextLine();
        //car.setFactoryName(factoryName);

        //System.out.println("Input isReady");
        //String isReady = scanner.nextLine();
        //car.setIsReady(Boolean.valueOf(isReady));


        //System.out.println("Input description");
        //String description = scanner.nextLine();
        //car.setDescription(description);

        //System.out.println("Input price");
        //String price = scanner.nextLine();
        //car.setPrice(Double.valueOf(price));

        //System.out.println("Input date");
        // String date = scanner.nextLine();
        //car.setDate(date);

        //car.toString();
        return car;
    }
}
