package entities.company.extendsEmployee;

import entities.company.Employee;

/**
 * Created by user on 23.03.2015.
 */
public class Manager extends Employee{
    private String projectName;


    public Manager(String name, String secondName, double salary, String sex, int age, String projectName) {
        super(name, secondName, salary, sex, age);
        this.projectName = projectName;
    }

    public Manager(){} // Это конструктор ПО УМОЛЧАНИЮ, его нужно объявлять если создан искуственный конструктор

    public String getProjectName() { return projectName; }
    public void setProjectName(String projectName) { this.projectName = projectName; }

    @Override
    public String toString() { return name + " " + secondName + " " + salary + " " + projectName; }
}
