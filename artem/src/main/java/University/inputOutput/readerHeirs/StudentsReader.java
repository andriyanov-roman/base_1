package University.inputOutput.readerHeirs;

import University.entity.Course;
import University.entity.Student;
import University.inputOutput.CommonReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by R-Tem on 02.04.2015.
 */
public class StudentsReader extends CommonReader{

    public StudentsReader(String path, String regExp) {
        super(path, regExp);
    }

    @Override
    public ArrayList readFromFile() throws IOException {
        CommonReader comRead = new CommonReader(super.getPath() + "/students.txt", super.getRegExp());
        ArrayList<String[]> strings = comRead.readFromFile();
        ArrayList<Student> students = new ArrayList<>();
        CommonReader cr = new CourseReader(super.getPath(), super.getRegExp());
        Random r = new Random();
        for (int i = 0; i < strings.size(); i++) {
            Student s = new Student();
            s.setName(strings.get(i)[0]);
            s.setSurname(strings.get(i)[1]);
            String[] pool = strings.get(i)[2].split(",");
            ArrayList<Course> stCourses = new ArrayList<>();
            ArrayList<Course> crCourses = cr.readFromFile();
            for (int j = 0; j < pool.length; j++) {
                for (int k = 0; k < crCourses.size(); k++) {
                    if (crCourses.get(k).getCourseTitle().equals(pool[j])) {
                        Course c = new Course(crCourses.get(k).getCourseTitle(), r.nextInt(crCourses.get(k).getCreditHours()), r.nextInt(Integer.valueOf(crCourses.get(k).getMark())));
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
