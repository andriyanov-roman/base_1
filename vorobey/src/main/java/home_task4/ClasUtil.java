package home_task4;


import java.util.ArrayList;
import java.util.Scanner;

public class ClasUtil {
    public static ArrayList<Car> cars() {
        ArrayList<Car> cars = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Car c = new Car();
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


        return cars;
    }

}
