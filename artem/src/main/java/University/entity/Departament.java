package University.entity;

import java.util.ArrayList;

/**
 * Created by R-Tem on 01.04.2015.
 */
public class Departament {
    private String title;
    private ArrayList<Lecturer> lecturers;
    private ArrayList<Student> students;

    public Departament(String title, ArrayList<Lecturer> lecturers, ArrayList<Student> students) {
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
}
