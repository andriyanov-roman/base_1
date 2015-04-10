package entities.university;

import entities.Human;

import java.util.ArrayList;

/**
 * Created by mit_OK! on 04.04.2015.
 */
public class Student extends Human {
    private ArrayList<SubjectWithMark> subjectList;

    public ArrayList<SubjectWithMark> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<SubjectWithMark> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return " * Student: " +super.toString()+ subjectList;
    }
}
