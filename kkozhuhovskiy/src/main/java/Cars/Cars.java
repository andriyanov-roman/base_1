package Cars;

/**
 * Created by Kirill on 02.04.2015.
 */
public class Cars {
    private String brand;
    private String model;
    private String ownerMachine;
    private int carNumber;
    private String carColor;
    private String nameOfFactoryWhoCreatedTheCar;
    private boolean readinessStatus;        /*Статус готовности(завершена или нет)*/
    private String descriptionOfCar;        /*Описание машины*/
    private double carPrice;
    private Integer yearOfCreatingCar;

    public Cars() {

    }

    @Override
    public String toString() {
        return "Хозяин машины{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ownerMachine='" + ownerMachine + '\'' +
                ", carNumber=" + carNumber +
                ", carColor='" + carColor + '\'' +
                ", nameOfFactoryWhoCreatedTheCar='" + nameOfFactoryWhoCreatedTheCar + '\'' +
                ", readinessStatus=" + readinessStatus +
                ", descriptionOfCar='" + descriptionOfCar + '\'' +
                ", carPrice=" + carPrice +
                ", yearOfCreatingCar=" + yearOfCreatingCar +
                '}';
    }

    public Cars(String brand, String model, String ownerMachine, int carNumber, String carColor, String nameOfFactoryWhoCreatedTheCar,
                boolean readinessStatus, String descriptionOfCar, double carPrice, Integer yearOfCreatingCar) {
        this.brand = brand;
        this.model = model;
        this.ownerMachine = ownerMachine;
        this.carNumber = carNumber;
        this.carColor = carColor;
        this.nameOfFactoryWhoCreatedTheCar = nameOfFactoryWhoCreatedTheCar;
        this.readinessStatus = readinessStatus;
        this.descriptionOfCar = descriptionOfCar;
        this.carPrice = carPrice;
        this.yearOfCreatingCar = yearOfCreatingCar;
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

    public String getOwnerMachine() {
        return ownerMachine;
    }

    public void setOwnerMachine(String ownerMachine) {
        this.ownerMachine = ownerMachine;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getNameOfFactoryWhoCreatedTheCar() {
        return nameOfFactoryWhoCreatedTheCar;
    }

    public void setNameOfFactoryWhoCreatedTheCar(String nameOfFactoryWhoCreatedTheCar) {
        this.nameOfFactoryWhoCreatedTheCar = nameOfFactoryWhoCreatedTheCar;
    }

    public boolean isReadinessStatus() {
        return readinessStatus;
    }

    public void setReadinessStatus(boolean readinessStatus) {
        this.readinessStatus = readinessStatus;
    }

    public String getDescriptionOfCar() {
        return descriptionOfCar;
    }

    public void setDescriptionOfCar(String descriptionOfCar) {
        this.descriptionOfCar = descriptionOfCar;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public Integer getYearOfCreatingCar() {
        return yearOfCreatingCar;
    }

    public void setYearOfCreatingCar(Integer yearOfCreatingCar) {
        this.yearOfCreatingCar = yearOfCreatingCar;
    }
}
