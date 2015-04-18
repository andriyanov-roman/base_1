package apps.carFactory.model;

import apps.carFactory.entity.Car;
import apps.carFactory.readingFromCatalogCar.ReadingFromCatalogCars;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MethodsCarFactory {
    static Scanner scanner=new Scanner(System.in);
    static ArrayList<Car> cars;

    public static void showCatalogCars() throws IOException {
        cars = ReadingFromCatalogCars.getCars();
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i).toString() + "\n");
        }
        System.out.println("Суммарное количество автомобилей: "+cars.size());

    }
    public static void showCarsYears() throws IOException {
        cars=ReadingFromCatalogCars.getCars();
        System.out.println("Введите интервал времени, за который желаете получить информацию о произведенных авто");
        System.out.println("*например, за последнии 'n' лет");
        Integer n=scanner.nextInt();
        String year="";
        String word="";
        if(n==1 || n==21||n==31||n==41||n==51||n==61){
            year="год";
            word="последний";
        }
        if(n==2||n==3||n==4||n==22||n==23||n==24||n==32||n==33||n==34){
            year="года";
            word="последнии";
        }
        if(n>4 && n<21|| n>24 && n<31||n>34&&n<41){
            year="лет";
            word="последнии";
        }
        System.out.println("Произведенные авто, за "+word+" "+n+" "+year);
        for(int i=0;i<cars.size();i++) {
            if ((2015 - n) < cars.get(i).getYear() && cars.get(i).getYear() <= 2015) {
                System.out.print(cars.get(i).toString()+"\n");

            }
        }
    }
    public static void mostExpensiveCar() throws  IOException {
        cars=ReadingFromCatalogCars.getCars();
        Long maxPrice=cars.get(0).getPrice();
        Car maxPriceCar=cars.get(0);
        for(int i=0;i<cars.size();i++){
            if(cars.get(i).getPrice()>maxPrice){
                maxPriceCar=cars.get(i);
            }
        }
        System.out.print(maxPriceCar+"\n");
    }
    /*public static void sameColors() throws IOException {
        cars=ReadingFromCatalogCars.getCars();
        int count=0;
        for(int i=0;i<cars.size();i++) {
            for (int j = i + 1; j < cars.size(); j++) {
                if (cars.get(i).getColor().equals(cars.get(j).getColor())){
                    count++;
                    System.out.print(cars.get(i)+"\n");
                }
            }
        }
        System.out.println("Количество авто одинакового цвета: " + count);
    }*/
    public static void sameColors() throws IOException {
        cars=ReadingFromCatalogCars.getCars();
        System.out.println("Выберите цвет, который Вас интересует!");
        System.out.println("1.White; 2.Black; 3.Red; 4.Blue; 5.Gold");
        while (scanner.hasNext()){
            int count=0;
            switch (scanner.next()){
                case "1":
                    for (int i=0;i<cars.size();i++){
                        if(cars.get(i).getColor().equals("white")||cars.get(i).getColor().equals("White")){
                            count++;
                            System.out.print(cars.get(i)+"\n");
                        }
                    }
                    System.out.println("Количество автомобилей даного цвета: "+count);
                    break;
                case "2":
                    for (int i=0;i<cars.size();i++){
                        if(cars.get(i).getColor().equals("black")||cars.get(i).getColor().equals("Black")){
                            count++;
                            System.out.print(cars.get(i)+"\n");
                        }
                    }
                    System.out.println("Количество автомобилей даного цвета: "+count);
                    break;
                case "3":
                    for (int i=0;i<cars.size();i++){
                        if(cars.get(i).getColor().equals("red")||cars.get(i).getColor().equals("Red")){
                            count++;
                            System.out.print(cars.get(i)+"\n");
                        }
                    }
                    System.out.println("Количество автомобилей даного цвета: "+count);
                    break;
                case "4":
                    for (int i=0;i<cars.size();i++){
                        if(cars.get(i).getColor().equals("blue")||cars.get(i).getColor().equals("Blue")){
                            count++;
                            System.out.print(cars.get(i) + "\n");
                        }
                    }
                    System.out.println("Количество автомобилей даного цвета: "+count);
                    break;
                case "5":
                    for (int i=0;i<cars.size();i++){
                        if(cars.get(i).getColor().equals("gold")||cars.get(i).getColor().equals("Gold")){
                            count++;
                            System.out.print(cars.get(i)+"\n");
                        }
                    }
                    System.out.println("Количество автомобилей даного цвета: "+count);
                    break;
            }
        }
    }
}
