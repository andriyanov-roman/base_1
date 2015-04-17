package home_works.сompany.entities.company;

/**
 * Created by user on 17.04.2015.
 */
public class Developer extends Employee{
    private String languageName;


    public Developer() {

    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public Developer(Double salary, String gender, String languageName) {
        super(salary, gender);
        this.languageName = languageName;
    }

    @Override
    public String toString() {
        return getName() + " " + getSecondName() + " " + getSalary() + " " + languageName;
    }
}
