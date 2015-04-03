package entities;

/**
 * Created by user on 23.03.2015.
 */
public class Admin extends Employee {
    private String platform;

    public Admin() {
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return super.toString() + super.getSeparator() + getPlatform();

    }
}