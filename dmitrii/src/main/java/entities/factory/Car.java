package entities.factory;

import java.util.Date;

/**
 * Created by mit_OK! on 30.03.2015.
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
    private Date date;
    private static String s = ":";

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public Boolean isOrderStatus() {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public static String getRegExp() {
        return s;
    }

    public void setRegExp(String regExp) {
        this.s = regExp;
    }
    @Override
    public String toString() {
        return model + s + type + s + carOwner + s + regNumber + s + color + s +
                factoryName + s + orderStatus + s + description + s + price + s +
                String.valueOf(date.getTime())+"\n";
    }
}
