package programs;

import io_tools.*;
import programs.models.university.entities.Student;
import programs.models.university.entities.Subject;
import programs.models.university.entities.Teacher;
import programs.models.university.entities.University;
import programs.views.UniversityView;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Администратор on 10.04.2015.
 */
public class UniversityRun {
    public static void startUniversity() throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Subject> subjects = new ArrayList<>();
        ArrayList<University> universities = new ArrayList<>();
        TeachersWriterReader teacherWriterReader= new TeachersWriterReader();
        StudentsWriterReader studentsWriteReader = new StudentsWriterReader();
        SubjectWriterReader subjectWriterReader =new SubjectWriterReader();
        UniversityWriterReader universitiesWriterReader = new UniversityWriterReader();
        students = studentsWriteReader.readStudents();
        teachers = teacherWriterReader.readTeachers();
        subjects = subjectWriterReader.readSubject();
        universities = universitiesWriterReader.readUniversities();
        UniversityView univView = new UniversityView();
        univView.showStudents(students);
        univView.showSubjects(subjects);
        univView.showTeachers(teachers);
        univView.showUniversities(universities);
    }
}
