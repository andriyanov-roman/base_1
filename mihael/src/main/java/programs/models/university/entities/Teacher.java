package programs.models.university.entities;

/**
 * Created by Администратор on 10.04.2015.
 */
public class Teacher {
    String teacherFirstName;
    String teacherSecondName;
    Double teacherSalary;
    Subject teacherSubject;

    public Teacher() {}
    public Teacher(String teacherFirstName, String teacherSecondName, Double teacherSalary, Subject teacherSubject) {
        this.teacherFirstName = teacherFirstName;
        this.teacherSecondName = teacherSecondName;
        this.teacherSalary = teacherSalary;
        this.teacherSubject = teacherSubject;
    }

    public String getTeacherFirstName() {
        return teacherFirstName;
    }

    public void setTeacherFirstName(String teacherFirstName) {
        this.teacherFirstName = teacherFirstName;
    }

    public String getTeacherSecondName() {
        return teacherSecondName;
    }

    public void setTeacherSecondName(String teacherSecondName) {
        this.teacherSecondName = teacherSecondName;
    }

    public Double getTeacherSalary() {
        return teacherSalary;
    }

    public void setTeacherSalary(Double teacherSalary) {
        this.teacherSalary = teacherSalary;
    }

    public Subject getTeacherSubject() {
        return teacherSubject;
    }

    public void setTeacherSubject(Subject teacherSubject) {
        this.teacherSubject = teacherSubject;
    }

    @Override
    public String toString() {
        String string;
        String regExp = ":";

        string = teacherFirstName + regExp + teacherSecondName + regExp + teacherSalary + regExp + teacherSubject.getSubjectName();

        return string;
    }
}
