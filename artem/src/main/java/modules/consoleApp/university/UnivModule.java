package modules.consoleApp.university;

import entity.university.Course;
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

/**
 * Created by R-Tem on 03.04.2015.
 */
public class UnivModule {
    public static ArrayList<University> univIni() throws IOException{
        ArrayList<University> universities = new ArrayList<>();
        File f = new File("src/main/java/files/universities");
        String[] univs = f.list();
        for (int i = 0; i < univs.length; i++) {
            University u = new University();
            u.setTitle(String.valueOf(univs[i]));
            CommonReader lr = new LecturersReader("src/main/java/files/universities/"+String.valueOf(univs[i]), ":");
            u.setLecturers(lr.readFromFile());
            CommonReader sr = new StudentsReader("src/main/java/files/universities/"+String.valueOf(univs[i]), ":");
            u.setStudents(sr.readFromFile());
            universities.add(u);
        }
        return universities;
    }
    public static University getMaxProgressUniv() throws IOException{
        ArrayList<University> universities = univIni();
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
    public static Student addStudent() throws  IOException{
        Student student = new Student();
        System.out.println(" Select University, please:");
        File f = new File("E:\\2_Programing\\IdeaProjects\\base_1\\artem\\src\\main\\java\\files\\universities");
        String[] univs = f.list();
        for (int i = 0; i < univs.length; i++){ System.out.println(univs[i]); }
        String univTitle = homework.Body.scanner.next();
        boolean b = false;
        for (int i = 0; i < univs.length; i++) { if(univs[i].equals(univTitle)) { b = true; } }
        if(b){
            System.out.println(" Fill the fields, please!");
            homework.Body.scanner.useDelimiter("\n");
            System.out.print("Name: ");
            student.setName(homework.Body.scanner.next());
            System.out.print("Surname: ");
            student.setSurname(homework.Body.scanner.next());
            System.out.println("Courses list (enter several like this - Chemistry,75:Mathematics,85) ");
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
        } else {addStudent();}
        return student;
    }
}