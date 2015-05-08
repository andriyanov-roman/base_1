package entity;

/**
 * Created by MacBook on 28.03.15.
 */
public class Car {
    private String name;
    private String type;
    private String ownerName;
    private String number;
    private String colour;
    private String factoryName;
    private boolean status;
    private String description;
    private Long price;
    private int date;

    public Car(String name, String type, String ownerName, String number, String colour, String factoryName, boolean status, String description, Long price, int date) {
        this.name = name;
        this.type = type;
        this.ownerName = ownerName;
        this.number = number;
        this.colour = colour;
        this.factoryName = factoryName;
        this.status = status;
        this.description = description;
        this.price = price;
        this.date = date;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;

    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getType() {
        return type;

    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;

    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColour() {
        return colour;

    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFactoryName() {
        return factoryName;

    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public boolean getStatus() {
        return status;

    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDescription() {
        return description;

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDate() {
        return date;

    }

    public void setDate(int date) {
        this.date = date;
    }

    public Long getPrice() {
        return price;

    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", number='" + number + '\'' +
                ", colour='" + colour + '\'' +
                ", factoryName='" + factoryName + '\'' +
                ", status=" + status +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
