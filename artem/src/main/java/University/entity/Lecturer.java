package University.entity;

/**
 * Created by R-Tem on 31.03.2015.
 */
public class Lecturer {
    private String name;
    private String surname;
    private Course course;
    private double salary;

    public Lecturer(String name, String surname, Course course, double salary) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.salary = salary;
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
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
