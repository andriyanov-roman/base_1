package io_tools;

import com.sun.istack.internal.FinalArrayList;
import introduction.Array;
import programs.models.university.entities.Student;
import programs.models.university.entities.Subject;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Администратор on 10.04.2015.
 */
public class StudentsWriterReader extends CommonWriterReader {
    String studentsPath = "mihael/src/main/java/programs/models/university/data/students.txt";
    String studentsRegEx = ":";
    ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> readStudents() throws IOException {
        return readStudents(studentsPath,studentsRegEx);
    }
    public ArrayList<Student> readStudents(String studentsPath,String studentsRegEx) throws IOException {
        ArrayList<String[]> strings = new ArrayList<>();
        strings = super.read(studentsPath, studentsRegEx);
        ArrayList<Student> students = new ArrayList<>();



        for(int i=0; i<strings.size();i++){
            Student student = new Student();
            ArrayList<Subject> subjects = new ArrayList<>();
            student.setStudentFirstName(strings.get(i)[0]);
            student.setStudentLastName(strings.get(i)[1]);

            for(int j=2; j<strings.get(i).length ; j+= 3){
                Subject subject = new Subject();
                subject.setSubjectName(strings.get(i)[j]);
                subject.setSubjectHours(Integer.parseInt(strings.get(i)[j + 1]));
                subject.setSubjectAssessment(Double.parseDouble(strings.get(i)[j + 2]));
                subjects.add(subject);
            }

            student.setStudentSubjects(subjects);
            students.add(student);
        }

        return students;
    }

}