package entity.employeeHeirs;

import entity.Employee;

/**
 * Created by user on 23.03.2015.
 */
public class Admin extends Employee{
    private String Platform;

    public Admin(String name, String secondName, double salary, String sex, int age, String platform) {
        super(name, secondName, salary, sex, age);
        Platform = platform;
    }

    public Admin(){} // Это конструктор ПО УМОЛЧАНИЮ, его нужно объявлять если создан искуственный конструктор

    public String getPlatform() { return Platform; }
    public void setPlatform(String platform) { Platform = platform; }

    @Override
    public String toString() { return /*name + secondName + salary +*/ Platform; }
}
