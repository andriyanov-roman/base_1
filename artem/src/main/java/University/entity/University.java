package University.entity;

import java.util.ArrayList;

/**
 * Created by R-Tem on 31.03.2015.
 */
public class University {
    protected String universityTitle;
    protected String status;
    protected String accreditation;
    protected int founded;
    protected double scholarship;
    protected ArrayList<Departament> departments;
    protected ArrayList<Student> students;
    protected ArrayList<Lecturer> lecturers;
}
