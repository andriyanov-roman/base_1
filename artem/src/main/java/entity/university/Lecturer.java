package entity.university;

/**
 * Created by R-Tem on 31.03.2015.
 */
public class Lecturer {
    private String name;
    private String surname;
    private String course;
    private double salary;

    public Lecturer(String name, String surname, String course, double salary) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.salary = salary;
    }
    public Lecturer(){}

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
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + course + " " + salary;
    }
}
