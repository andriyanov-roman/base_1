package entities.company;

import java.util.ArrayList;

/**
 * Created by Администратор on 26.03.2015.
 */
public class Sysadmin extends Employee{
    private String name;
    private String secondName;
    private double salary;
    private String platform;

    public Sysadmin(){}
    public Sysadmin(String name, String secondName,double salary, String platform) {
        this.name = name;
        this.secondName=secondName;
        this.salary = salary;
        this.platform = platform;
    }

    public String getName() {
        return name;
    }
    public String getSecondName(){return secondName;}

    public double getSalary() {
        return salary;
    }

    public String getPlatform() {
        return platform;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSecondName(String secondName){this.secondName=secondName;}
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPlatforms(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Sysadmin{" +
                "name='" + name + '\'' +
                "secondName='" + secondName + '\'' +
                ", salary=" + salary +
                ", platform=" + platform +
                '}';
    }
}