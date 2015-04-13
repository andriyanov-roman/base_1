package entity.university;

import java.util.ArrayList;

/**
 * Created by R-Tem on 31.03.2015.
 */
public class Student {
    private String name;
    private String surname;
    private ArrayList<Course> courses;
    private String univTitle;

    public Student(String name, String surname, ArrayList<Course> courses) {
        this.name = name;
        this.surname = surname;
        this.courses = courses;
    }
    public Student(){}

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
    public ArrayList<Course> getCourses() {
        return courses;
    }
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    public String getUnivTitle() {
        return univTitle;
    }
    public void setUnivTitle(String univTitle) {
        this.univTitle = univTitle;
    }

    @Override
    public String toString() {
        return name +" "+ surname +" "+ courses.toString();
    }
}