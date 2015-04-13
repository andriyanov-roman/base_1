package inputOutput.university.readerHeirs;

import entity.university.Course;
import entity.university.Student;
import inputOutput.university.CommonReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by R-Tem on 02.04.2015.
 */
public class StudentsReader extends CommonReader{
    private static final int UNIV_TITLE = 0;
    private static final int STUDENT_NAME = 1;
    private static final int STUDENT_SURNAME = 2;
    private static final int COURSEMARK = 3;

    public StudentsReader(String path, String regExp) {
        super(path, regExp);
    }

    @Override
    public ArrayList<Student> readFromFile() throws IOException {
        ArrayList<String[]> strings = super.readFromFile();
        ArrayList<Student> students = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < strings.size(); i++) {
            Student s = new Student();
            s.setName(strings.get(i)[STUDENT_NAME]);
            s.setSurname(strings.get(i)[STUDENT_SURNAME]);
            s.setUnivTitle(strings.get(i)[UNIV_TITLE]);
            String[] pool = strings.get(i)[COURSEMARK].split(",");
            String[] courseTitle = new String[pool.length/2];
            String[] marks = new String[pool.length/2];
            for (int j = 0; j < pool.length/2; j++) {
                courseTitle[j] = pool[j*2];
                marks[j] = pool[(j+1)*2-1];
            }
            ArrayList<Course> stCourses = new ArrayList<>();
            CommonReader courseReader = new CourseReader("E:\\2_Programing\\IdeaProjects\\base_1\\artem\\src\\main\\java\\data\\university\\courses.txt", ":");
            ArrayList<Course> courses = courseReader.readFromFile();
            for (int j = 0; j < courseTitle.length; j++) {
                for (int k = 0; k < courses.size(); k++) {
                    if (courses.get(k).getCourseTitle().equals(courseTitle[j])&&courses.get(k).getUnivTitle().equals(s.getUnivTitle())) {
                        Course c = new Course(courses.get(k).getCourseTitle(), r.nextInt(courses.get(k).getCreditHours()), Integer.valueOf(marks[j]));
                        stCourses.add(c);
                    }
                }
            }
            s.setCourses(stCourses);
            students.add(s);
        }
        return students;
    }
}
