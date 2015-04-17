package home_works.сompany.entities.company;

import entity.Human;

/**
 * Created by user on 17.04.2015.
 */
public class Admin extends Employee {
    private String platformName;

    public Admin(Double salary, String gender, String platformName) {
        super(salary, gender);
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
        return getName() + " " + " " + getSecondName() + " " + " " + getSalary() + " " + platformName;
    }
}
