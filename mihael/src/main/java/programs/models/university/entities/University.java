package programs.models.university.entities;

import introduction.Array;

import java.util.ArrayList;

/**
 * Created by Администратор on 10.04.2015.
 */
public class University {
    private String universityName;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private ArrayList<Subject> subjects;

    public University(){}
    public University(String universityName, ArrayList<Teacher> teachers, ArrayList<Student> students, ArrayList<Subject> subjects) {
        this.universityName = universityName;
        this.teachers = teachers;
        this.students = students;
        this.subjects = subjects;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
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

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }
    public void addTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }

    @Override
    public String toString() {

        return "University{" +
                "universityName='" + universityName + '\'' +
                ", teachers=" + teachers +
                ", students=" + students +
                ", subjects=" + subjects +
                '}';
    }
}
