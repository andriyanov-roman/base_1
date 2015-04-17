package home_task7.Airplane;


public class Airplane {
    private String model;
    private String color;
    private int capacity;

    public String getModel() {

        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Airplane(String model, String color, int capacity) {
        this.model = model;
        this.color = color;
        this.capacity = capacity;
    }

    void fly() {
        System.out.println("Poleteli!");
    }

    void destination(int from, int to) {
        int dest = to - from;
        System.out.println("Расстояние перелета: " + dest);
    }

    void showDest(int from, int to) {
        int dest = to - from;
        System.out.println("Маршрут: " + dest);
    }
}
