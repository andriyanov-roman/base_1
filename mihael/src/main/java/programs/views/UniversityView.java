package programs.views;

import io_tools.StudentsWriterReader;
import programs.models.university.entities.Student;
import programs.models.university.entities.Subject;
import programs.models.university.entities.Teacher;
import programs.models.university.entities.University;

import java.util.ArrayList;

/**
 * Created by Администратор on 10.04.2015.
 */
public class UniversityView {
    public void showStudent(Student student){
        System.out.println(student.toString());
    }
    public void showStudents(ArrayList<Student> students){
        for(Student student: students){
            showStudent(student);
        }
    }

    public void showTeacher (Teacher teacher){
        System.out.println(teacher);
    }
    public void showTeachers(ArrayList<Teacher> teachers){
        for(Teacher teacher: teachers){
            showTeacher(teacher);
        }
    }

    public void showSubject(Subject subject) {
        System.out.println(subject.toString());
    }
    public void showSubjects(ArrayList<Subject> subjects){
        for(Subject subject: subjects){
            showSubject(subject);
        }
    }

    public  void showUniversity(University university){
        System.out.println(university.toString());
    }
    public void showUniversities(ArrayList<University> universities){
        for(University university : universities){
            showUniversity(university);
        }
    }

}
