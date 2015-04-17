package home_task7.Auto;


public class Auto {
    public String name;
    public String color;

    public Auto(String name, String color) {
        this.name = name;
        this.color = color;

    }

    void drive(int distance) {
        System.out.println("Проехать путь " + distance + " м");

    }

    void refuel() {             //заправка

    }

    void changeWeel(double diametr) {  // замена колеса

    }
    void printCar(){
        System.out.println("Марка авто: "+name);
    }

}
