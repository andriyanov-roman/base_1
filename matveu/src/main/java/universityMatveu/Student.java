package universityMatveu;

import java.util.ArrayList;

public class Student extends Person {
    public ArrayList<Subject> subjects;

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public Student(){

    }

    public Student(String name, String secondName, ArrayList<Subject> subjects) {
        super(name, secondName);
        this.subjects = subjects;
    }
}
