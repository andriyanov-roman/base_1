package io_tools;

import programs.models.university.entities.Subject;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Администратор on 10.04.2015.
 */
public class SubjectWriterReader extends CommonWriterReader{
    ArrayList<Subject> subjects = new ArrayList<>();
    String teachersPath = "mihael/src/main/java/programs/models/university/data/subjects.txt";
    String teachersRegEx = ":";

    public ArrayList<Subject> readSubject() throws IOException{
        return readSubject(teachersPath, teachersRegEx);
    }

    public ArrayList<Subject> readSubject(String teachersPath,String teachersRegEx) throws IOException{
        ArrayList<String[]> strings = new ArrayList<>();
        strings = super.read(teachersPath, teachersRegEx);
        ArrayList<Subject> subjects = new ArrayList<>();

        for(int i=0; i<strings.size();i++){
            Subject subject = new Subject();
            subject.setSubjectName(strings.get(i)[0]);
            subject.setSubjectHours(Integer.parseInt(strings.get(i)[1]));
            if(strings.get(i)[2].equals("null")){
                subject.setSubjectAssessment(null);
            } else subject.setSubjectAssessment(Double.parseDouble(strings.get(i)[2]));

            subjects.add(subject);
        }
        return subjects;
    }

}
