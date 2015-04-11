package programs.models.university.entities;

import java.util.ArrayList;

/**
 * Created by Администратор on 10.04.2015.
 */
public class Student {
    private String studentFirstName;
    private String studentLastName;
    private ArrayList<Subject> studentSubjects;
    public Student() {}
    public Student(String studentFirstName, String studentLastName, ArrayList<Subject> studentSubjects) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentSubjects = studentSubjects;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public ArrayList<Subject> getStudentSubjects() {
        return studentSubjects;
    }

    public void setStudentSubjects(ArrayList<Subject> studentSubjects) {
        this.studentSubjects = studentSubjects;
    }

    @Override
    public String toString() {
        String string;
        String regExp = ":";

        string = studentFirstName + regExp + studentLastName + regExp;

        for (int i =0; i< studentSubjects.size(); i++){
            if(i != 0){string = string + regExp;}
            string =  string  + studentSubjects.get(i).getSubjectName() + regExp + studentSubjects.get(i).getSubjectHours()+regExp+ studentSubjects.get(i).getSubjectAssessment();
        }

        return string;
    }
}
