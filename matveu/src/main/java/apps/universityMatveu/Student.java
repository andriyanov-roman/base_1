package apps.universityMatveu;

import java.util.ArrayList;

public class Student extends Person {
  private ArrayList<Subject>subjects;

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public Student() {
    }

    public Student(String name, String secondName, ArrayList<Subject> subjects) {
        super(name, secondName);
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "subjects=" + subjects +
                '}';
    }
}
