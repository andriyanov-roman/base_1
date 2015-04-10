package io_tools;

import programs.models.university.entities.Subject;
import programs.models.university.entities.Teacher;

import java.io.IOException;
import java.util.ArrayList;


/**
 * Created by Администратор on 10.04.2015.
 */
public class TeachersWriterReader extends CommonWriterReader {
    ArrayList<Teacher> teachers = new ArrayList<>();
    String teachersPath = "mihael/src/main/java/programs/models/university/data/teachers.txt";
    String teachersRegEx = ":";

    public ArrayList<Teacher> readTeachers()throws IOException{
        return readTeachers(teachersPath,teachersRegEx);
    }

    public ArrayList<Teacher> readTeachers(String teachersPath,String teachersRegEx) throws IOException

    {
        ArrayList<Teacher> teachers = new ArrayList<>();

        ArrayList<String[]> strings = new ArrayList<>();
        strings = super.read(teachersPath, teachersRegEx);
        SubjectWriterReader subjetWR = new SubjectWriterReader();
        ArrayList<Subject> allSubjects = new ArrayList<>();
        allSubjects = subjetWR.readSubject();

        for(int i=0; i<strings.size();i++){
            Teacher teacher = new Teacher();
            Subject subject = new Subject();
            teacher.setTeacherFirstName(strings.get(i)[0]);
            teacher.setTeacherSecondName(strings.get(i)[1]);
            teacher.setTeacherSalary(Double.parseDouble(strings.get(i)[2]));
            String subjectString = strings.get(i)[3];


            for(Subject curSubject: allSubjects){
                if(subjectString.equals(curSubject.getSubjectName())){
                    subject = curSubject;
                }
            }
            teacher.setTeacherSubject(subject);

            teachers.add(teacher);
        }


        return teachers;
    }
}