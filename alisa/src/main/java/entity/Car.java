package entity;

/**
 * Created by admin on 06.04.15.
 */
public class Car {
    private String model;
    private String type;
    private String carOwner;
    private String regNumber;
    private String color;
    private String factoryName;
    private Boolean orderStatus;
    private String description;
    private Double price;
    private int date;

    public Car(String model, String type, String carOwner, String regNumber, String color,
               String factoryName, String description, Double price,
               int date, Boolean orderStatus) {
        this.model = model;
        this.type = type;
        this.carOwner = carOwner;
        this.regNumber = regNumber;
        this.color = color;
        this.factoryName = factoryName;
        this.description = description;
        this.price = price;
        this.date = date;
        this.orderStatus = orderStatus;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", carOwner='" + carOwner + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", color='" + color + '\'' +
                ", factoryName='" + factoryName + '\'' +
                ", orderStatus=" + orderStatus +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
