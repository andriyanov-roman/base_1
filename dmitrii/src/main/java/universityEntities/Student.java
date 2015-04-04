package universityEntities;

import java.util.ArrayList;

/**
 * Created by mit_OK! on 04.04.2015.
 */
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
