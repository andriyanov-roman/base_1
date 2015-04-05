package homework.university;

import entity.university.University;
import inputOutput.university.CommonReader;
import inputOutput.university.readerHeirs.LecturersReader;
import inputOutput.university.readerHeirs.StudentsReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by R-Tem on 03.04.2015.
 */
public class Body {
    public static void start () throws IOException{
        View.view();
    }

    public static ArrayList<University> univIni() throws IOException{
        ArrayList<University> universities = new ArrayList<>();
        File f = new File("src/main/java/filesPackage/universities");
        String[] univs = f.list();
        for (int i = 0; i < univs.length; i++) {
            University u = new University();
            u.setTitle(String.valueOf(univs[i]));
            CommonReader lr = new LecturersReader("src/main/java/filesPackage/universities/"+String.valueOf(univs[i]), ":");
            u.setLecturers(lr.readFromFile());
            CommonReader sr = new StudentsReader("src/main/java/filesPackage/universities/"+String.valueOf(univs[i]), ":");
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
}