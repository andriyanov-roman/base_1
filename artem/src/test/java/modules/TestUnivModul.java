package modules;

import entity.university.Course;
import entity.university.Lecturer;
import entity.university.Student;
import entity.university.University;
import inputOutput.university.CommonReader;
import inputOutput.university.readerHeirs.CourseReader;
import inputOutput.university.readerHeirs.LecturersReader;
import inputOutput.university.readerHeirs.StudentsReader;
import modules.consoleApp.university.UnivModule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        ArrayList<University> univs = UnivModule.univIni();
        Student student = new Student();
        System.out.println(" Select(type) University, please:");
        for (int i = 0; i < univs.size(); i++){ System.out.println(univs.get(i).getTitle()); }
        String univTitle = scanner.next();
        System.out.println(" Fill the fields, please!");
        scanner.useDelimiter("\n");
        System.out.print("Name: ");
        student.setName(scanner.next());
        System.out.print("Surname: ");
        student.setSurname(homework.Body.scanner.next());
        System.out.println("Courses list (enter several like this - Chemistry,75,Mathematics,85) ");
        CommonReader cr = new CourseReader("artem/src/main/java/files/universities/"+String.valueOf(univTitle), ":");
        ArrayList<Course> univCourses = cr.readFromFile();
        String s = homework.Body.scanner.next();
        String[] studentCoursesList = s.split(":");
        ArrayList<Course> studentCourses = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < studentCoursesList.length; i++) {
            String[] courseExemplar = studentCoursesList[i].split(",");
            String courseTitle = courseExemplar[0];
            Integer mark = Integer.valueOf(courseExemplar[1]);
            for (int j = 0; j < univCourses.size(); j++) {
                if (univCourses.get(j).getCourseTitle().equals(courseTitle)) {
                    Course c = new Course(univCourses.get(j).getCourseTitle(), r.nextInt(univCourses.get(j).getCreditHours()), mark);
                    studentCourses.add(c);
                }
            }
        }
        student.setCourses(studentCourses);
    }
}
