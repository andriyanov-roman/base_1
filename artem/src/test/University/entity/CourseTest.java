package University.entity;

/**
 * Created by R-Tem on 31.03.2015.
 */
public class CourseTest {
    private String courseTitle;
    private int creditHours;
    private double mark;

    public CourseTest(String courseTitle, int creditHours, double mark) {
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
        this.mark = mark;
    }

    public String getCourseTitle() {
        return courseTitle;
    }
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
    public int getCreditHours() {
        return creditHours;
    }
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    public double getMark() {
        return mark;
    }
    public void setMark(double mark) {
        this.mark = mark;
    }
}
