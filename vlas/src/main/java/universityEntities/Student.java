package universityEntities;

import java.util.ArrayList;


public class Student extends Human {
    private ArrayList<Subject> subjectList;

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "subjectList=" + subjectList +
                '}';
    }
}
