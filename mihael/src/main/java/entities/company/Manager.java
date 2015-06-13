package entities.company;

import java.util.ArrayList;

/**
 * Created by Администратор on 26.03.2015.
 */
public class Manager extends Employee{
    private String name;
    private String secondName;
    private double salary;
    private String project;
    public Manager(){}
    public Manager(String name, String secondName, double salary, String project) {
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.project = project;
    }

    public String getName() {
        return name;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getSalary() {
        return salary;
    }

    public String getProject() {
        return project;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", " +" secondName=" + secondName +
                ",salary=" + salary +
                ", project=" + project +
                '}';
    }

}
