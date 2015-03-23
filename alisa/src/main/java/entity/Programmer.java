package entity;

/**
 * Created by user on 23.03.2015.
 */
public class Programmer {
    private String name;
    private String surname;
    private double salary;
    private String languageName;


    public Programmer(String name, String surname, double salary, String languageName) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.languageName = languageName;
    }
    public Programmer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", languageName='" + languageName + '\'' +
                '}';
    }
}
