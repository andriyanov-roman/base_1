package inputOutput.university.readerHeirs;

import entity.university.Course;
import inputOutput.university.CommonReader;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by R-Tem on 01.04.2015.
 */
public class CourseReader extends CommonReader {
    public static final int COURSE_NAME = 0;
    public CourseReader(String path, String regExp) {
        super(path + "/courses.txt", regExp);
    }

    @Override
    public ArrayList readFromFile() throws IOException {
        ArrayList<String[]> string = super.readFromFile();
        ArrayList<Course> courses = new ArrayList<>();
        Runtime.getRuntime().gc();
        for (int i = 0; i < string.size(); i++) {
            Course c = new Course();
            c.setCourseTitle(string.get(i)[COURSE_NAME]);
            c.setCreditHours(Integer.valueOf(string.get(i)[1]));
            c.setMark(Integer.valueOf(string.get(i)[2]));
            courses.add(c);
        }
        return courses;
    }
}
