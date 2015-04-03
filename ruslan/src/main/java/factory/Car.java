package factory;


public class Car {
    private String brand;
    private String model;
    private String bodyType;
    private String colorOfCar;
    private Long serialNumberOfCar;
    private String nameOfOwner;
    private String concernName;
    private Long priceOfCar;
    private int yearOfProduction;

    public String getDescriptionOfCar() {
        return descriptionOfCar;
    }

    public void setDescriptionOfCar(String descriptionOfCar) {
        this.descriptionOfCar = descriptionOfCar;
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

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getColorOfCar() {
        return colorOfCar;
    }

    public void setColorOfCar(String colorOfCar) {
        this.colorOfCar = colorOfCar;
    }

    public Long getSerialNumberOfCar() {
        return serialNumberOfCar;
    }

    public void setSerialNumberOfCar(Long serialNumberOfCar) {
        this.serialNumberOfCar = serialNumberOfCar;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public String getConcernName() {
        return concernName;
    }

    public void setConcernName(String concernName) {
        this.concernName = concernName;
    }

    public Long getPriceOfCar() {
        return priceOfCar;
    }

    public void setPriceOfCar(Long priceOfCar) {
        this.priceOfCar = priceOfCar;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    private String descriptionOfCar;

    public Car() {

    }

    public Car(String brand, String model, String bodyType, String colorOfCar, Long serialNumberOfCar,
               String nameOfOwner, String concernName, Long priceOfCar, int yearOfProduction, String descriptionOfCar) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.colorOfCar = colorOfCar;
        this.serialNumberOfCar = serialNumberOfCar;
        this.nameOfOwner = nameOfOwner;
        this.concernName = concernName;
        this.priceOfCar = priceOfCar;
        this.yearOfProduction = yearOfProduction;
        this.descriptionOfCar = descriptionOfCar;
    }

    @Override
    public String toString() {
        return " Ім’я власника авто " + getNameOfOwner() + " " + " Бренд " + getBrand() + " " + " Модель " + getModel() + " " +
                " Тип кузова" + getBodyType() +" " + " Колір " + getColorOfCar() + " " + " Серійний номер автомобіля" + getSerialNumberOfCar() +
                " " + " Назва концерну виробника " + getConcernName() + " " + " Ціна авто " + getPriceOfCar() + " " +
                " Рік виготовлення" + getYearOfProduction() + " " + " Опис автомоболя" + getDescriptionOfCar();


    }
}
