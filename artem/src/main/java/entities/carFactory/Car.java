package entity.carFactory;


public class Car {
    private String carModel;
    private String type;
    private String owner;
    private String number;
    private String color;
    private String carFactory;
    private boolean done;
    private String description;
    private double price;
    private String date;

    public Car(String carModel, String type, String owner, String number, String color, String carFactory, boolean done, String description, double price, String date) {
        this.carModel = carModel;
        this.type = type;
        this.owner = owner;
        this.number = number;
        this.color = color;
        this.carFactory = carFactory;
        this.done = done;
        this.description = description;
        this.price = price;
        this.date = date;
    }

    public Car() {}

    public String getCarModel() { return carModel; }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarFactory() {
        return carFactory;
    }

    public void setCarFactory(String carFactory) {
        this.carFactory = carFactory;
    }

    public boolean getDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
