package entity;

/**
 * Created by user on 23.03.2015.
 */
public class Admin {
    private String name;
    private String secondName; // Объявляем еще одно поле класса. Их может быть сколько угодно
    private double salary;
    private String Platform;

    public Admin(String name, String secondName, double salary, String platform) {
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        Platform = platform;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSecondName() { return secondName; }
    public void setSecondName(String secondName) { this.secondName = secondName; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getPlatform() { return Platform; }
    public void setPlatform(String platform) { Platform = platform; }

    @Override
    public String toString() { return name + secondName + salary + Platform; }
}
