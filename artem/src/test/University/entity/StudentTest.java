package University.entity;

/**
 * Created by R-Tem on 31.03.2015.
 */
public class StudentTest {
    private String name;
    private String surname;
    private CourseTest[] courseTests;

    public StudentTest(String name, String surname, CourseTest[] courseTests) {
        this.name = name;
        this.surname = surname;
        this.courseTests = courseTests;
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
    public CourseTest[] getCourseTests() {
        return courseTests;
    }
    public void setCourseTests(CourseTest[] courseTests) {
        this.courseTests = courseTests;
    }
}