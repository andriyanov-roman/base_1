package entities.company;

/**
 * Created by user on 23.03.2015.
 */
public class Programmer extends Employee{
    private String language;

    public Programmer() {
    }

    public Programmer(Employee e, String language) {
        super(e.getName(), e.getSurname(), e.getSalary(), Boolean.valueOf(e.getGender()), e.getAge());
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return super.toString() + super.getSeparator() + getLanguage();
    }
}
