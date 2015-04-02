package University.entity;

/**
 * Created by R-Tem on 31.03.2015.
 */
public class LecturerTest {
    private String name;
    private String surname;
    private CourseTest courseTest;
    private double salary;

    public LecturerTest(String name, String surname, CourseTest courseTest, double salary) {
        this.name = name;
        this.surname = surname;
        this.courseTest = courseTest;
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
    public CourseTest getCourseTest() {
        return courseTest;
    }
    public void setCourseTest(CourseTest courseTest) {
        this.courseTest = courseTest;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
