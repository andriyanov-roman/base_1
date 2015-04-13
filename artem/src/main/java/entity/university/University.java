package entity.university;

import java.util.ArrayList;

/**
 * Created by R-Tem on 31.03.2015.
 */
public class University {
    private String title;
    private ArrayList<Course> courses;
    private ArrayList<Lecturer> lecturers;
    private ArrayList<Student> students;
    private Double progressAverage;
    protected String accreditation;
    protected int founded;
    protected double scholarship;

    public University(){}
    public University(String title, ArrayList<Lecturer> lecturers, ArrayList<Student> students) {
        this.title = title;
        this.lecturers = lecturers;
        this.students = students;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    public ArrayList<Lecturer> getLecturers() {
        return lecturers;
    }
    public void setLecturers(ArrayList<Lecturer> lecturers) {
        this.lecturers = lecturers;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public Double getProgressAverage() { return progressAverage; }
    public void setProgressAverage(Double progressAverage) { this.progressAverage = progressAverage; }

    @Override
    public String toString() {
        return title + lecturers + " " + students;
    }

}
