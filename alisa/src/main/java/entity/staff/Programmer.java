package entity.staff;

import entity.Employee;

/**
 * Created by user on 23.03.2015.
 */
public class Programmer extends Employee {

    private String languageName;


    public Programmer(String name, String surname, double salary, int age, String sex, String languageName) {
        super(name, surname, salary, age, sex);
        this.languageName = languageName;
    }

    public Programmer() {

    }


    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }


    public String toString() {
        return getName() + " " + getSurname() + " " + getSalary() + " " + languageName;
    }
}
