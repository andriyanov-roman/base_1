package home_task4;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class FactoryUtil {
    public static void cars() throws IOException {
        ArrayList<Car> cars = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Car c = new Car();
        try {
            System.out.println("Вы можете заказать автомобиль,указан следующие требования: ");

            System.out.println("Марка автомобиля: ");
            c.setName(sc.next());

            System.out.println("Имя владельца автомобиля: ");
            c.setOwnerName(sc.next());

            System.out.println("Номер автомобиля: ");
            c.setNumber(sc.next());

            System.out.println("Цвет автомобиля: ");
            c.setColour(sc.next());

            System.out.println("Концерн автомобиля: ");
            c.setFactoryName(sc.next());

            System.out.println("Тип автомобиля(седан,поло,купе): ");
            c.setType(sc.next());

            System.out.println("Предпологаемую стоимость автомобиля: ");
            c.setPrice(sc.nextLong());

            System.out.println("Год создания автомобиля: ");
            c.setDate(Integer.valueOf(sc.next()));
            cars.add(c);
            FileWriter writer = new FileWriter("vorobey/src/Car.txt", true);
            writer.write(c.getName() + ":" + c.getOwnerName() + ":" + c.getNumber() + ":" + c.getColour() + ":" + c.getFactoryName() + ":" + c.getType() + ":" + c.getPrice() + ":" + c.getDate() + "\n");
            writer.flush();
            writer.close();
        } catch (Exception e) {
        }

        System.out.println("Продолжить оформлять заказы на другие автомобили?нажмите 1");
        System.out.println("Вернуться в основное меню,нажмите 2");
        System.out.println("Просмотреть список автомобилей, 3");

        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":
                    cars();
                    break;
                case "2":
                    order();
                    break;
                case "3":
                    getCars();
                    break;

                default:
                    System.out.println("No such case");

            }
        }

    }

    public static void order() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Если хотите сделать заказ,нажмите 1");
        System.out.println("Если хотите просмотреть список автмообилей,нажмите 2");
        System.out.println("Что бы вывести самую дорогую модель,нажмите 3");
        System.out.println("Что бы вывести количество автомобилей одинакового цвета,нажмите 4");

        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":
                    cars();
                    break;
                case "2":
                    showCars();
                    break;
                case "3":
                    mostExpensiveCar();
                    break;
                case "4":
                    showSameColourCars();
                    break;

                case "5":

                    break;
                case "10":
                    order();
                    break;


                default:
                    System.out.println("no such case");

            }
        }

    }

    public static ArrayList<Car> getCars() throws IOException {
        File file = new File("vorobey/src/Car.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        ArrayList<Car> cars = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] carsArray = line.split(":");
            Car car = new Car();
            car.setName(carsArray[0]);
            car.setOwnerName(carsArray[1]);
            car.setNumber(carsArray[2]);
            car.setColour(carsArray[3]);
            car.setFactoryName(carsArray[4]);
            car.setType(carsArray[5]);
            car.setPrice(Long.valueOf(carsArray[6]));
            car.setDate(Integer.valueOf(carsArray[7]));
            cars.add(car);

        }
        return cars;
    }

    public static void mostExpensiveCar() throws IOException {
        ArrayList<Car> cars = getCars();
        Long maxPrice = 0L;
        String maxOwnerName = "";
        String maxName = "";
        for (int i = 0; i < cars.size(); i++) {
            for (int j = 0; j < cars.get(i).getPrice(); j++) {
                if (cars.get(i).getPrice() > maxPrice) {
                    maxPrice = cars.get(i).getPrice();
                    maxName = cars.get(i).getName();
                    maxOwnerName = cars.get(i).getOwnerName();
                }
            }
        }
        System.out.println("Самая дорогостоящая модель: " + maxPrice + ":" + maxName + ":" + maxOwnerName);

    }

    public static ArrayList<Car> showCars() throws IOException {
        File file = new File("src/Car.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        ArrayList<Car> cars = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] carsArray = line.split(":");
            Car car = new Car();
            car.setName(carsArray[0]);
            car.setOwnerName(carsArray[1]);
            car.setNumber(carsArray[2]);
            car.setColour(carsArray[3]);
            car.setFactoryName(carsArray[4]);
            car.setType(carsArray[5]);
            car.setPrice(Long.valueOf(carsArray[6]));
            car.setDate(Integer.valueOf(carsArray[7]));
            cars.add(car);
            System.out.print(car.getName() + ":" + car.getOwnerName() + ":" + car.getNumber() + ":"
                    + car.getColour() + ":" + car.getFactoryName() + ":" + car.getType() + ":" + car.getPrice() + ":" + car.getDate() + "\n");

        }
        return cars;

    }

    public static ArrayList<Car> getSameColourCars() throws IOException {
        int count = 0;
        ArrayList<Car> cars = getCars();
        for (int i = 0; i < cars.size(); i++) {
            for (int j = i + 1; j < cars.size(); ++j) {
                if (cars.get(i).getColour().equals(cars.get(j).getColour()) == false) {
                    cars.remove(i);
                    cars.remove(j);
                }
            }

        }
        return cars;

    }

    public static void showSameColourCars() throws IOException {
        ArrayList<Car> cars = getSameColourCars();
        int i;
        for (i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).getName() + ":" + cars.get(i).getDate() + ":" + cars.get(i).getColour() + ":" + cars.get(i).getOwnerName());
        }
        System.out.println("Общее количество автомобилей одинакового цвета: " + i);

    }


}










