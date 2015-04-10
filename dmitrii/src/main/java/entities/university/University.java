package entities.university;

import java.util.ArrayList;

/**
 * Created by mit_OK! on 04.04.2015.
 */
public class University {
    private String uniName;
    private ArrayList<Subject> subjects;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "University \'" + uniName + '\'' +
                "\nSUBJECTS: " + subjects +
                "\nTEACHERS: " + teachers +
                "\nSTUDENTS: " + students;
    }
}
