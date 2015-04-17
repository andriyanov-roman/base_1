package home_works.university.entity_university;

import entity.Human;

import java.util.ArrayList;

/**
 * Created by user on 17.04.2015.
 */
public class Student extends Human {
    private ArrayList<SubjectWithMarks> subjectList;

    public ArrayList<SubjectWithMarks> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<SubjectWithMarks> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return super.toString()+ subjectList;
    }
}
