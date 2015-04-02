package University.entity;

import java.util.ArrayList;

/**
 * Created by R-Tem on 01.04.2015.
 */
public class DepartamentTest {
    private String title;
    private ArrayList<LecturerTest> lecturerTests;
    private ArrayList<StudentTest> studentTests;

    public DepartamentTest(String title, ArrayList<LecturerTest> lecturerTests, ArrayList<StudentTest> studentTests) {
        this.title = title;
        this.lecturerTests = lecturerTests;
        this.studentTests = studentTests;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public ArrayList<LecturerTest> getLecturerTests() {
        return lecturerTests;
    }
    public void setLecturerTests(ArrayList<LecturerTest> lecturerTests) {
        this.lecturerTests = lecturerTests;
    }
    public ArrayList<StudentTest> getStudentTests() {
        return studentTests;
    }
    public void setStudentTests(ArrayList<StudentTest> studentTests) {
        this.studentTests = studentTests;
    }
}
