package home_task4;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CarUtil {
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

            System.out.println("Предпологаемую автомобиля: ");
            c.setPrice(sc.nextLong());

            System.out.println("Год создания автомобиля: ");
            c.setDate(sc.next());
            cars.add(c);
            FileWriter writer = new FileWriter("vorobey/src/Car.txt", true);
            writer.write(c.getName() + ":" + c.getFactoryName() + ":" + c.getOwnerName() + ":" + c.getType() + ":" + c.getColour() + ":" + c.getNumber() + ":" + c.getPrice());
            writer.flush();
            writer.close();
        } catch (Exception e) {
        }

        System.out.println("Продолжить оформлять заказы на другие автомобили?нажмите 1");
        System.out.println("Вернуться в основное меню,нажмите 2");

        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":
                    cars();
                    break;

                case "2":
                    order();
                    break;

                default:
                    System.out.println("No such case");

            }
        }

    }

    public static void order() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Если хотети сделать заказ,нажмите 1");


        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":
                    cars();
                    break;
                default:
                    System.out.println("no such case");


            }
        }


    }

}


