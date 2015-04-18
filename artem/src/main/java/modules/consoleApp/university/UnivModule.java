package modules.consoleApp.university;

import entity.university.Course;
import entity.university.Lecturer;
import entity.university.Student;
import entity.university.University;
import inputOutput.university.CommonReader;
import inputOutput.university.readerHeirs.CourseReader;
import inputOutput.university.readerHeirs.LecturersReader;
import inputOutput.university.readerHeirs.StudentsReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by R-Tem on 03.04.2015.
 */
public class UnivModule {
    protected Scanner scanner;
    public static ArrayList<University> univIni() throws IOException{
        ArrayList<University> universities = new ArrayList<>();
        CommonReader courseReader = new CourseReader("E:\\2_Programing\\IdeaProjects\\base_1\\artem\\src\\main\\java\\data\\university\\courses.txt", ":");
        ArrayList<Course> courses = courseReader.readFromFile();
        CommonReader lecturersReader = new LecturersReader("E:\\2_Programing\\IdeaProjects\\base_1\\artem\\src\\main\\java\\data\\university\\lecturers.txt", ":");
        ArrayList<Lecturer> lecturers = lecturersReader.readFromFile();
        CommonReader studentsReader = new StudentsReader("E:\\2_Programing\\IdeaProjects\\base_1\\artem\\src\\main\\java\\data\\university\\students.txt",":");
        ArrayList<Student> students = studentsReader.readFromFile();
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
        return universities;
    }
    public static University getMaxProgressUniv() throws IOException{
        ArrayList<University> universities = UnivModule.univIni();
        for (int i = 0; i < universities.size(); i++) {
            ArrayList<Double> eachStudentAverage = new ArrayList<>();
            for (int j = 0; j < universities.get(i).getStudents().size(); j++) {
                ArrayList<Integer> marks = new ArrayList<>();
                for (int k = 0; k < universities.get(i).getStudents().get(j).getCourses().size(); k++) {
                    marks.add(universities.get(i).getStudents().get(j).getCourses().get(k).getMark());
                }
                int m = marks.get(0);
                for (int a = 1; a < marks.size(); a++) { m = m + marks.get(a); }
                double average = m/marks.size();
                eachStudentAverage.add(average);
            }
            double d = eachStudentAverage.get(0);
            for (int b = 1; b < eachStudentAverage.size(); b++) {d = d + eachStudentAverage.get(b); }
            double average1 = d/eachStudentAverage.size();
            universities.get(i).setProgressAverage(average1);
        }
        for (int i = universities.size()-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(universities.get(j).getProgressAverage()>=universities.get(j+1).getProgressAverage()){
                    University u = universities.get(j);
                    universities.set(j, universities.get(j+1));
                    universities.set(j+1, u);
                }
            }
        }
        University maxProgressUniv = universities.get(universities.size()-1);
        return maxProgressUniv;
    }
    public static Student addStudent(Scanner scanner) throws  IOException{
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
        return student;
    }
}