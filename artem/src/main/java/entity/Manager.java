package entity;

/**
 * Created by user on 23.03.2015.
 */
public class Manager {
    private String name;
    private String secondName; // Объявляем еще одно поле класса. Их может быть сколько угодно
    private double salary;
    private String projectName;

    public Manager(String name, String secondName, double salary, String projectName) {
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.projectName = projectName;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSecondName() { return secondName; }
    public void setSecondName(String secondName) { this.secondName = secondName; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getProjectName() { return projectName; }
    public void setProjectName(String projectName) { this.projectName = projectName; }

    @Override
    public String toString() { return name + " " + secondName + " " + salary + " " + projectName; }
}
