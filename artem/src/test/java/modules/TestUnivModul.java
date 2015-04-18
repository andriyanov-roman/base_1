package modules;

import entity.university.Course;
import entity.university.Lecturer;
import entity.university.Student;
import entity.university.University;
import inputOutput.university.CommonReader;
import inputOutput.university.readerHeirs.CourseReader;
import inputOutput.university.readerHeirs.LecturersReader;
import inputOutput.university.readerHeirs.StudentsReader;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by R-Tem on 18.04.2015.
 */
public class TestUnivModul {
    @Test
    public void testUnivIni() throws Exception {
        CommonReader courseReader = new CourseReader("E:\\2_Programing\\IdeaProjects\\base_1\\artem\\src\\main\\java\\data\\university\\courses.txt", ":");
        ArrayList<Course> courses = courseReader.readFromFile();
        CommonReader lecturersReader = new LecturersReader("E:\\2_Programing\\IdeaProjects\\base_1\\artem\\src\\main\\java\\data\\university\\lecturers.txt", ":");
        ArrayList<Lecturer> lecturers = lecturersReader.readFromFile();
        CommonReader studentsReader = new StudentsReader("E:\\2_Programing\\IdeaProjects\\base_1\\artem\\src\\main\\java\\data\\university\\students.txt",":");
        ArrayList<Student> students = studentsReader.readFromFile();

        ArrayList<University> universities = new ArrayList<>();
        University u = new University();
        u.setTitle(courses.get(0).getUnivTitle());
        universities.add(u);
        for (int i = 0; i < courses.size(); i++) {
            if(u.getTitle().equals(courses.get(i).getUnivTitle()));
            else{
                u.setTitle(courses.get(i).getUnivTitle());
                University univ = new University();
                univ.setTitle(courses.get(i).getUnivTitle());
                universities.add(univ);
            }
        }
        u.setTitle(courses.get(0).getUnivTitle());
        for (int i = 0; i < universities.size(); i++) {
            ArrayList<Lecturer> lect = new ArrayList<>();
            for (int j = 0; j < lecturers.size(); j++) {
                if(lecturers.get(j).getUnivTitle().equals(universities.get(i).getTitle())) {
                    lect.add(lecturers.get(j));
                }
            }
            universities.get(i).setLecturers(lect);
            ArrayList<Student> stu = new ArrayList<>();
            for (int j = 0; j < students.size(); j++) {
                if(students.get(j).getUnivTitle().equals(universities.get(i).getTitle())) {
                    stu.add(students.get(j));
                }
            }
            universities.get(i).setStudents(stu);
        }
        for (int i = 0; i < universities.size(); i++) {
            System.out.println(universities.get(i).toString());
        }
    }
    @Test
    public void testAddStudent() throws Exception {

    }
}
