package io_tools;

import programs.models.university.entities.Student;
import programs.models.university.entities.University;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Администратор on 10.04.2015.
 */
public class UniversityWriterReader extends CommonWriterReader {
    ArrayList<University> universities= new ArrayList<>();
    String universitiesPath = "mihael/src/main/java/programs/models/university/data/universities.txt";
    String uniStudentsPath = "mihael/src/main/java/programs/models/university/data/uni.students.txt";
    String uniTeachersPath = "mihael/src/main/java/programs/models/university/data/uni.teachers.txt";
    String uniRegEx = ":";


    public ArrayList<University> readUniversities() throws IOException {
        universities = readUniversitiesNames();
        universities = readUniversitiesStudents();

        return universities;
    }


    public ArrayList<University> readUniversitiesNames() throws IOException {
        return readUniversitiesNames(universitiesPath,uniRegEx);
    }

    public ArrayList<University> readUniversitiesNames(String universitiesPath, String uniRegEx) throws IOException {
        University university = new University();
        ArrayList<String[]> strings = new ArrayList<>();
        strings = super.read(universitiesPath, uniRegEx);
        for(int i=0; i<strings.size();i++){
            university.setUniversityName(strings.get(i)[0]);
            System.out.println(university);
            universities.add(university);
        }
        return universities;
    }
    public ArrayList<University> readUniversitiesStudents() throws IOException {
        return readUniversitiesNames(uniStudentsPath,uniRegEx);
    }

    public ArrayList<University> readUniversitiesStudents(String uniStudentsPath, String uniRegEx) throws IOException {
        StudentsWriterReader studentsWriterReader = new StudentsWriterReader();
        ArrayList<Student> students = studentsWriterReader.readStudents();
        String uniName;
        ArrayList<String[]> strings = new ArrayList<>();
        strings = super.read(universitiesPath, uniRegEx);
        for(int i=0; i<strings.size();i++){
            uniName =strings.get(i)[0] ;
            for(University university : universities){
                if(uniName.equals(universities.get(i).getUniversityName())){

                    for(int j=1;j<strings.get(i).length;j+=2){
                        String studentFullName = strings.get(i)[j] + " "+ strings.get(i)[j+1];
                        for(Student student: students){

                            if((student.getStudentFirstName() +" " + student.getStudentLastName()).equals(studentFullName)){
                                universities.get(i).addStudent(student);
                            }
                        }

                    }


                }
            }
        }
        return universities;
    }

    public ArrayList<University> readUniversitiesTeachers() throws IOException {
        return readUniversitiesNames(uniTeachersPath,uniRegEx);
    }

    public ArrayList<University> readUniversitiesTeachers(String uniTeachersPath, String uniRegEx) throws IOException {
        University university = new University();
        ArrayList<String[]> strings = new ArrayList<>();
        strings = super.read(universitiesPath, uniRegEx);
        for(int i=0; i<strings.size();i++){
            university.setUniversityName(strings.get(i)[0]);
            universities.add(university);
        }
        return universities;
    }

}