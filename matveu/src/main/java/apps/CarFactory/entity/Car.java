package apps.carFactory.entity;

public class Car {
    private String brand;
    private String model;
    private String type;
    private String color;
    private Long number;
    private String nameOfOwner;
    private String concern;
    private Long price;
    private Integer year;
    private String description;

    public Car(){

    }
    @Override
    public String toString() {
        return "Имя заказчика: "+getNameOfOwner()+". "+getBrand() + " " + getModel() + ". Тип: " +
                  getType() +". Цвет: " + getColor() + ". Номер авто: " +getNumber()+". Концерн: "+getConcern()+". Цена автомобиля: "+getPrice()+
                ". Год выпуска авто: "+getYear()+". Описание авто: "+getDescription()+
                '}';

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public String getConcern() {
        return concern;
    }

    public void setConcern(String concern) {
        this.concern = concern;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Car(String brand, String model, String type, String color, Long number, String nameOfOwner, String concern, Long price, Integer year, String description) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.color = color;
        this.number = number;
        this.nameOfOwner = nameOfOwner;
        this.concern = concern;
        this.price = price;
        this.year = year;
        this.description = description;
    }

}
