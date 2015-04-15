package entities.company;

/**
 * Created by user on 23.03.2015.
 */
public class Admin extends Employee {
    private String platform;

    public Admin() {
    }

    public Admin(Employee e, String platform) {
        super(e.getName(), e.getSurname(), e.getSalary(), Boolean.valueOf(e.getGender()), e.getAge());
        this.platform = platform;
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