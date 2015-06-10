package entities.company;

import java.util.ArrayList;

/**
 * Created by Администратор on 26.03.2015.
 */
public class Programmer extends Employee{
    private String name;
    private String secondName;
    private double salary;
    private String language;
    public Programmer(){}
    public Programmer(String name,String secondName, double salary, String language) {
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.language = language;
    }

    public String getName() {
        return name;
    }
    public String getSecondName() {return  secondName;}

    public double getSalary() {
        return salary;
    }

    public String getLanguage() {
        return language;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSecondName(String secondName) {this.secondName = secondName;}

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setLanguages(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                "secondName='" + secondName + '\''+
                ", salary=" + salary +
                ", language=" + language +
                '}';
    }
}




