package home_task7.Airplane;


public class Launch {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus310", "white", 120);
        Airplane wing = new Wing("Airbus310", "white", 120, 23.2);
        Airplane engine = new Engine("Airbus310", "white", 120);
        Airplane undercarrige = new Undercarriage("Airbus310", "white", 120);

        airplane.fly();
        airplane.destination(23, 1240);
        airplane.showDest(23, 1240);
    }


}
