package entity.staff;

import entity.Employee;

/**
 * Created by user on 23.03.2015.
 */
public class Admin extends Employee {
       private String platformName;


    public Admin(String name, String surname, double salary, int age, String sex, String platformName) {
        super(name, surname, salary, age, sex);
        this.platformName = platformName;
    }

    public Admin() {

    }



    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    @Override
    public String toString() {
        return "Admin.txt{" +
                "platformName='" + platformName + '\'' +
                '}';
    }
}
