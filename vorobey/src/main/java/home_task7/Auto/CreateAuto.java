package home_task7.Auto;


public class CreateAuto {

    public static void main(String[] args) {
        Auto auto = new Auto("BMW", "red");
        Auto wheel = new Wheel("BMW", "red", 20.5);
        Auto engine = new Engine("BMW", "red", 340);

        auto.drive(2300);
        auto.changeWeel(23.2);
        auto.refuel();


    }

}
