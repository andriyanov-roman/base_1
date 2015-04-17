package universityMatveu;

import java.util.ArrayList;

public class University {
    private String nameUniver;
    public ArrayList<Person> persons;
    public ArrayList<Professor> professors;
    public ArrayList<Student> students;

    public String getNameUniver() {
        return nameUniver;
    }

    public void setNameUniver(String nameUniver) {
        this.nameUniver = nameUniver;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(ArrayList<Professor> professors) {
        this.professors = professors;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
