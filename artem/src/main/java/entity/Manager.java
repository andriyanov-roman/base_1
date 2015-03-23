package entity;

/**
 * Created by user on 23.03.2015.
 */
public class Manager {
    private String name;
    private String secondName; // Объявляем еще одно поле класса. Их может быть сколько угодно
    private double salary;
    private String progectName;

    public Manager(String name, String secondName, double salary, String progectName) {
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.progectName = progectName;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSecondName() { return secondName; }
    public void setSecondName(String secondName) { this.secondName = secondName; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getProgectName() { return progectName; }
    public void setProgectName(String progectName) { this.progectName = progectName; }

    @Override
    public String toString() { return name + " " + secondName + " " + salary + " " + progectName; }
}
