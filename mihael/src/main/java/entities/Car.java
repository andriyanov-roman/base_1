package entities;

import java.util.Date;

/**
 * Created by Администратор on 28.03.2015.
 */
public class Car {
    //1. Название
    private String name;
    //2. Тип (типов может быть сколько угодно)
    private String type;
    //3. Владелец
    private String ownerName;
    //4. Номер
    private String number;
    //5. Цвет
    private String color;
    //6. Название фабрики на которой он может быть произведен
    private String factoryName;
    //7. Статус готовности(завершена или нет)
    private Boolean isReady;
    //8. Описание машины
    private String description;
    //9. Цена
    private Double price;
    //10. Дата производства
    private String date;

    public Car(){};
    public Car(String name, String type, String ownerName, String number, String color, String factoryName, Boolean isReady, String description, double price, String date) {
        this.name = name;
        this.type = type;
        this.ownerName = ownerName;
        this.number = number;
        this.color = color;
        this.factoryName = factoryName;
        this.isReady = isReady;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
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

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public Boolean getIsReady() {
        return isReady;
    }

    public void setIsReady(Boolean isReady) {
        this.isReady = isReady;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", factoryName='" + factoryName + '\'' +
                ", isReady=" + isReady +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", date='" + date + '\'' +
                '}';
    }

    public String toWrite() {
        String delimiter = ":";
        return
            name + delimiter +
            type + delimiter +
            ownerName +  delimiter+
            number + delimiter +
            color + delimiter +
            factoryName + delimiter +
            isReady +delimiter+
            description + delimiter +
            price +delimiter +
            date
        ;
    }
}
