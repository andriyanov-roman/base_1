package entity.university;

/**
 * Created by R-Tem on 31.03.2015.
 */
public class Course {
    private String courseTitle;
    private int creditHours;
    private int mark;

    public Course(String courseTitle, int creditHours, int mark) {
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
        this.mark = mark;
    }
    public Course(){}// это конструктор работающий как по умолчанию, но его нужно прописывать если создан искусственный

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
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return courseTitle + " " + creditHours + " " + mark;
    }
}
