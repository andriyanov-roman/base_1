package entity;

/**
 * Created by user on 23.03.2015.
 */
public class Admin {
    private String name;
    private String surname;
    private double salary;
    private String platformName;


    public Admin(String name, String surname, double salary, String platformName) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.platformName = platformName;
    }
    public Admin() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", platformName='" + platformName + '\'' +
                '}';
    }
}
