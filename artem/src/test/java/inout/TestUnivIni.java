package inout;

import entity.university.Course;
import entity.university.Lecturer;
import entity.university.Student;
import inputOutput.university.CommonReader;
import inputOutput.university.readerHeirs.CourseReader;
import inputOutput.university.readerHeirs.LecturersReader;
import inputOutput.university.readerHeirs.StudentsReader;
import org.junit.Test;

import java.util.ArrayList;


public class TestUnivIni {
    @Test
    public void testUnivIni() throws Exception {
        CommonReader courseReader = new CourseReader("E:\\2_Programing\\IdeaProjects\\base_1\\artem\\src\\main\\java\\data\\university\\courses.txt", ":");
        ArrayList<Course> courses = courseReader.readFromFile();
        CommonReader lecturersReader = new LecturersReader("E:\\2_Programing\\IdeaProjects\\base_1\\artem\\src\\main\\java\\data\\university\\lecturers.txt", ":");
        ArrayList<Lecturer> lecturers = lecturersReader.readFromFile();
        CommonReader studentsReader = new StudentsReader("E:\\2_Programing\\IdeaProjects\\base_1\\artem\\src\\main\\java\\data\\university\\students.txt",":");
        ArrayList<Student> students = studentsReader.readFromFile();

        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i).getUnivTitle() + courses.get(i).getCourseTitle());
        }
        System.out.println("\n");
        for (int i = 0; i < lecturers.size(); i++) {
            System.out.println(lecturers.get(i).getUnivTitle() + lecturers.get(i).getName());
        }
        System.out.println("\n");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getUnivTitle() + students.get(i).getName());
        }
    }
}
